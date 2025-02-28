package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class viewCustomer extends JFrame implements ActionListener {
    
    JLabel labelname,labelemail, labelusername,labeladdress, labelphone,labelcountry,labelgender,labelgovernmentId ,labelIDnumber,tfname,tfidnumber, tfusername,tfphone, tfcountry,tfaddress,tfemail;
    JButton back;
    viewCustomer(String username){
        setSize(1920,1080);
        setLocation(0,0);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBounds(0,0, 1920, 600);
        p1.setLayout(null);
        add(p1);
         
        
        
        
        
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(100, 50, 100, 20);
        lblname.setFont(new Font("SAN SERIF", Font.BOLD, 18));
        p1.add(lblname);
        
        
        labelname = new JLabel();
        labelname.setBounds(350, 50, 200,25);
        labelname.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelname.setForeground(Color.DARK_GRAY);
        p1.add(labelname);
        
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(100, 130, 100, 20);
        lblusername.setFont(new Font("SAN SERIF", Font.BOLD, 18));
        p1.add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(350, 130, 200,25);
        labelusername.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelusername.setForeground(Color.DARK_GRAY);
        p1.add(labelusername);
        
        
        
        
        JLabel lblgovernmentId = new JLabel("GovernmentID");
        lblgovernmentId.setBounds(100, 210, 130, 20);
        lblgovernmentId.setFont(new Font("SAN SERIF", Font.BOLD, 18));
        p1.add(lblgovernmentId);
        
        labelgovernmentId = new JLabel();
        labelgovernmentId.setBounds(350, 210, 200,25);
        labelgovernmentId.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelgovernmentId.setForeground(Color.DARK_GRAY);
        p1.add(labelgovernmentId);
        
        
        JLabel lblIDnumber = new JLabel("ID Number");
        lblIDnumber.setBounds(100, 290, 100, 20);
        lblIDnumber.setFont(new Font("SAN SERIF", Font.BOLD, 18));
        p1.add(lblIDnumber);
        
        
        labelIDnumber = new JLabel();
        labelIDnumber.setBounds(350, 290, 200,25);
        labelIDnumber.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelIDnumber.setForeground(Color.DARK_GRAY);
        p1.add(labelIDnumber);
        
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(100, 370, 100, 20);
        lblgender.setFont(new Font("SAN SERIF", Font.BOLD, 18));
        p1.add(lblgender);
        
        
        labelgender = new JLabel();
        labelgender.setBounds(350, 370, 200,25);
        labelgender.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelgender.setForeground(Color.DARK_GRAY);
        p1.add(labelgender);
        
        
        
        JLabel lblcountry = new JLabel("Nationality");
        lblcountry.setBounds(800, 50, 100, 20);
        lblcountry.setFont(new Font("SAN SERIF", Font.BOLD, 18));
        p1.add(lblcountry);
        
        labelcountry = new JLabel();
        labelcountry.setBounds(1050, 50, 200,25);
        labelcountry.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelcountry.setForeground(Color.DARK_GRAY);
        p1.add(labelcountry);
        
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(800, 130, 100, 20);
        lbladdress.setFont(new Font("SAN SERIF", Font.BOLD, 18));
        p1.add(lbladdress);
        
        labeladdress = new JLabel();
        labeladdress.setBounds(1050, 130, 200,25);
        labeladdress.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labeladdress.setForeground(Color.DARK_GRAY);
        p1.add(labeladdress);
        
        
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(800, 210, 100, 20);
        lblphone.setFont(new Font("SAN SERIF", Font.BOLD, 18));
        p1.add(lblphone);
        
        labelphone = new JLabel();
        labelphone.setBounds(1050, 210, 200,25);
        labelphone.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelphone.setForeground(Color.DARK_GRAY);
        p1.add(labelphone);
        
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(800, 290, 100, 20);
        lblemail.setFont(new Font("SAN SERIF", Font.BOLD, 18));
        p1.add(lblemail);
        
        
        labelemail = new JLabel();
        labelemail.setBounds(1050, 290, 200,25);
        labelemail.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelemail.setForeground(Color.DARK_GRAY);
        p1.add(labelemail);
       
     
        back = new JButton("Back");
        back.setBounds(700, 450,130,30);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        p1.add(back);
        
        
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username ='ARYAspecial'");
            while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelusername.setText(rs.getString("username"));
                labelgovernmentId.setText(rs.getString("governmentId"));
                labelIDnumber.setText(rs.getString("idnumber"));
                labelgender.setText(rs.getString("gender"));
                labelcountry.setText(rs.getString("country"));
                labeladdress.setText(rs.getString("address"));
                labelphone.setText(rs.getString("phone"));
                labelemail.setText(rs.getString("email"));
            }
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        
        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        //p2.setBounds(0, 0, 400, 600);
        p2.setLayout(null);
        p2.setBounds(0, 600, 1480, 480);
        add(p2);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(40,0, 600, 200);
        p2. add(image1);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(630,0, 600, 200);
        p2. add(image2);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i8 = i7.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image3 = new JLabel(i9);
        image3.setBounds(1230,0, 600, 200);
        p2. add(image3);
        
        setVisible(true);
        
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== back){
            setVisible(false);
            new Dashboard("");
        }
    }
    
    public static void main(String []args){
        new viewCustomer("");
    }
}
