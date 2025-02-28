
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JTextField tfusername, tfpassword;
    JButton login, signup, forgetpassword;
    Login(){
        setSize(900,600);
        setLocation(200,200);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0, 0, 400, 600);
        p1.setLayout(null);
        add(p1);
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
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
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 20, 100, 25);
        lblusername.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        p2.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(60, 60, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 110, 100, 25);
        lblpassword.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        p2.add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(60, 145, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        login = new JButton("Login");
        login.setBounds(60, 220,130,30);
        login.setBackground(new Color(133,193,233));
        login.setBorder(BorderFactory.createEmptyBorder());
        login.addActionListener(this);
        p2.add(login);
        
        
        signup = new JButton("Signup");
        signup.setBounds(230, 220,130,30);
        signup.setBackground(new Color(133,193,233));
        signup.setBorder(BorderFactory.createEmptyBorder());
        signup.addActionListener(this);
        p2.add(signup);
        
        forgetpassword = new JButton("Forget Password ?");
        forgetpassword.setBounds(145, 270,130,30);
        forgetpassword.setBackground(new Color(133,193,233));
        forgetpassword.setBorder(BorderFactory.createEmptyBorder());
        forgetpassword.addActionListener(this);
        p2.add(forgetpassword);
        
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== login){
         try{
             String username = tfusername.getText();
             String password = tfpassword.getText();
             //
                String query = "select * from account where username = '"+username+"' and password = '"+password+"'";
                Conn c = new Conn();
                c.s.executeQuery(query);
                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()){
                    setVisible(false);
                    new Loading();
                }
                else{
                JOptionPane.showMessageDialog(null, "Incorrect Data..");
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }  
    else  if(ae.getSource()== signup){
        setVisible(false);
            new Signup();
        }  
    else if(ae.getSource()== forgetpassword){
        setVisible(false);
            new ForgetPassword();
        }  
    }
    
    
    public static void main (String []args){
        new Login();
    }
    
}
