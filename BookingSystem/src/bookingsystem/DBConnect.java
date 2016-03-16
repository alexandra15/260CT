

package bookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/*Resources used:
http://www.homeandlearn.co.uk/java/java_and_databases.html
http://www.tutorialspoint.com/jdbc/jdbc-insert-records.htm
*/

public class DBConnect {

    public static void main(String[] args) {
        try {
            String host = "jdbc:derby://localhost:1527/Bookings";
            String uName = "username";
            String uPass = "pass";

            Connection con = DriverManager.getConnection(host, uName, uPass);
            
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM Booking";
            ResultSet rs = stmt.executeQuery(SQL);
            
            /* To query the table:
            int bookRef = rs.getInt("bookRef");
            String bookingDestination = rs.getString("bookingDestination);
            etc..
            
            To insert data into table:
            SQL = "INSERT INTO Booking " + "VALUES(...)";
            stmt =executeUpdate(SQL);
            
            To go to next record:
            rs.next()*/
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
    }
    
}
