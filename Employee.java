
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class  Employee extends JFrame{
	
	public Employee(){
	
	    
		this.setTitle("Employee");
	    this.setSize(400,400);
        this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		this.setResizable(false);
		
		JPanel jp = new JPanel();
		jp.setSize(400,400);
		jp.setLayout(null);
		jp.setVisible(true);
		jp.setBackground(Color.BLACK);
		
		JButton b1 = new JButton("Update Profile");
		b1.setBounds(170,70,150,40);
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.LIGHT_GRAY);
		jp.add(b1);
		
		JButton b2 = new JButton("Logout");
		b2.setBounds(200,230,120,40);
		b2.setForeground(Color.BLACK);
		b2.setBackground(Color.LIGHT_GRAY);
		jp.add(b2);
		
		
		JLabel l1 = new JLabel("Application : ");
		l1.setBounds(30,145,120,50);
		l1.setForeground(Color.YELLOW);
		jp.add(l1);
		
		
		JComboBox com1;
		
		
		String app [] = new String []{"For Leave", "For Salary Increase"};
		com1 = new JComboBox(app);
		com1.setBounds(120,150,200,40);
		com1.setForeground(Color.YELLOW);
		com1.setBackground(Color.DARK_GRAY);
		jp.add(com1);
		
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new UpdateProfileEmployee();
				setVisible(false);
			}
		});
		
			
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new HotelManagementSystem();
				setVisible(false);
			}
		});
		
		
		this.add(jp);
			
	}
	
    public static void main(String [] args){
	
	Employee E = new Employee ();

}  


}
