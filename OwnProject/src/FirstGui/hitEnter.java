package FirstGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class hitEnter extends JFrame implements ActionListener, KeyListener {
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private int loginAttempts = 0;

    public hitEnter() {
        // Set up the GUI components
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        usernameTextField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        passwordField.addKeyListener(this);

        // Create the layout
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(usernameLabel);
        panel.add(usernameTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(loginButton);

        // Add the panel to the frame
        add(panel);

        // Set the frame properties
        setTitle("Login");
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            performLogin();
        }
    }

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            performLogin();
        }
    }

    public void keyReleased(KeyEvent e) {}

    private void performLogin() {
        // Get the user input
        String username = usernameTextField.getText();
        String password = new String(passwordField.getPassword());

        // Check the credentials
        if (username.equals("admin") && password.equals("password")) {
            // Login successful
            JOptionPane.showMessageDialog(this, "Login successful.");
            dispose(); // Close the window
        } else {
            // Login failed
            JOptionPane.showMessageDialog(this, "Incorrect username or password. Please try again.");
            loginAttempts++;

            if (loginAttempts == 3) {
                // Too many login attempts, close the window
                JOptionPane.showMessageDialog(this, "Too many login attempts. The application will now exit.");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        hitEnter gui = new hitEnter();
    }
}
