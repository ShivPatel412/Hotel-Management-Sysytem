
package hotel.management.system;

import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    
    public conn(){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            s = c.createStatement();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    ResultSet executeQuery(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
