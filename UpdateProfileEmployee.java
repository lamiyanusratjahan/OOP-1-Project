//ESHA
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateProfileEmployee extends JFrame{
	
	public UpdateProfileEmployee(){
	
	    
		this.setTitle("Update Employee Profile");
	    this.setSize(525,620);
        this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		this.setResizable(false);
		
		JPanel jp = new JPanel();
		jp.setSize(525,620);
		jp.setLayout(null);
		jp.setVisible(true);
		jp.setBackground(Color.BLACK);
		
		
		JLabel l1 = new JLabel("Employee Name: ");
		l1.setBounds(50,40,200,50);
		l1.setForeground(Color.YELLOW);
		jp.add(l1);
		
		
        JLabel l2 = new JLabel("NID: ");
		l2.setBounds(50,130,200,50);
		l2.setForeground(Color.YELLOW);
		jp.add(l2);
		
		
		JLabel l3 = new JLabel("E-mail: ");
		l3.setBounds(50,220,200,50);
		l3.setForeground(Color.YELLOW);
		jp.add(l3);
		
		
		JLabel l4 = new JLabel("Post: ");
		l4.setBounds(50,310,200,50);
		l4.setForeground(Color.YELLOW);
		jp.add(l4);
		
		
		JLabel l5 = new JLabel("Mobile Number: ");
		l5.setBounds(50,400,200,50);
		l5.setForeground(Color.YELLOW);
		jp.add(l5);
	
		
	
		JTextField name = new JTextField();
		name.setBounds(50,90,200,40);
		name.setForeground(Color.YELLOW);
		name.setBackground(Color.DARK_GRAY);
		jp.add(name);
		
		
		JTextField nid = new JTextField();
		nid.setBounds(50,180,200,40);
		nid.setForeground(Color.YELLOW);
		nid.setBackground(Color.DARK_GRAY);
		jp.add(nid);
		
		
		JTextField email = new JTextField();
		email.setBounds(50,270,300,40);
		email.setForeground(Color.YELLOW);
		email.setBackground(Color.DARK_GRAY);
		jp.add(email);
		
		
		JTextField post = new JTextField();
		post.setBounds(50,360,300,40);
		post.setForeground(Color.YELLOW);
		post.setBackground(Color.DARK_GRAY);
		jp.add(post);
		
		
		JTextField mobileNo = new JTextField();
		mobileNo.setBounds(50,450,300,40);
		mobileNo.setForeground(Color.YELLOW);
		mobileNo.setBackground(Color.DARK_GRAY);
		jp.add(mobileNo);
	
		JButton b1 = new JButton("Update");
		b1.setBounds(300,530,100,30);
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.LIGHT_GRAY);
		jp.add(b1);
		
		JButton b2 = new JButton("Cancel");
		b2.setBounds(100,530,100,30);
		b2.setForeground(Color.BLACK);
		b2.setBackground(Color.LIGHT_GRAY);
		jp.add(b2);
		
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					
					//if no field is filled then->
					if(name.getText().equals("") && nid.getText().equals("") && email.getText().equals("") && post.getText().equals("") && mobileNo.getText().equals("")) {
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//1		if name is entered but nid, email, post and mobilenumber field is empty then->
					else if (!(name.getText().equals("")) && nid.getText().equals("") && email.getText().equals("")&& post.getText().equals("") && mobileNo.getText().equals("")){
				
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//2		if nid is entered but user name, email, post and mobilenumber field is empty then->
					else if (name.getText().equals("") && !(nid.getText().equals("")) && email.getText().equals("") && post.getText().equals("") && mobileNo.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//3		if email is entered but user name, nid, post and mobilenumber field is empty then->
					else if (name.getText().equals("") && nid.getText().equals("") && !(email.getText().equals("")) && post.getText().equals("") && mobileNo.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//4		if post is entered but user name, email, nid and mobilenumber field is empty then->
					else if (name.getText().equals("") && nid.getText().equals("") && email.getText().equals("") && !(post.getText().equals("")) && mobileNo.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//5		if mobilenumber is entered but user name, email, nid and post field is empty then->
					else if (name.getText().equals("") && nid.getText().equals("") && email.getText().equals("") && post.getText().equals("") && !(mobileNo.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//6		if name and nid is entered and email,post,mobile field is empty then->
					else if (!(name.getText().equals("")) && !(nid.getText().equals("")) && email.getText().equals("")  && post.getText().equals("") && mobileNo.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//7		if name and email is entered but nid, post and mobilenumber field is empty then->
					else if (!(name.getText().equals("")) && !(nid.getText().equals("")) && email.getText().equals("") && post.getText().equals("") && mobileNo.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//8		if name and post is entered but nid, email and mobilenumber field is empty then->
					else if (!(name.getText().equals("")) && nid.getText().equals("")&& email.getText().equals("") && !(post.getText().equals("")) && mobileNo.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//9		if name and mobile is entered but nid,email,post field is empty then->
					else if (!(name.getText().equals("")) && nid.getText().equals("") && email.getText().equals("") && post.getText().equals("") && !(mobileNo.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//10		if nid and email is entered but name, post and mobilenumber field is empty then->
					else if (name.getText().equals("") && !(nid.getText().equals("")) && !(email.getText().equals("")) && post.getText().equals("") && mobileNo.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//11		if nid and post is entered but name, email and mobilenumber field is empty then->
					else if (name.getText().equals("") && !(nid.getText().equals("")) && email.getText().equals("") && !(post.getText().equals("")) && mobileNo.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//12		if nid and mobile is entered but name,email, post field is empty then->
					else if (name.getText().equals("") && !(nid.getText().equals("")) && email.getText().equals("") && post.getText().equals("") && !(mobileNo.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//13		if email and post is entered but name, nid and mobile field is empty then->
					else if (name.getText().equals("") && nid.getText().equals("") && !(email.getText().equals("")) && !(post.getText().equals("")) && mobileNo.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//14		if email and mobilenumber is entered but name, nid and post field is empty then->
					else if (name.getText().equals("") && nid.getText().equals("") && !(email.getText().equals("")) && post.getText().equals("") && !(mobileNo.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//15		if post and mobilenumber is entered but name, nid and email field is empty then->
					else if (name.getText().equals("") && nid.getText().equals("") && email.getText().equals("") && !(post.getText().equals("")) && !(mobileNo.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//16		if name, nid, email is entered but post and mobile field is empty then->
					else if (!(name.getText().equals("")) && !(nid.getText().equals("")) && !(email.getText().equals("")) && post.getText().equals("") && mobileNo.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//17		if name, nid, post is entered but  email and mobilenumber field is empty then->
					else if (!(name.getText().equals("")) && !(nid.getText().equals("")) && email.getText().equals("") && !(post.getText().equals("")) && mobileNo.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//18	if name, nid, mobile is entered but  email and post field is empty then->
					else if (!(name.getText().equals("")) && !(nid.getText().equals("")) && email.getText().equals("") && post.getText().equals("") && !(mobileNo.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//19		if nid, email, post is entered but name and mobilenumber is empty then->
					else if (name.getText().equals("") && !(nid.getText().equals("")) && !(email.getText().equals("")) && !(post.getText().equals("")) && mobileNo.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//20		if nid, email, mobile is entered but name and post is empty then->
					else if (name.getText().equals("") && !(nid.getText().equals("")) && !(email.getText().equals("")) && post.getText().equals("") && !(mobileNo.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//21		if email, post, mobilenumber is entered but name and nid is empty then->
					else if (name.getText().equals("") && nid.getText().equals("") && !(email.getText().equals("")) && !(post.getText().equals("")) && !(mobileNo.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//22		if name,nid,email,post is entered but mobilenumber is empty then->
					else if (!(name.getText().equals("")) && !(nid.getText().equals("")) && !(email.getText().equals("")) && !(post.getText().equals("")) && mobileNo.getText().equals("")){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//23		if name,nid email,mobile is entered but post is empty then->
					else if (!(name.getText().equals("")) && !(nid.getText().equals("")) && !(email.getText().equals("")) && post.getText().equals("") && !(mobileNo.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					//24		if nid, email,post,mobile is entered but name is empty then->
					else if (name.getText().equals("") && !(nid.getText().equals("")) && !(email.getText().equals("")) && !(post.getText().equals("")) && !(mobileNo.getText().equals(""))){
						
						JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
					}
					
					else{
						
						FileWriter fw = new FileWriter("Updated Employee Information.txt",true);
						fw.write(name.getText() + "\t" + nid.getText() + "\t" + email.getText() + "\t" + post.getText() + "\t" + mobileNo.getText() + "\n");
						fw.close();
						JOptionPane.showMessageDialog(null, "Employee Information Updated Successfully.");
						setVisible(false);
						new Employee();
					}
				}
				catch(IOException io){}
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new Employee();
				setVisible(false);
			}
		});
		
		this.add(jp);	
	}
	
    public static void main(String [] args){
	
	UpdateProfileEmployee UPE = new UpdateProfileEmployee();
}  


}