package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class UpdateCustomer extends JFrame implements ActionListener {
    
    JLabel labelname, labelusername;
    JButton update, back;
    JTextField tfname,tfidnumber, tfusername,tfphone, tfcountry,tfaddress,tfemail,tfgovernmentId, tfnationality, tfgender;
    
    UpdateCustomer(String username){
        setSize(1920,1080);
        setLocation(0,0);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        
        JPanel p1 = new JPanel();
        //p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(150, 50, 400, 600);
        p1.setLayout(null);
        add(p1);
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,100, 390,500);
        p1.add(image);
        
        JLabel text = new JLabel("UPDATE CUSTOMER DETAILS");
        text.setBounds(50,30, 300, 25);
        text.setFont(new Font("Tahoma", Font.PLAIN,20));
        p1.add(text);
        
        
        
        
        
        
        
        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        //p2.setBounds(0, 0, 400, 600);
        p2.setLayout(null);
        p2.setBounds(700, 80, 500, 1080);
        add(p2);
        
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(60, 20, 100, 20);
        lblname.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblname);
        
        
        labelname = new JLabel();
        labelname.setBounds(230, 20, 200,25);
        labelname.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelname.setForeground(Color.red);
        p2.add(labelname);
        
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 80, 100, 20);
        lblusername.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(230, 80, 200,25);
        labelusername.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        labelusername.setForeground(Color.red);
        p2.add(labelusername);
        
        
        
        
        JLabel lblgovernmentId = new JLabel("GovernmentID");
        lblgovernmentId.setBounds(60, 140, 120, 20);
        lblgovernmentId.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblgovernmentId);
        
        tfgovernmentId = new JTextField();
        tfgovernmentId.setBounds(230, 140, 200,25);
        //tfname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfgovernmentId);
        
        
        
        JLabel lblnumber = new JLabel("ID Number");
        lblnumber.setBounds(60, 200, 100, 20);
        lblnumber.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblnumber);
        
        
        tfidnumber = new JTextField();
        tfidnumber.setBounds(230, 200, 200, 25);
        //tfname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfidnumber);
        
        
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(60, 260, 100, 20);
        lblgender.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblgender);
        
        tfgender = new JTextField();
        tfgender.setBounds(230, 260, 200, 25);
        //tfname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfgender);
        
        JLabel lblcountry = new JLabel("Nationality");
        lblcountry.setBounds(60, 320, 100, 20);
        lblcountry.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblcountry);
        
        
        tfcountry = new JTextField();
        tfcountry.setBounds(230, 320, 200, 25);
        //tfname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfcountry);
        
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(60, 380, 100, 20);
        lbladdress.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lbladdress);
        
        
        tfaddress = new JTextField();
        tfaddress.setBounds(230, 380, 200, 25);
        //tfname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfaddress);
        
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(60, 440, 100, 20);
        lblphone.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblphone);
        
        
        tfphone = new JTextField();
        tfphone.setBounds(230, 440, 200, 25);
        //tfname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfphone);
        
        
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(60, 500, 100, 20);
        lblemail.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblemail);
        
        
        tfemail = new JTextField();
        tfemail.setBounds(230, 500, 200, 25);
        //tfname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfemail);
        
        
        
        update = new JButton("Update");
        update.setBounds(100, 600,130,30);
        update.setBackground( Color.DARK_GRAY);
        update.setForeground(Color.WHITE);
        update.setBorder(BorderFactory.createEmptyBorder());
        update.addActionListener(this);
        p2.add(update);
        
        
        back = new JButton("Back");
        back.setBounds(300, 600,130,30);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        p2.add(back);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username ='"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                tfgovernmentId.setText(rs.getString("governmentId"));
                tfidnumber.setText(rs.getString("idnumber"));
                labelname.setText(rs.getString("name"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfemail.setText(rs.getString("email"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
            }
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
        setVisible(true);
        
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== update){
            String username = labelusername.getText();
            String governmentId = tfgovernmentId.getText();
            String idnumber = tfidnumber.getText();
            String name = labelname.getText();
            String gender = tfgender.getText();
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            try{
                Conn c = new Conn();
                String query = "update customer set username='"+username+"', governmentId='"+governmentId+"',idnumber= '"+idnumber+"', name='"+name+"',gender= '"+gender+"', country='"+country+"',email= '"+email+"',address= '"+address+"',phone= '"+phone+"'";
                c.s.executeUpdate(query);     
                JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
            
        }else
            setVisible(false);
            new Dashboard("");
    }
    
    public static void main(String []args){
        new UpdateCustomer("ARYAspecial");
    }
}

