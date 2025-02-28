package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class AddCustomer extends JFrame implements ActionListener {
    
    JLabel labelname, labelusername;
    JButton add, back;
    JTextField tfname,tfidnumber, tfusername,tfphone, tfcountry,tfaddress,tfemail;
    Choice governmentId, nationality;
    JRadioButton rmale;
    AddCustomer(String username){
        setSize(1920,1080);
        setLocation(0,0);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        JPanel p1 = new JPanel();
        //p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(150, 50, 400, 600);
        p1.setLayout(null);
        add(p1);
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 400,650);
        p1. add(image);
        
        
        
        
        
        
        
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
        
        governmentId = new Choice();
        governmentId.setBounds(200, 140, 200, 25);
        
        governmentId.setForeground(Color.GRAY);
        governmentId.add(" Passport");
        governmentId.add(" Aadhaar Card");
        governmentId.add(" PAN Card");
        governmentId.add(" Voter ID");
        p2.add(governmentId);
        
        
        
        JLabel lblnumber = new JLabel("ID Number");
        lblnumber.setBounds(60, 200, 100, 20);
        lblnumber.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblnumber);
        
        
        tfidnumber = new JTextField();
        tfidnumber.setBounds(200, 200, 200, 25);
        //tfname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfidnumber);
        
        
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(60, 260, 100, 20);
        lblgender.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblgender);
        
        rmale =new JRadioButton("Male");
        rmale.setBounds(220, 260, 70, 25);
        rmale.setBackground(Color.WHITE);
        p2.add(rmale);        
        rmale =new JRadioButton("Male");
        rmale.setBounds(300, 260, 70, 25);
        rmale.setBackground(Color.WHITE);
        p2.add(rmale);
        
        JLabel lblcountry = new JLabel("Nationality");
        lblcountry.setBounds(60, 320, 100, 20);
        lblcountry.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblcountry);
        
        
        nationality = new Choice();
        nationality.setBounds(200, 320, 200, 25);
        
        nationality.setForeground(Color.GRAY);
        nationality.add(" INDIAN");
        nationality.add(" Others");
        p2.add(nationality);
        
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(60, 380, 100, 20);
        lbladdress.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lbladdress);
        
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 380, 200, 25);
        //tfname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfaddress);
        
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(60, 440, 100, 20);
        lblphone.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblphone);
        
        
        tfphone = new JTextField();
        tfphone.setBounds(200, 440, 200, 25);
        //tfname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfphone);
        
        
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(60, 500, 100, 20);
        lblemail.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblemail);
        
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 500, 200, 25);
        //tfname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfemail);
        
        
        
        add = new JButton("Add");
        add.setBounds(100, 600,130,30);
        add.setBackground( Color.DARK_GRAY);
        add.setForeground(Color.WHITE);
        add.setBorder(BorderFactory.createEmptyBorder());
        add.addActionListener(this);
        p2.add(add);
        
        
        back = new JButton("Back");
        back.setBounds(300, 600,130,30);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        p2.add(back);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username ='"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
            }
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
        setVisible(true);
        
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== add){
            String username = labelusername.getText();
            String governmentId = this.governmentId.getSelectedItem();
            String idnumber = tfidnumber.getText();
            String name = labelname.getText();
            String gender = null;
            if(rmale.isSelected()){
                gender = "Male";
            }else {
                gender = "Female";
            }
            String country = this.nationality.getSelectedItem();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            try{
                Conn c = new Conn();
                String query = "insert into customer values('"+username+"', '"+governmentId+"', '"+idnumber+"', '"+name+"', '"+gender+"', '"+country+"', '"+email+"', '"+address+"', '"+phone+"')";
                c.s.executeUpdate(query);     
                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
            
        }else
            setVisible(false);
            new Dashboard("");
    }
    
    public static void main(String []args){
        new AddCustomer("");
    }
}
