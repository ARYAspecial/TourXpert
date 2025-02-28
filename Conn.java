package travel.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        /*try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("MySQL JDBC Driver is available.");
        } 
        catch (ClassNotFoundException e) {
        System.out.println("MySQL JDBC Driver is NOT available in the classpath.");
        e.printStackTrace();
        }*/
                
                
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem", "root", "Arya@0808");
            s = c.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         
    }
}
