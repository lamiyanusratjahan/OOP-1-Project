// Rajbir 

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class About_Us {
	
	public About_Us(){
		
		JFrame xyz = new JFrame("About Us");
		xyz.setSize(450,300);
		//xyz.setLayout(null);
		xyz.setLocationRelativeTo(null);
		xyz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		xyz.setVisible(true);
		xyz.setResizable(true);
		
		JPanel panel = new JPanel();
		panel.setSize(450,300);
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		
		
		JLabel label1 = new JLabel("Kingston Hotel");
		JLabel label2 = new JLabel("768 5th Ave, New York, NY 10019, United States.");
		JLabel label3 = new JLabel("The service is 24/7 for you.");
		JLabel label4 = new JLabel("kinstonhotel@gmail.com");
		label1.setBounds(110,20,300,35);
		label2.setBounds(20,100,400,25);
		label3.setBounds(95,150,300,25);
		label4.setBounds(115,200,300,25);
		label1.setFont(new Font("Arial", Font.ITALIC, 30));
		label2.setFont(new Font("Arial", Font.PLAIN, 18));
		label3.setFont(new Font("Arial", Font.PLAIN, 18));
		label4.setFont(new Font("Arial", Font.PLAIN, 18));
		label1.setForeground(Color.WHITE);
		label2.setForeground(Color.WHITE);
		label3.setForeground(Color.WHITE);
		label4.setForeground(Color.WHITE);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		
		xyz.add(panel);
	}
	public static void main(String [] args){
		
		About_Us au = new About_Us();
	}
}