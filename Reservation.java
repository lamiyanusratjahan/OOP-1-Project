//ESHA

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reservation extends JFrame{
	
	public Reservation() {
		
		
		this.setTitle("Reservation");
	    this.setSize(870,635);
        this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
		this.setResizable(false);
		
		JPanel jp = new JPanel();
		jp.setSize(870,635);
		jp.setLayout(null);
		jp.setVisible(true);
		jp.setBackground(Color.BLACK);
		
		
		JLabel l1 = new JLabel("First Name: ");
		l1.setBounds(50,30,200,50);
		l1.setForeground(Color.YELLOW);
		jp.add(l1);
		
		
        JLabel l2 = new JLabel("Last Name: ");
		l2.setBounds(50,110,200,50);
		l2.setForeground(Color.YELLOW);
		jp.add(l2);
		
		
		JLabel l3 = new JLabel("E-mail: ");
		l3.setBounds(50,190,200,50);
		l3.setForeground(Color.YELLOW);
		jp.add(l3);
		
		
		JLabel l4 = new JLabel("Passport Countrty: ");
		l4.setBounds(50,270,200,50);
		l4.setForeground(Color.YELLOW);
		jp.add(l4);
		
		
		JLabel l5 = new JLabel("Phone Number: ");
		l5.setBounds(50,350,200,50);
		l5.setForeground(Color.YELLOW);
		jp.add(l5);
	
	
		JLabel l6 = new JLabel("Nationality: ");
		l6.setBounds(50,430,200,50);
		l6.setForeground(Color.YELLOW);
		jp.add(l6);
		
		
		JLabel l7 = new JLabel("Type of room: ");
		l7.setBounds(500,30,200,50);
		l7.setForeground(Color.YELLOW);
		jp.add(l7);
		
		
		JLabel l8 = new JLabel("Bedding type: ");
		l8.setBounds(500,110,200,50);
		l8.setForeground(Color.YELLOW);
		jp.add(l8);
		
		
		JLabel l9 = new JLabel("Meal plan: ");
		l9.setBounds(500,190,200,50);
		l9.setForeground(Color.YELLOW);
		jp.add(l9);
		
		
        JLabel l10 = new JLabel("Check-in: ");
		l10.setBounds(500,270,200,50);
		l10.setForeground(Color.YELLOW);
		jp.add(l10);
		
		
		JLabel l11 = new JLabel("Check-out: ");
		l11.setBounds(500,350,200,50);
		l11.setForeground(Color.YELLOW);
		jp.add(l11);
		
	
		JTextField t1 = new JTextField();
		t1.setBounds(50,80,200,35);
		t1.setForeground(Color.YELLOW);
		t1.setBackground(Color.DARK_GRAY);
		jp.add(t1);
		
		
		JTextField t2 = new JTextField();
		t2.setBounds(50,160,200,35);
		t2.setForeground(Color.YELLOW);
		t2.setBackground(Color.DARK_GRAY);
		jp.add(t2);
		
		
		JTextField t3 = new JTextField();
		t3.setBounds(50,240,300,35);
		t3.setForeground(Color.YELLOW);
		t3.setBackground(Color.DARK_GRAY);
		jp.add(t3);
		
		
		JTextField t4 = new JTextField();
		t4.setBounds(50,320,300,35);
		t4.setForeground(Color.YELLOW);
		t4.setBackground(Color.DARK_GRAY);
		jp.add(t4);
		
		
		JTextField t5 = new JTextField();
		t5.setBounds(50,400,300,35);
		t5.setForeground(Color.YELLOW);
		t5.setBackground(Color.DARK_GRAY);
		jp.add(t5);
		
		
		JTextField t6 = new JTextField();
		t6.setBounds(50,480,200,35);
		t6.setForeground(Color.YELLOW);
		t6.setBackground(Color.DARK_GRAY);
		jp.add(t6);
		
		
		JTextField t7 = new JTextField();
		t7.setBounds(500,80,200,35);
		t7.setForeground(Color.YELLOW);
		t7.setBackground(Color.DARK_GRAY);
		jp.add(t7);
		
		
		
		JTextField t8 = new JTextField();
		t8.setBounds(500,160,300,35);
		t8.setForeground(Color.YELLOW);
		t8.setBackground(Color.DARK_GRAY);
		jp.add(t8);
		
		
		JTextField t9 = new JTextField();
		t9.setBounds(500,240,300,35);
		t9.setForeground(Color.YELLOW);
		t9.setBackground(Color.DARK_GRAY);
		jp.add(t9);
		
		
		JTextField t10 = new JTextField();
		t10.setBounds(500,320,300,35);
		t10.setForeground(Color.YELLOW);
		t10.setBackground(Color.DARK_GRAY);
		jp.add(t10);
		
		
		
		JTextField t11 = new JTextField();
		t11.setBounds(500,400,200,35);
		t11.setForeground(Color.YELLOW);
		t11.setBackground(Color.DARK_GRAY);
		jp.add(t11);
		
		
		
		JButton b1 = new JButton("Reserve");
		b1.setBounds(640,510,160,50);
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.LIGHT_GRAY);
		jp.add(b1);
		
		
		JButton b2 = new JButton("Back");
		b2.setBounds(450,510,160,50);
		b2.setForeground(Color.BLACK);
		b2.setBackground(Color.LIGHT_GRAY);
		jp.add(b2);
		
		
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new UserHomepage();
				setVisible(false);

            }

        });
		
		this.add(jp);	
	}
	
    public static void main(String [] args){
	
	Reservation R = new Reservation();
}  


}