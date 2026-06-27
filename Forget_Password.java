
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Forget_Password extends JFrame{
	
	public Forget_Password(){
	
	    
		this.setTitle("Forget_Password");
	    this.setSize(540,350);
        this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		this.setResizable(false);
		
		JPanel jp = new JPanel();
		jp.setSize(540,350);
		jp.setLayout(null);
		jp.setVisible(true);
		jp.setBackground(Color.BLACK);
		
		
		
		JLabel l1 = new JLabel("Name : ");
		l1.setBounds(50,30,200,50);
		l1.setForeground(Color.YELLOW);
		jp.add(l1);
		
		
		JLabel l2 = new JLabel("E-mail : ");
		l2.setBounds(50,100,200,50);
		l2.setForeground(Color.YELLOW);
		jp.add(l2);
		
		
		JLabel l3 = new JLabel("Set password : ");
		l3.setBounds(50,170,200,50);
		l3.setForeground(Color.YELLOW);
		jp.add(l3);
		
		
		JTextField t1 = new JTextField();
		t1.setBounds(170,35,300,40);
		t1.setForeground(Color.YELLOW);
		t1.setBackground(Color.DARK_GRAY);
		jp.add(t1);
		
		
		JTextField t2 = new JTextField();
		t2.setBounds(170,105,300,40);
		t2.setForeground(Color.YELLOW);
		t2.setBackground(Color.DARK_GRAY);
		jp.add(t2);
		
		
		JTextField t3 = new JTextField();
		t3.setBounds(170,175,300,40);
		t3.setForeground(Color.YELLOW);
		t3.setBackground(Color.DARK_GRAY);
		jp.add(t3);
		
				
		JButton b1 = new JButton("Back");
		b1.setBounds(50,250,80,30);
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.LIGHT_GRAY);
	    jp.add(b1);
		
		
		JButton b2 = new JButton("Update password");
		b2.setBounds(330,250,140,30);
		b2.setForeground(Color.BLACK);
		b2.setBackground(Color.LIGHT_GRAY);
	    jp.add(b2);
		
		// Rajbir
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new Login();
				setVisible(false);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					
					//if no field is filled then->
					if(t1.getText().equals("") && t2.getText().equals("") && t3.getText().equals("")) {
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//if user name is entered but email and password field is empty then->
					else if (!(t1.getText().equals("")) && t2.getText().equals("") && t3.getText().equals("")){
				
						JOptionPane.showMessageDialog(null, "Please fill up Email and Password.");
					}
					
					//if email is entered but username and password field is empty then->
					else if (t1.getText().equals("") && !(t2.getText().equals("")) && t3.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill up Name and Password.");
					}
					
					//if password is entered but username and email field is empty then->
					else if (t1.getText().equals("") && t2.getText().equals("") && !(t3.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill up Name and Email.");
					}
					
					//if name and email is entered but password field is empty then->
					else if (!(t1.getText().equals("")) && !(t2.getText().equals("")) && t3.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill up Password.");
					}
					
					//if name and pasword is entered but email field is empty then->
					else if (!(t1.getText().equals("")) && t2.getText().equals("") && !(t3.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill up E-mail.");
					}
					
					//if email and password is entered but name field is empty then->
					else if (t1.getText().equals("") && !(t2.getText().equals("")) && !(t3.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill up Name.");
					}
					
					//if all fields are filled with correct information then->
					else{
						FileWriter fw = new FileWriter("UpdatedINformation.txt",true);
						fw.write(t1.getText() + "\t" + t2.getText() + "\t" + t2.getText() + "\n");
						fw.close();
						JOptionPane.showMessageDialog(null, "Password Updated Successfully.");
						setVisible(false);
						new UserHomepage();
					}
				}
				catch(IOException io){}
				
			}
		});
		
		this.add(jp);	
	}
	
    public static void main(String [] args){
	
		Forget_Password FP = new Forget_Password();
	}  


}

// BACK,SUBMIT
