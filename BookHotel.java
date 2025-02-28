
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class BookHotel extends JFrame implements ActionListener{
    
    Choice chooseHotel,food,RoomType;
    JButton price, book, back;
    JTextField tfperson,tfDays ;
    JLabel labelprice, labelusername, labelphone, labelID,labelIDno;
    
    
    String username;
    BookHotel(String username){
        this.username = username;
        setSize(1920,1080);
        setLocation(0,0);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        JLabel lblHead = new JLabel("BOOK HOTEL");
        lblHead.setBounds(650, 50, 600, 50);
        lblHead.setFont(new Font("Tahoma", Font.PLAIN, 45));
        add(lblHead);
        
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBounds(0, 150, 700, 500);
        p1.setLayout(null);
        add(p1);
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 500);
        p1. add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(700, 100, 650, 800);
        p2.setBackground(Color.WHITE);
        add(p2);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(100, 60, 100, 20);
        lblusername.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(240, 60, 200, 25);
        labelusername.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(labelusername);
        
        JLabel selectHotel = new JLabel("Select Hotel");
        selectHotel.setBounds(100, 120, 100, 20);
        selectHotel.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(selectHotel);
        
        
        chooseHotel = new Choice();
        chooseHotel.setBounds(240, 120, 200, 25);
        chooseHotel.setForeground(Color.GRAY);
        p2.add(chooseHotel);
        
        try {
            Conn c = new Conn();
            ResultSet rs =  c.s.executeQuery("select * from hotel");
            while(rs.next()){
                chooseHotel.add(rs.getString("name"));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        JLabel totalPerson = new JLabel("Total Person");
        totalPerson.setBounds(100, 180, 120, 20);
        totalPerson.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(totalPerson);
        
        tfperson = new JTextField("1");
        tfperson.setBounds(240, 180, 200, 20);
        //tfperson.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfperson);
        
        
        
        
        
        
        JLabel lblDays = new JLabel("No. of Days");
        lblDays.setBounds(100, 240, 120, 20);
        lblDays.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(lblDays);
        
        tfDays = new JTextField("1");
        tfDays.setBounds(240, 240, 200, 20);
        //tfDays.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfDays);
        
        
        
        
        
        
        JLabel lblRoomType = new JLabel("AC/Non-AC");
        lblRoomType.setBounds(100, 300, 120, 20);
        lblRoomType.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(lblRoomType);
        
        
        RoomType = new Choice();
        RoomType.add("AC Room");
        RoomType.add("Non-AC Room");
        RoomType.setBounds(240, 300, 200, 25);
        RoomType.setForeground(Color.GRAY);
        p2.add(RoomType);
        
        
        
        
        
        JLabel lblfood = new JLabel("Food Included");
        lblfood.setBounds(100, 360, 120, 20);
        lblfood.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(lblfood);
        
        food = new Choice();
        food.add("YES");
        food.add("NO");
        food.setBounds(240, 360, 200, 25);
        food.setForeground(Color.GRAY);
        p2.add(food);
        
        
        
        JLabel lblID = new JLabel("Government ID");
        lblID.setBounds(100, 420, 100, 20);
        lblID.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(lblID);
        
        labelID = new JLabel();
        labelID.setBounds(240, 420, 200, 25);
        labelID.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(labelID);
        
        
        
        
        JLabel lblIdNo = new JLabel("ID No.");
        lblIdNo.setBounds(100, 480, 100, 20);
        lblIdNo.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(lblIdNo);
        
        labelIDno = new JLabel();
        labelIDno.setBounds(240, 480, 200, 25);
        labelIDno.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(labelIDno);
        
        
        
        
        
        
        
        JLabel phone = new JLabel("Phone");
        phone.setBounds(100, 540, 100, 20);
        phone.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(phone);
        
        labelphone = new JLabel();
        labelphone.setBounds(240, 540, 200, 25);
        labelphone.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(labelphone);
        
        
        JLabel totalPrice = new JLabel("Total Price");
        totalPrice.setBounds(100, 600, 100, 20);
        totalPrice.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(totalPrice);
        
        
        labelprice = new JLabel();
        labelprice.setBounds(240, 600, 200, 25);
        labelprice.setFont(new Font("SAN SERIF", Font.PLAIN, 14));
        p2.add(labelprice);
        
        
        price = new JButton("Check Price");
        price.setBounds(500, 360, 120, 30);
        price.setBackground(Color.GREEN);
        price.setForeground(Color.WHITE);
        price.setBorder(BorderFactory.createEmptyBorder());
        price.addActionListener(this);
        p2.add(price);
        
        
        book = new JButton("Book Now");
        book.setBounds(180, 700, 150, 40);
        book.setBackground(Color.blue);
        book.setForeground(Color.WHITE);
        book.setBorder(BorderFactory.createEmptyBorder());
        book.addActionListener(this);
        add(book);
        
        back = new JButton("Back");
        back.setBounds(500, 700, 150, 40);
        back.setBackground(Color.red);
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        add(back);
        
        
        
         try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username ='"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelphone.setText(rs.getString("phone"));
                labelID.setText(rs.getString("governmentId"));
                labelIDno.setText(rs.getString("idnumber"));
                
            }
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == price){
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from hotel where name =  '"+chooseHotel.getSelectedItem()+"'");
                while(rs.next()){
                    int roomcost = Integer.parseInt(rs.getString("costperperson"));
                    int foodcost = Integer.parseInt(rs.getString("foodincluded"));
                    int accost = Integer.parseInt(rs.getString("acroom")); 
                
                    int persons = Integer.parseInt(tfperson.getText());
                    int days = Integer.parseInt(tfDays.getText());
                
                    String acselected = RoomType.getSelectedItem();
                    String foodselected = food.getSelectedItem();
                
                    if(persons * days >0){
                        int cost = 0;
                        cost += acselected.equals("AC Room") ? accost : 0;
                        cost += foodselected.equals("YES") ? foodcost : 0;
                        cost += roomcost;
                        cost = cost * persons * days;
                        labelprice.setText("Rs." + cost);
                    } else
                        JOptionPane.showMessageDialog(null, "Please Enter Valid Number.");
                }
                
                
                
                } catch (Exception e){
                e.printStackTrace();
            }
                      
            }else if(ae.getSource()== book){
             
                try{
                    Conn c =new Conn();
                    c.s.executeUpdate("insert into bookHotel value('"+labelusername.getText()+"', '"+chooseHotel.getSelectedItem()+"', '"+tfperson.getText()+"', '"+tfDays.getText()+"', '"+RoomType.getSelectedItem()+"', '"+food.getSelectedItem()+"', '"+labelID.getText()+"','"+labelIDno.getText()+"', '"+labelphone.getText()+"', '"+labelprice.getText()+"')");
                    JOptionPane.showMessageDialog(null,"Hotel Booked Successfully!!");
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
        new BookHotel("ARYAspecial");
    }
    
}

