
package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;


public class CheckPackage extends JFrame implements ActionListener{
  
    JButton bookPackage, back;
    CheckPackage(){
        setSize(1920,1080);
        setLocation(0,0);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/vacation-holiday-002-128.webp"));
        Image i2 = i1.getImage().getScaledInstance(500, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,100, 390,700);
        add(image);
        
        
        
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(255, 204, 51));
        p1.setBounds(350, 100, 300, 600);
        p1.setLayout(null);
        add(p1);
        
        JLabel lblpackage1 = new JLabel("G O L D");
        lblpackage1.setBounds(90, 20, 300, 30);
        lblpackage1.setFont(new Font("SAN SERIF", Font.BOLD, 30));
        lblpackage1.setForeground(Color.DARK_GRAY);
        p1.add(lblpackage1);
        
        
        JLabel g1 = new JLabel("Ten Days");
        g1.setBounds(30, 100, 300, 30);
        g1.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p1.add(g1);
        
        
        JLabel g2 = new JLabel("Airport Assistance");
        g2.setBounds(30, 150, 300, 30);
        g2.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p1.add(g2);
        
        
        JLabel g3 = new JLabel("Welcome Drinks");
        g3.setBounds(30, 200, 300, 30);
        g3.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p1.add(g3);
        
        
        JLabel g4 = new JLabel("Daily Buffet");
        g4.setBounds(30, 250, 300, 30);
        g4.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p1.add(g4);
        
        
        JLabel g5 = new JLabel("Half-Day City tour");
        g5.setBounds(30, 300, 300, 30);
        g5.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p1.add(g5);
        
        
        JLabel g6 = new JLabel("Full Day 3 Island Cruise");
        g6.setBounds(30, 350, 300, 30);
        g6.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p1.add(g6);
        
        
        JLabel g7 = new JLabel("Speaking Guide");
        g7.setBounds(30, 400, 300, 30);
        g7.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p1.add(g7);
        
        
        
        JLabel g8 = new JLabel("Rs 15000/-");
        g8.setBounds(30, 500, 200, 30);
        g8.setForeground(Color.red);
        g8.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p1.add(g8);
        
        
        /*
        JLabel g9 = new JLabel("G O L D");
        g9.setBounds(100, 20, 100, 30);
        g9.setFont(new Font("SAN SERIF", Font.BOLD, 25));
        p1.add(g9);
        */
        
        
         
        
        
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(192, 192, 192));
        //p2.setBounds(0, 0, 400, 600);
        p2.setLayout(null);
        p2.setBounds(650, 100, 300, 600);
        add(p2);
        
        
        
        JLabel lblpackage2 = new JLabel("S I L V E R");
        lblpackage2.setBounds(70, 20, 300, 30);
        lblpackage2.setFont(new Font("SAN SERIF", Font.BOLD, 30));
        lblpackage2.setForeground(Color.DARK_GRAY);
        p2.add(lblpackage2);
        
        
        JLabel s1 = new JLabel("seven Days");
        s1.setBounds(30, 100, 300, 30);
        s1.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p2.add(s1);
        
        
        JLabel s2 = new JLabel("Airport Assistance");
        s2.setBounds(30, 150, 300, 30);
        s2.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p2.add(s2);
        
        
        JLabel s3 = new JLabel("Welcome Drinks");
        s3.setBounds(30, 200, 300, 30);
        s3.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p2.add(s3);
        
        
        JLabel s4 = new JLabel("Daily Buffet");
        s4.setBounds(30, 250, 300, 30);
        s4.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p2.add(s4);
        
        
        JLabel s5 = new JLabel("3 Half-Day City tour");
        s5.setBounds(30, 300, 300, 30);
        s5.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p2.add(s5);
        
        
        JLabel s6 = new JLabel("Full Day 2 Island Cruise");
        s6.setBounds(30, 350, 300, 30);
        s6.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p2.add(s6);
        
        
        JLabel s7 = new JLabel("Speaking Guide");
        s7.setBounds(30, 400, 300, 30);
        s7.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p2.add(s7);
        
        
        
        JLabel s8 = new JLabel("Rs 12000/-");
        s8.setBounds(30, 500, 200, 30);
        s8.setForeground(Color.red);
        s8.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p2.add(s8);
        
        
        
        
        
        
        
        JPanel p3 = new JPanel();
        p3.setBackground(new Color(205, 127, 50));
        p3.setBounds(950, 100, 300, 600);
        p3.setLayout(null);
        add(p3);
        
        
        
        JLabel lblpackage3 = new JLabel("B R O N Z E");
        lblpackage3.setBounds(60, 20, 300, 30);
        lblpackage3.setFont(new Font("SAN SERIF", Font.BOLD, 30));
        lblpackage3.setForeground(Color.DARK_GRAY);
        p3.add(lblpackage3);
        
        
        JLabel b1 = new JLabel("Five Days");
        b1.setBounds(30, 100, 300, 30);
        b1.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p3.add(b1);
        
        
        JLabel b2 = new JLabel("Airport Assistance");
        b2.setBounds(30, 150, 300, 30);
        b2.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p3.add(b2);
        
        
        JLabel b3 = new JLabel("Welcome Drinks");
        b3.setBounds(30, 200, 300, 30);
        b3.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p3.add(b3);
        
        
        JLabel b4 = new JLabel("Daily Buffet");
        b4.setBounds(30, 250, 300, 30);
        b4.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p3.add(b4);
        
        
        JLabel b5 = new JLabel("3 Half-Day City tour");
        b5.setBounds(30, 300, 300, 30);
        b5.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p3.add(b5);
        
        
        JLabel b6 = new JLabel("Full Day 2 Island Cruise");
        b6.setBounds(30, 350, 300, 30);
        b6.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p3.add(b6);
        
        
        JLabel b7 = new JLabel("Speaking Guide");
        b7.setBounds(30, 400, 300, 30);
        b7.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p3.add(b7);
        
        
        
        JLabel b8 = new JLabel("Rs 9000/-");
        b8.setBounds(30, 500, 200, 30);
        b8.setForeground(Color.red);
        b8.setFont(new Font("SAN SERIF", Font.BOLD, 20));
        p3.add(b8);
        
        
        bookPackage = new JButton("BOOK NOW");
        bookPackage.setBounds(600, 720,130,30);
        bookPackage.setBackground( Color.BLUE);
        bookPackage.setForeground(Color.WHITE);
        bookPackage.setBorder(BorderFactory.createEmptyBorder());
        bookPackage.addActionListener(this);
        add(bookPackage);
        
        
        back = new JButton("Back");
        back.setBounds(800, 720,130,30);
        back.setBackground(Color.red);
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        add(back);
        
        
        setVisible (true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== bookPackage){
            
            setVisible(false);
            new BookPackage("");
            
        }else{
            setVisible(false);
            new Dashboard("");
        }
    }
    
    
    
    public static void main (String args[]){
        new CheckPackage();
    }
}
