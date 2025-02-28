package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class SelectedPackage extends JFrame implements ActionListener {
    
    JLabel  labelMember,labelPackage,labelusername, labelphone,labelPrice ;
    JButton back;
    SelectedPackage(String username){
        setSize(1920,1080);
        setLocation(0,0);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.white);
        p1.setBounds(0,100, 960, 1000);
        p1.setLayout(null);
        add(p1);
         
        
        
        
        JLabel lblHead = new JLabel("VIEW PACKAGE DETAILS");
        lblHead.setBounds(250, 0, 600, 50);
        lblHead.setFont(new Font("SAN SERIF", Font.BOLD, 40));
        add(lblHead);
    
        
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(100, 50, 120, 20);
        lblusername.setFont(new Font("SAN SERIF", Font.BOLD, 18));
        p1.add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(350, 50, 200,25);
        labelusername.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelusername.setForeground(Color.DARK_GRAY);
        p1.add(labelusername);
        
        
        
        
        JLabel lblPackage = new JLabel("Package");
        lblPackage.setBounds(100, 110, 120, 20);
        lblPackage.setFont(new Font("SAN SERIF", Font.BOLD, 18));
        p1.add(lblPackage);
        
        labelPackage = new JLabel();
        labelPackage.setBounds(350, 110, 200,25);
        labelPackage.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelPackage.setForeground(Color.DARK_GRAY);
        p1.add(labelPackage);
        
        
        
        
        JLabel lblMember = new JLabel("Total Persons");
        lblMember.setBounds(100, 170, 160, 20);
        lblMember.setFont(new Font("SAN SERIF", Font.BOLD, 18));
        p1.add(lblMember);
        
        labelMember = new JLabel();
        labelMember.setBounds(350, 170, 200,25);
        labelMember.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelMember.setForeground(Color.DARK_GRAY);
        p1.add(labelMember);
        
        
        
        
        JLabel lblPrice = new JLabel("Price");
        lblPrice.setBounds(100, 230, 130, 20);
        lblPrice.setFont(new Font("SAN SERIF", Font.BOLD, 18));
        p1.add(lblPrice);
        
        labelPrice = new JLabel();
        labelPrice.setBounds(350, 230, 200,25);
        labelPrice.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelPrice.setForeground(Color.DARK_GRAY);
        p1.add(labelPrice);
        
       
        
        
      
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(100, 290, 100, 20);
        lblphone.setFont(new Font("SAN SERIF", Font.BOLD, 18));
        p1.add(lblphone);
        
        labelphone = new JLabel();
        labelphone.setBounds(350, 290, 200,25);
        labelphone.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelphone.setForeground(Color.DARK_GRAY);
        p1.add(labelphone);
        
        
       
     
        back = new JButton("Back");
        back.setBounds(600, 600,130,30);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        p1.add(back);
        
        
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bookpackage where username ='"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelphone.setText(rs.getString("phone"));
                labelPackage.setText(rs.getString("package"));
                labelMember.setText(rs.getString("person"));
                labelPrice.setText(rs.getString("price"));
               }
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        
        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        //p2.setBounds(0, 0, 400, 600);
        p2.setLayout(null);
        p2.setBounds(960, 0, 960, 1080);
        add(p2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel6.jpg"));
        Image i2 = i1.getImage().getScaledInstance(960, 1200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(0,0, 960, 980);
        p2. add(image1);
        
       
        
        setVisible(true);
        
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== back){
            setVisible(false);
            new Dashboard("");
        }
    }
    
    public static void main(String []args){
        new SelectedPackage("ARYAspecial");
    }
}
