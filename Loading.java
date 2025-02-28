package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    Thread thread;
    String username;
    Loading(){
        setSize(500,300);
        setLocation(200,200);
        //getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("Travel and Tourism Application");
        text.setBounds(85, 20, 500, 30);
        text.setFont(new Font("Raleway", Font.BOLD, 22));
        text.setForeground(Color.BLUE);
        add(text);
        
        JLabel text1 = new JLabel("Fetching Credentials Please Wait...");
        text1.setBounds(250, 200, 500, 20);
        text1.setFont(new Font("Raleway", Font.BOLD, 10));
        text1.setForeground(Color.RED);
        add(text1);
       
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Loading.gif"));
        Image i2 = i1.getImage().getScaledInstance(100, 90, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
         add(image);
          setVisible(true);    
          thread = new Thread(this);
          thread.start();
    }
    public void run(){
        try{
            Thread.sleep(6000);
            
            setVisible(false);
            new Dashboard(username);
        } catch(Exception e){
            
        }
    }

    public static void main(String[] args) {
        new Loading();
    }
}
