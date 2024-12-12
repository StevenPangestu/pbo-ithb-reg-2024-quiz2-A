package Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Classes.Books;
import Model.Classes.Users;

public class inputTransaction {
    static DatabaseHandler conn = new DatabaseHandler();

    public inputTransaction(int book, int id) {
        input(book, id);
    }

    public boolean input(int book, int id) {

        String query = "INSERT INTO transactions (user_id, book_id) VALUES (?, ?)";

        try {

            conn.connect();
            PreparedStatement stmt = conn.con.prepareStatement(query);

            stmt.setInt(1, id);
            stmt.setInt(2, book.getId());

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {

            e.printStackTrace();
            return false;

        } finally {

            conn.disconnect();

        }

    }
}
