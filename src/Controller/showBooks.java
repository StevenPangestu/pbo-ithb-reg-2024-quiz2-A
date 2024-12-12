package Controller;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.Classes.Books;

public class showBooks {
    static DatabaseHandler conn = new DatabaseHandler();

    public showBooks() {
        getBooks();
    }

    public static Books getBooks() {

        Books books = new Books();

        try {

            conn.connect();
            String query = "SELECT * FROM books";
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {

                do {
                    books.setTitle(rs.getString("title"));
                    books.setAuthor(rs.getString("author"));
                    books.setGenre(rs.getString("genre"));
                    books.setPrice(rs.getInt("price"));

                } while (rs.next());

            } else {

                return null;

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        conn.disconnect();
        return books;

    }
}
