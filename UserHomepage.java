//ESHA


import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserHomepage extends JFrame {
	
	UserHomepage(){
	
	    JFrame frame = new JFrame();
		
		frame.setTitle("Guest Homepage");
	    frame.setSize (412,400);
        frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
		frame.setResizable(false);
		
		JPanel jp = new JPanel();
		jp.setSize(590,400);
		jp.setLayout(null);
		jp.setVisible(true);
		jp.setBackground(Color.BLACK);
		
		
		
		JButton b1 = new JButton("Reservation");
		b1.setBounds(120,40,160,50);
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.LIGHT_GRAY);
		jp.add(b1);
		
		
		
		// etar frame banate hobe
		JButton b3 = new JButton("Check Availability");
		b3.setForeground(Color.BLACK);
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setBounds(120,120,160,50);
		jp.add(b3);
		
		
		// etar frame banate hobe 
		JButton b4 = new JButton("Display Room Details");
		b4.setBounds(120,200,160,50);
		b4.setForeground(Color.BLACK);
		b4.setBackground(Color.LIGHT_GRAY);
		jp.add(b4);
		
		
		
		JButton b5 = new JButton("Logout");
		b5.setBounds(120,280,160,50);
		b5.setForeground(Color.BLACK);
		b5.setBackground(Color.LIGHT_GRAY);
		jp.add(b5);
	
		
        b1.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {


                new Reservation();

            }

        });
		
		/*b2.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {


                new Login();

            }

        });
		
		b3.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {


                new Check Availability();

            }

        });
		
		b4.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {


                new Display Room Details();

            }

        });*/
		
		b5.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {


                new HotelManagementSystem();
				frame.setVisible(false);

            }

        });
		 

		
		frame.add(jp);
		
			
	}
		
		
    public static void main(String [] args){
	
	UserHomepage UH = new UserHomepage ();

}  


}