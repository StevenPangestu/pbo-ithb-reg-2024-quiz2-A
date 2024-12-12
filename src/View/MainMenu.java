package View;

import javax.swing.JFrame;

public class MainMenu {

    public MainMenu() {
        showMainMenu();
    }

    public void showMainMenu() {
        JFrame frame = new JFrame();
        frame.setBounds(50, 50, 350, 350);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}
