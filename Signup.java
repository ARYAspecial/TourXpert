package travel.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Signup extends JFrame implements ActionListener{
    
    JButton create, back;
    JTextField tfname, tfusername,tfpassword, tfanswer;
    Choice security;
    
    Signup(){
        setSize(900,600);
        setLocation(200,200);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        JPanel p1 = new JPanel();
        //p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0, 0, 400, 600);
        p1.setLayout(null);
        add(p1);
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 175, 200, 200);
        p1. add(image);
        
        
        
        
        
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(131, 193, 233));
        //p2.setBounds(0, 0, 400, 600);
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 500);
        add(p2);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(60, 20, 100, 20);
        lblname.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(160, 20, 200, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfname);
        
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 80, 100, 20);
        lblusername.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(160, 80, 200, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 140, 100, 20);
        lblpassword.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(160, 140, 200, 25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        
        
        JLabel lblsecurity = new JLabel("security");
        lblsecurity.setBounds(60, 200, 100, 20);
        lblsecurity.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblsecurity);
        
        security = new Choice();
        security.setBounds(160, 200, 200, 25);
        security.setForeground(Color.GRAY);
        security.add(" Your Lucky Number!!");
        security.add(" Your Favorite Person !!");
        security.add(" Your Favorite Cricket Player!!");
        security.add(" Your First School!!");
        security.add(" Your Date of Birth!!");
        p2.add(security);
        
        
        
        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setBounds(60, 260, 100, 20);
        lblanswer.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblanswer);
        
        tfanswer = new JTextField();
        tfanswer.setBounds(160, 260, 200, 25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfanswer);
        
        
        
        
        create = new JButton("Create");
        create.setBounds(60, 320,130,30);
        create.setBackground( Color.LIGHT_GRAY);
        create.setForeground(Color.WHITE);
        create.setBorder(BorderFactory.createEmptyBorder());
        create.addActionListener(this);
        p2.add(create);
        
        
        back = new JButton("Back");
        back.setBounds(230, 320,130,30);
        back.setBackground(Color.LIGHT_GRAY);
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        p2.add(back);
        
        
        
        setVisible(true);
    }
    
    @Override
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == create){
            
            String name = tfname.getText();
            String username = tfusername.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();
            
            String query = "insert into account (name, username, password, security, answer) values('"+name+"', '"+username+"', '"+password+"', '"+question+"', '"+answer+"')";
            try {
                Conn c = new Conn();
                c .s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Account Created Successfully..");
                
                setVisible(false);
                new Login();
            }catch (Exception e){
                e.printStackTrace();
            }
            
            
        } else if(ae.getSource() == back){
            setVisible(false);
            new Login();
        }
    }
    public static void main(String []args){
        new Signup();
    }
}
