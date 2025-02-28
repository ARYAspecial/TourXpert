package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    JButton addPersonalDetails, updatePersonalDetails,checkPackage,viewDetails,
            deletePersonalDetails,viewPackage, bookPackage,viewHotels,bookHotel,
            viewBookedHotel,destinations,payments,about;
    String username;
    Dashboard(String username){
        this.username=username;
        setBounds(0, 0, 1920, 1080);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(47,79,79));
        p1.setBounds(0, 0, 1900,75);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/12651541.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(10, 0, 70, 70);
        p1. add(image1);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        heading.setForeground(Color.WHITE);
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(47,79,79));
        p2.setBounds(0, 65, 300,900);
        add(p2);
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 10,300,50);
        addPersonalDetails.setBackground(new Color(47,79,79));
        addPersonalDetails.setForeground(Color.LIGHT_GRAY);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //addPersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 50,300,50);
        updatePersonalDetails.setBackground(new Color(47,79,79));
        updatePersonalDetails.setForeground(Color.LIGHT_GRAY);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //updatePersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        
        
        
        viewDetails = new JButton("View Details");
        viewDetails.setBounds(0, 90,300,50);
        viewDetails.setBackground(new Color(47,79,79));
        viewDetails.setForeground(Color.LIGHT_GRAY);
        viewDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //updatePersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        viewDetails.addActionListener(this);
        p2.add(viewDetails);
        
        
        
        
        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 130,300,50);
        deletePersonalDetails.setBackground(new Color(47,79,79));
        deletePersonalDetails.setForeground(Color.LIGHT_GRAY);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //updatePersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        p2.add(deletePersonalDetails);
        
        
        
        checkPackage = new JButton("Check Package");
        checkPackage.setBounds(0, 170,300,50);
        checkPackage.setBackground(new Color(47,79,79));
        checkPackage.setForeground(Color.LIGHT_GRAY);
        checkPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkPackage.addActionListener(this);
        //checkPackage.setBorder(BorderFactory.createEmptyBorder());
        p2.add(checkPackage);
        
        
        
        bookPackage = new JButton("Book Package");
        bookPackage.setBounds(0, 210,300,50);
        bookPackage.setBackground(new Color(47,79,79));
        bookPackage.setForeground(Color.LIGHT_GRAY);
        bookPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookPackage.addActionListener(this);
       
        //updatePersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        p2.add(bookPackage);
        
        
        
        viewPackage = new JButton("View Package");
        viewPackage.setBounds(0, 250,300,50);
        viewPackage.setBackground(new Color(47,79,79));
        viewPackage.setForeground(Color.LIGHT_GRAY);
        viewPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPackage.addActionListener(this);
        //updatePersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        p2.add(viewPackage);
        
        
        
        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0, 290,300,50);
        viewHotels.setBackground(new Color(47,79,79));
        viewHotels.setForeground(Color.LIGHT_GRAY);
        viewHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //updatePersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        p2.add(viewHotels);
        
        
        
        bookHotel = new JButton("Book Hotel");
        bookHotel.setBounds(0, 330,300,50);
        bookHotel.setBackground(new Color(47,79,79));
        bookHotel.setForeground(Color.LIGHT_GRAY);
        bookHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookHotel.addActionListener(this);
        p2.add(bookHotel);
        
        
        
        viewBookedHotel = new JButton("View Booked Hotel");
        viewBookedHotel.setBounds(0, 370,300,50);
        viewBookedHotel.setBackground(new Color(47,79,79));
        viewBookedHotel.setForeground(Color.LIGHT_GRAY);
        viewBookedHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //updatePersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        p2.add(viewBookedHotel);
        
        
        
        destinations = new JButton("Destinations");
        destinations.setBounds(0, 410,300,50);
        destinations.setBackground(new Color(47,79,79));
        destinations.setForeground(Color.LIGHT_GRAY);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //updatePersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        p2.add(destinations);
        
        
        
        payments = new JButton("Payments");
        payments.setBounds(0, 450,300,50);
        payments.setBackground(new Color(47,79,79));
        payments.setForeground(Color.LIGHT_GRAY);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //updatePersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        p2.add(payments);
        
        
        
        about = new JButton("About");
        about.setBounds(0, 490,300,50);
        about.setBackground(new Color(47,79,79));
        about.setForeground(Color.LIGHT_GRAY);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //updatePersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        p2.add(about);
        
        
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(100, 75, 1650, 1000);
         add(image2);
        
        JLabel title = new JLabel("TourExpert: Bihar Darshan");
        title.setBounds(570, 30, 1200, 70);
        title.setFont(new Font("Serif", Font.BOLD, 40));
        title.setForeground(Color.CYAN);
        image2.add(title);
        
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== addPersonalDetails){
            new AddCustomer(username);
        } else if (ae.getSource()== viewDetails){
            new viewCustomer(username);
        } else if (ae.getSource()== updatePersonalDetails){
            new UpdateCustomer(username);
        } else if (ae.getSource()== checkPackage){
            new CheckPackage();
        } else if (ae.getSource()== bookPackage){
            new BookPackage(username);
        } else if (ae.getSource()== viewPackage){
            new SelectedPackage(username);
        }else if (ae.getSource()== bookHotel){
            new BookHotel(username);
        }
    }
    
    
    public static void main(String []args){
        new Dashboard("");
    }
}
