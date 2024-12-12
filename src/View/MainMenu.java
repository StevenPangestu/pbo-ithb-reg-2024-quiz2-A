package View;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainMenu {

    public MainMenu() {
        showMainMenu();
    }

    public void showMainMenu() {
        JFrame frame = new JFrame();
        frame.setTitle("Main Menu");
        frame.setBounds(0, 0, 450, 450);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);

        JButton loginBtn = new JButton("LOGIN");
        loginBtn.setBounds(10, 130, 200, 50);
        frame.add(loginBtn);

        loginBtn.addActionListener(e -> {
            frame.dispose();
            new Login();
        });

        JButton daftarBukuButton = new JButton("DAFTAR BUKU");
        daftarBukuButton.setBounds(10, 200, 200, 50);
        frame.add(daftarBukuButton);

        daftarBukuButton.addActionListener(e -> {
            frame.dispose();
            new printBooks();
        });

        JButton transaksiBtn = new JButton("TRANSAKSI PEMBELIAN");
        transaksiBtn.setBounds(10, 270, 200, 50);
        frame.add(transaksiBtn);

        transaksiBtn.addActionListener(e -> {
            frame.dispose();
            // new transaksiPembelian();
        });
    }
}
