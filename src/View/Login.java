package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controller.checkLogin;

public class Login {

    public Login() {
        showLogin();
    }

    public void showLogin() {
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 350, 350);

        JLabel labelEmail = new JLabel("Email");
        labelEmail.setBounds(50, 50, 50, 30);
        frame.add(labelEmail);

        JTextField emailField = new JTextField();
        emailField.setBounds(140, 50, 80, 30);
        frame.add(emailField);

        JLabel labelPassword = new JLabel("Password");
        labelPassword.setBounds(50, 90, 80, 30);
        frame.add(labelPassword);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(140, 90, 80, 30);
        frame.add(passwordField);

        JButton loginBtn = new JButton("LOGIN");
        loginBtn.setBounds(140, 140, 120, 30);
        frame.add(loginBtn);

        loginBtn.addActionListener(e -> {
            String email = emailField.getText();
            String password = String.valueOf(passwordField.getPassword());

            new checkLogin(email, password);
            frame.dispose();
            new printBooks();
        });

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
