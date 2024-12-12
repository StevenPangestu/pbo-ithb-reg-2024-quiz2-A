package Controller;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class checkLogin {
    static DatabaseHandler conn = new DatabaseHandler();

    public checkLogin(String email, String pw) {
        check(email, pw);
    }

    public void check(String email, String pw) {
        String loginEmail = "";
        String password = "";

        try {

            conn.connect();
            String query = "SELECT * FROM users where email='" + email + "' && password='" + pw + "'";

            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                loginEmail = rs.getString("email");
                password = rs.getString("password");
            }
            if (loginEmail.equals(email) && password.equals(pw)) {
                JOptionPane.showMessageDialog(null, "Berhasil Login!");
                // show menu book list nanti
            } else if (loginEmail.equals(email) && (!password.equals(pw))) {
                JOptionPane.showMessageDialog(null, "Password salah");

            } else if ((!loginEmail.equals(email)) && password.equals(pw)) {
                JOptionPane.showMessageDialog(null, "email salah");

            } else {
                JOptionPane.showMessageDialog(null, "email dan password salah", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }

}
