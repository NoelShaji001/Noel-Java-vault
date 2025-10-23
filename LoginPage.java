package bookStall;

import javax.swing.*;
import java.awt.*;

public class LoginPage {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginPage::new);
    }

    public LoginPage() {
        JFrame mainFrame = new JFrame("Login Window");
        mainFrame.setSize(500, 250);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(usernameLabel, gbc);
        gbc.gridx = 1;
        panel.add(usernameField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(passwordLabel, gbc);
        gbc.gridx = 1;
        panel.add(passwordField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(loginButton, gbc);

        mainFrame.add(panel);
        mainFrame.setVisible(true);

        // --- LOGIN LOGIC ---
        loginButton.addActionListener(e -> {
            String user = usernameField.getText().trim();
            String pass = new String(passwordField.getPassword());

            // You can change this to check from a file or DB later
            if (user.equals("admin") && pass.equals("1234")) {
                JOptionPane.showMessageDialog(mainFrame, "Login Successful!");

                // Close login window
                mainFrame.dispose();

                // Open main GUI
                SwingUtilities.invokeLater(() -> {
                    BookStallManagementSystem mainApp = new BookStallManagementSystem();
                    mainApp.setVisible(true);
                });

            } else {
                JOptionPane.showMessageDialog(mainFrame,
                        "Invalid Username or Password",
                        "Login Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
