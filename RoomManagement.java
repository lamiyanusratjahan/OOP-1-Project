import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class RoomManagement extends JFrame  {
   private JLabel roomNumberLabel, roomTypeLabel, bedTypeLabel, priceLabel;
   private JTextField roomNumberField, priceField;
   private  JComboBox<String> roomTypeComboBox, bedTypeComboBox;
   private JButton roomManagementButton;
    

    public RoomManagement() {
        
		
		setTitle("Room Management ");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        roomNumberLabel = new JLabel("Room Number:");
        roomNumberLabel.setBounds(20, 20, 100, 30);
        add(roomNumberLabel);

        roomNumberField = new JTextField();
        roomNumberField.setBounds(130, 20, 150, 30);
        add(roomNumberField);

        roomTypeLabel = new JLabel("Room Type:");
        roomTypeLabel.setBounds(20, 70, 100, 30);
        add(roomTypeLabel);

        roomTypeComboBox = new JComboBox<>(new String[]{"AC", "Non-AC"});
        roomTypeComboBox.setBounds(130, 70, 150, 30);
        add(roomTypeComboBox);

        bedTypeLabel = new JLabel("Bed Type:");
        bedTypeLabel.setBounds(20, 120, 100, 30);
        add(bedTypeLabel);

        bedTypeComboBox = new JComboBox<>(new String[]{"Single", "Double"});
        bedTypeComboBox.setBounds(130, 120, 150, 30);
        add(bedTypeComboBox);

        priceLabel = new JLabel("Price:");
        priceLabel.setBounds(20, 170, 100, 30);
        add(priceLabel);

        priceField = new JTextField();
        priceField.setBounds(130, 170, 150, 30);
        add(priceField);

         roomManagementButton = new JButton("Manage Room");
         roomManagementButton.setBounds(100, 220, 150, 30);
    

         
        roomManagementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RoomManagement();
                            }
        });
        add(roomManagementButton);

        setVisible(true);
        
    }

    public static void main(String[] args) {
        new RoomManagement();
    }

    
    private void RoomManagement() {
        String roomNumber = roomNumberField.getText();
            String roomType = (String) roomTypeComboBox.getSelectedItem();
            String bedType = (String) bedTypeComboBox.getSelectedItem();
            String price = priceField.getText();

     if (roomNumber.isEmpty() && roomType.isEmpty()  && bedType.isEmpty()  && price.isEmpty()){
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true));
            writer.write("Room Number: " + roomNumber + "\n");
            writer.write("Room Type: " + roomType + "\n");
            writer.write("Bed Type: " + bedType + "\n");
            writer.write("Price: " + price + "\n");
            writer.write("---------------------------------\n");
            writer.close();
            System.out.println("Room added successfully.");
        } catch (IOException ex) {
            System.out.println("Error while registering user.");
        }

  }

     else {
                System.out.println( "Please fill in all fields.");
    }

}

}