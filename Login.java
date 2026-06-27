// Rajbir


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;


public class Login extends JFrame{
	
	Login(){
		
		JFrame frame = new JFrame("Login");
		frame.setSize(500,280);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(600,280);
		panel.setVisible(true);
		panel.setBackground(Color.BLACK);
		
		JLabel l1,l2;
		
		l1 = new JLabel("User ID : ");
		l1.setBounds(40,50,300,30);
		l1.setForeground(Color.YELLOW);
		panel.add(l1);
		
		l2 = new JLabel("Password : ");
		l2.setBounds(40,100,300,30);
		l2.setForeground(Color.YELLOW);
		panel.add(l2);
		
		JTextField t1;
		JPasswordField p1;
	
		t1 = new JTextField();
		t1.setBounds(120,50,300,30);
		t1.setForeground(Color.YELLOW);
		t1.setBackground(Color.DARK_GRAY);
		panel.add(t1);
		
		p1 = new JPasswordField();
		p1.setBounds(120,100,300,30);
		p1.setForeground(Color.YELLOW);
		p1.setBackground(Color.DARK_GRAY);
		panel.add(p1);
		
		JButton b1,b2,b3;
		b1 = new JButton("Forget Password");
		b1.setBounds(150,200,200,30);
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.LIGHT_GRAY);
		panel.add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new Forget_Password();
				frame.setVisible(false);
			}
		});
		
		b2 = new JButton("Login");
		b2.setBounds(300,150,100,30);
		b2.setForeground(Color.BLACK);
		b2.setBackground(Color.LIGHT_GRAY);
		panel.add(b2);
		
		
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
				
					if(t1.getText().equals("") && p1.getText().equals("")) {
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields");
					}
					
					//if user name is entered but password field is empty then->
					else if (!(t1.getText().equals("")) && p1.getText().equals("")){
				
						JOptionPane.showMessageDialog(null, "Please fill up password");
					}
					
					//if password is entered but username field is empty then->
					else if (t1.getText().equals("") && !(p1.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill up User Id");
					}
					
					//if admin is logged in then ->
					
					else if(t1.getText().equals("admin") && p1.getText().equals("admin")){
						
						JOptionPane.showMessageDialog(null, "Admin Login Successful.");
						FileWriter fw = new FileWriter("Admin Login Information.txt",true);
						fw.write(t1.getText() + "\t" + t1.getText() +"\n");
						fw.close();
						new Admin();
						frame.setVisible(false);
					}
					
					//if guest is logged in then->
					
					else if(t1.getText().equals("guest") && p1.getText().equals("guest")){
						
						FileWriter fw = new FileWriter("Guest Login Information.txt",true);
						fw.write(t1.getText() + "\t" + t1.getText() +"\n");
						fw.close();
						JOptionPane.showMessageDialog(null, "Guest Login Successful.");
						frame.setVisible(false);
						new UserHomepage();
					}
					
					//if Employee is logged in then->
					
					else if(t1.getText().equals("employee") && p1.getText().equals("employee")){
						
						FileWriter fw = new FileWriter("Employee Login Information.txt",true);
						fw.write(t1.getText() + "\t" + t1.getText() +"\n");
						fw.close();
						JOptionPane.showMessageDialog(null, "Employee Login Successful.");
						frame.setVisible(false);
						new Employee();
					}
					
				}
				catch(IOException io){}
				
			}
		});
		
		b3 = new JButton("Cancel");
		b3.setBounds(100,150,100,30);
		b3.setForeground(Color.BLACK);
		b3.setBackground(Color.LIGHT_GRAY);
		panel.add(b3);
		
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new HotelManagementSystem();
				frame.setVisible(false);
			}
		});
		
		
		
		frame.add(panel);
		
		
	}
	public static void main(String [] args){
		Login l = new Login(); 
		
		
	}
}