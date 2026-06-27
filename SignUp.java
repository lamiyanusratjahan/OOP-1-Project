
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SignUp extends JFrame {
    private JTextField nameField, emailField;
    private JPasswordField passwordField;
    private JButton signUpButton, cancelButton;
	private JPanel panel;

    public SignUp() {
        
		
		setTitle("Sign Up ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
        //setLayout(null);
		setVisible(true);
		
		panel = new JPanel();
		panel.setSize(400,300);
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		add(panel);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 80, 25);
		nameLabel.setForeground(Color.YELLOW);
        panel.add(nameLabel);
		
		
        nameField = new JTextField();
        nameField.setBounds(120, 30, 230, 30);
		nameField.setForeground(Color.YELLOW);
		nameField.setBackground(Color.DARK_GRAY);
        panel.add(nameField);


        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(30, 70, 80, 25);
		emailLabel.setForeground(Color.YELLOW);
        panel.add(emailLabel);
		
		
        emailField = new JTextField();
        emailField.setBounds(120, 70, 230, 30);
		emailField.setForeground(Color.YELLOW);
		emailField.setBackground(Color.DARK_GRAY);
        panel.add(emailField);


        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(30, 110, 80, 25);
		passwordLabel.setForeground(Color.YELLOW);
        panel.add(passwordLabel);
		
		
        passwordField = new JPasswordField();
        passwordField.setBounds(120, 110, 230, 30);
		passwordField.setForeground(Color.YELLOW);
		passwordField.setBackground(Color.DARK_GRAY);
        panel.add(passwordField);

        signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(220, 180, 100, 30);
		panel.add(signUpButton);
		
		
		cancelButton = new JButton("Cancel");
        cancelButton.setBounds(70, 180, 100, 30);
		panel.add(cancelButton);
		
		
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				
				try {
					//if all fields are not filled then->
					if(nameField.getText().equals("") && emailField.getText().equals("") && passwordField.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the fields");
					}
					//if only name is filled then->
					else if(!(nameField.getText().equals("")) && emailField.getText().equals("") && passwordField.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the fields");
					}
					
					//if only email is filled then->
					else if(nameField.getText().equals("") && !(emailField.getText().equals("")) && passwordField.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the fields");
					}
					
					//if only password is filled then->
					else if(nameField.getText().equals("") && emailField.getText().equals("") && !(passwordField.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill all the fields");
					}
					
					//if only name and email is filled then->
					else if(!(nameField.getText().equals("")) && !(emailField.getText().equals("")) && passwordField.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the fields");
					}
					
					//if only name and password is filled then->
					else if(!(nameField.getText().equals("")) && emailField.getText().equals("") && !(passwordField.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill all the fields");
					}
					
					//if only email and password is filled then->
					else if(nameField.getText().equals("") && !(emailField.getText().equals("")) && !(passwordField.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill all the fields");
					}
					
					else{
						FileWriter fw = new FileWriter("SignUpInformation.txt",true);
						fw.write(nameField.getText() + "\t" + emailField.getText() + "\t" + passwordField.getText() + "\n");
						fw.close();
						JOptionPane.showMessageDialog(null, "SignUp Successful.");
						setVisible(false);
						new Login();
					}
				}
				catch(IOException ex){}
			}
        });
		
		cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				
				new HotelManagementSystem();
				setVisible(false);
			}
		});	
    }

    public static void main(String[] args) {
        
        new SignUp();
    }
}
