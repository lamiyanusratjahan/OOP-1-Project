//ESHA
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin extends JFrame{
	
	public Admin(){
	
	    
		this.setTitle("Admin");
	    this.setSize(600,500);
        this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		this.setResizable(false);
		
		JPanel jp = new JPanel();
		jp.setSize(600,500);
		jp.setLayout(null);
		jp.setVisible(true);
		jp.setBackground(Color.BLACK);
		
		
		JButton b1 = new JButton("Manage room");
		b1.setBounds(215,30,150,50);
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.LIGHT_GRAY);
		jp.add(b1);
		
		
		JButton b2 = new JButton("Customer check in");
		b2.setBounds(215,100,150,50);
		b2.setForeground(Color.BLACK);
		b2.setBackground(Color.LIGHT_GRAY);
		jp.add(b2);
		
		JButton b3 = new JButton("Customer check out");
		b3.setBounds(215,170,150,50);
		b3.setForeground(Color.BLACK);
		b3.setBackground(Color.LIGHT_GRAY);
		jp.add(b3);
		
		
		JButton b5 = new JButton("Add Employee");
		b5.setBounds(215,240,150,50);
		b5.setForeground(Color.BLACK);
		b5.setBackground(Color.LIGHT_GRAY);
		jp.add(b5);
		
		
		JButton b6 = new JButton("Add Drivers");
		b6.setBounds(215,310,150,50);
		b6.setForeground(Color.BLACK);
		b6.setBackground(Color.LIGHT_GRAY);
		jp.add(b6);
		
		
		JButton b8 = new JButton("Log Out");
		b8.setBounds(465,400,80,30);
		b8.setForeground(Color.BLACK);
		b8.setBackground(Color.LIGHT_GRAY);
	    jp.add(b8);
		
		b8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new HotelManagementSystem();
				setVisible(false);
			}
		});
		
		
		this.add(jp);
			
	}
	
    public static void main(String [] args){
	
	Admin A = new Admin ();

}  


}