
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class BookPackage extends JFrame implements ActionListener{
    
    Choice choosePackage;
    JButton price, book, back;
    JTextField tfperson;
    JLabel labelprice, labelusername, labelphone;
    
    
    String username;
    BookPackage(String username){
        this.username = username;
        setSize(1920,1080);
        setLocation(0,0);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBounds(300, 150, 400, 600);
        p1.setLayout(null);
        add(p1);
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 500);
        p1. add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(700, 150, 450, 500);
        add(p2);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 20, 100, 20);
        lblusername.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(200, 20, 200, 25);
        labelusername.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(labelusername);
        
        JLabel selectPackage = new JLabel("Select Package");
        selectPackage.setBounds(60, 80, 120, 20);
        selectPackage.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(selectPackage);
        
        
        choosePackage = new Choice();
        choosePackage.setBounds(200, 80, 200, 25);
        choosePackage.setForeground(Color.GRAY);
        choosePackage.add(" GOLD ");
        choosePackage.add(" SILVER ");
        choosePackage.add(" BRONZE ");
        p2.add(choosePackage);
          
        
        JLabel totalPerson = new JLabel("Total Person");
        totalPerson.setBounds(60, 140, 120, 20);
        totalPerson.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(totalPerson);
        
        tfperson = new JTextField("1");
        tfperson.setBounds(200, 140, 200, 20);
        tfperson.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfperson);
        
        
        
        JLabel phone = new JLabel("Phone");
        phone.setBounds(60, 200, 100, 20);
        phone.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(phone);
        
        labelphone = new JLabel();
        labelphone.setBounds(200, 200, 200, 25);
        labelphone.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(labelphone);
        
        
        JLabel totalPrice = new JLabel("Total Price");
        totalPrice.setBounds(60, 260, 100, 20);
        totalPrice.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(totalPrice);
        
        
        labelprice = new JLabel();
        labelprice.setBounds(200, 260, 200, 25);
        labelprice.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(labelprice);
        
        
        price = new JButton("Check Price");
        price.setBounds(240, 330, 100, 22);
        price.setBackground(Color.GREEN);
        price.setForeground(Color.WHITE);
        price.setBorder(BorderFactory.createEmptyBorder());
        price.addActionListener(this);
        p2.add(price);
        
        
        book = new JButton("Book Now");
        book.setBounds(120, 330, 100, 22);
        book.setBackground(Color.blue);
        book.setForeground(Color.WHITE);
        book.setBorder(BorderFactory.createEmptyBorder());
        book.addActionListener(this);
        p2.add(book);
        
        back = new JButton("Back");
        //back.setBounds(270, 320, 100, 22);
        back.setBounds(180, 370, 100, 22);
        back.setBackground(Color.red);
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        p2.add(back);
        
        
        
         try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username ='"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelphone.setText(rs.getString("phone"));
                
            }
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == price){
            try{
                String selectPackage = choosePackage.getSelectedItem();
                int totalPerson = Integer.parseInt(tfperson.getText());
                int cost = 0;
                if(selectPackage.equals(" GOLD ")){
                    cost += 15000;
                } else if(selectPackage.equals(" SILVER ")){
                    cost += 12000;
                } else{
                    cost += 9000;
                } 
                cost *= totalPerson;
                labelprice.setText("Rs. " + cost);
            } catch (Exception e){
                e.printStackTrace();
            }
                      
            }else if(ae.getSource()== book){
             
                try{
                    Conn c =new Conn();
                    c.s.executeUpdate("insert into bookpackage value('"+labelusername.getText()+"', '"+choosePackage.getSelectedItem()+"', '"+tfperson.getText()+"', '"+labelphone.getText()+"', '"+labelprice.getText()+"')");
                    JOptionPane.showMessageDialog(null,"Package Booked Successfully!!");
                    setVisible(false);
                } catch (Exception e){
                e.printStackTrace();
            }
                        
        } else if(ae.getSource() == back){
            setVisible(false);
            new Dashboard("");
        }
    }
            
    
    
    public static void main (String []args){
        new BookPackage("ARYAspecial");
    }
    
}

