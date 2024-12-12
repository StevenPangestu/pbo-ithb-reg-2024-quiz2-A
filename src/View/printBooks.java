package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controller.inputTransaction;
import Controller.showBooks;
import Model.Classes.Books;

public class printBooks {

    public printBooks() {
        showAllBooks();
    }

    public void showAllBooks() {
        showBooks books = new showBooks();

        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 500, 700);

        JButton TransactionBtn = new JButton("Transaction");
        TransactionBtn.setBounds(70, 40, 120, 30);
        frame.add(TransactionBtn);
        new showBooks();

        Books books2 = books.getBooks();
        JLabel titleLabel = new JLabel(" Title : " + books2.getTitle());
        titleLabel.setBounds(30, 70, 120, 30);
        frame.add(titleLabel);

        JLabel authorLabel = new JLabel(" Author : " + books2.getAuthor());
        authorLabel.setBounds(30, 120, 120, 30);
        frame.add(authorLabel);

        JLabel genreLabel = new JLabel(" Genre : " + books2.getGenre());
        genreLabel.setBounds(30, 170, 120, 30);
        frame.add(genreLabel);

        JLabel priceLabel = new JLabel(" Price : " + books2.getPrice());
        priceLabel.setBounds(30, 220, 120, 30);
        frame.add(priceLabel);

        JButton buyBookBtn = new JButton("Buy Book");
        buyBookBtn.setBounds(70, 270, 120, 30);
        frame.add(buyBookBtn);

        buyBookBtn.addActionListener(e -> {
            // String title = books2.getTitle();
            // String author = books2.getAuthor();
            // String Genre = books2.getGenre();
            // int price = books2.getPrice();

            JTextField fieldUserID = new JTextField();
            fieldUserID.setBounds(70, 330, 90, 30);
            frame.add(fieldUserID);
            int userId = Integer.parseInt(fieldUserID.getText());

            frame.dispose();
            new inputTransaction(books2.getId(), userId);
        });
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
