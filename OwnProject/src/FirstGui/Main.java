package FirstGui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener, KeyListener {
  
	private static JLabel userLabel; 
	private static JButton button;
	private static JLabel passwordLabel; 
	private static JLabel success;
	private static JTextField userText;
	private static  JPasswordField passwordText;
	private int loginAttempts = 0;

	
	
	public static void main(String[] args) {		  
			
			JPanel panel = new JPanel();
			JFrame frame = new JFrame();
			frame.setSize(300, 150);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.add(panel);
			
			 panel.setLayout(null);
			 
			 userLabel = new JLabel("User");
			 userLabel.setBounds(10, 20, 80, 25);
			 panel.add(userLabel);
			 
			 userText = new JTextField();
			 userText.setBounds(100, 20, 165, 25);
			 panel.add(userText);
			 
			 passwordLabel = new JLabel("Password");		
			 passwordLabel.setBounds(10, 50, 80, 25);
			 panel.add(passwordLabel);
			 
			 passwordText = new JPasswordField();
			 passwordText.setBounds(100, 50 ,165, 25);
			 panel.add(passwordText);
			 
			 button = new JButton("Login");
			 button.setBounds(10, 80, 80, 25);
			 
			 button.addActionListener(new Main());
			 button.addKeyListener(new Main());
			 panel.add(button);
			 
			 success = new JLabel("");
			 success.setBounds(10, 110, 300, 25);
			 panel.add(success);
			 
			 frame.setVisible(true);{

		
		
			 }
		}
	@Override
		public void keyTyped(KeyEvent e) {}
		
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				performLogin();
			}
		}
	
		public void keyReleased(KeyEvent e) {}
	

	private void performLogin() {
			// TODO Auto-generated method stub
			
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.print(user + " ," + password);

        if (user.equals("John.Palaganas") && password.equals("jeremy123!!")) {
        	
        JOptionPane.showMessageDialog(this, "Login Successful!");
        dispose(); // Close the window
        } else {
            // Login failed
            JOptionPane.showMessageDialog(this, "Incorrect username or password. Please try again.");
            loginAttempts++;

        if (loginAttempts == 2) {
            // Too many login attempts, close the window
        JOptionPane.showMessageDialog(this, "Too many login attempts. The application will now exit.");
        System.exit(0);
		
        	}
        }
	}

				
	{
		
	}
}
