package Controller;

// import Model.Classes.Kartu;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBController {

    static DatabaseHandler conn = new DatabaseHandler();

    // SEARCH/GET KTP
    public static Kartu getKartu(String nik) {

        Kartu kartu = new Kartu();

        try {

            conn.connect();
            String query = "SELECT * FROM ktp WHERE NIK='" + nik + "'";
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {

                do {

                    kartu.setNama(rs.getString("Nama"));
                    kartu.setJenisKelamin(rs.getString("jenisKelamin"));
                    kartu.setTglLahir(rs.getString("tglLahir"));

                    kartu.setPhotoFile(new File(rs.getString("photoFile")));

                } while (rs.next());

            } else {

                return null;

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        conn.disconnect();
        return kartu;

    }

    // INSERT
    public static boolean insertNewUser(Kartu kartu) {

        String query = "INSERT INTO kartu (Nama,jenisKelamin,tglLahir,photoFile) VALUES (?, ?, ?, ?)";

        try {

            conn.connect();
            PreparedStatement stmt = conn.con.prepareStatement(query);
            System.out.println(conn.con);
            stmt.setString(1, kartu.getNama());
            stmt.setString(2, kartu.getJenisKelamin());
            stmt.setString(3, kartu.getTglLahir());
            stmt.setString(4, kartu.getPhotoFile().getPath());
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
