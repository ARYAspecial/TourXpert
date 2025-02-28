
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class ForgetPassword extends JFrame implements ActionListener{
    
    
    JButton search, restore, back;
    JTextField tfname, tfusername,tfpassword, tfanswer,tfsecurity;
    ForgetPassword(){
        setSize(900,600);
        setLocation(200,200);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBounds(0, 0, 400, 600);
        p1.setLayout(null);
        add(p1);
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 175, 200, 200);
        p1. add(image);
        
        JPanel p2 = new JPanel();
       // p2.setBackground(new Color(131, 193, 233));
       // p2.setBounds(0, 0, 400, 600);
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 500);
        add(p2);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(60, 20, 100, 20);
        lblname.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(160, 20, 150, 20);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfname);
        
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 80, 100, 20);
        lblusername.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(160, 80, 150, 20);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        
        
        
        
        
        
        JLabel lblsecurity = new JLabel("security");
        lblsecurity.setBounds(60, 140, 70, 20);
        lblsecurity.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(lblsecurity);
        
        tfsecurity = new JTextField();
        tfsecurity.setBounds(160, 140, 150, 20);
        tfsecurity.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfsecurity);
        
        
        
        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setBounds(60, 200, 100, 20);
        lblanswer.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(lblanswer);
        
        tfanswer = new JTextField();
        tfanswer.setBounds(160, 200, 150, 20);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfanswer);
        
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 260, 100, 20);
        lblpassword.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(160, 260, 150, 20);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        
        search = new JButton("Search");
        search.setBounds(330, 80, 100, 22);
        search.setBackground(Color.DARK_GRAY);
        search.setForeground(Color.WHITE);
        search.setBorder(BorderFactory.createEmptyBorder());
        search.addActionListener(this);
        p2.add(search);
        
        
        restore = new JButton("Restore");
        restore.setBounds(330, 200, 100, 22);
        restore.setBackground(Color.DARK_GRAY);
        restore.setForeground(Color.WHITE);
        restore.setBorder(BorderFactory.createEmptyBorder());
        restore.addActionListener(this);
        p2.add(restore);
        
        back = new JButton("Back");
        //back.setBounds(270, 320, 100, 22);
        back.setBounds(60, 320, 100, 22);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        p2.add(back);
        
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == search){
            try{
                String query = "select * from account where username = '"+tfusername.getText()+"'";
                Conn c = new Conn();
                
                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()){
                    tfname.setText(rs.getString("name"));
                    tfsecurity.setText(rs.getString("security"));
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            
                        
            }else if(ae.getSource()== restore){
                try{
                String query = "select * from account where answer = '"+tfanswer.getText()+"' and username ='"+tfusername.getText()+"'";
                Conn c = new Conn();
                
                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()){
                    tfpassword.setText(rs.getString("password"));
                }
            } catch (Exception e){
                e.printStackTrace();
            }
                        
        } else if(ae.getSource() == back){
            setVisible(false);
            new Login();
        }
    }
            
    
    
    public static void main (String []args){
        new ForgetPassword();
    }
    
}
