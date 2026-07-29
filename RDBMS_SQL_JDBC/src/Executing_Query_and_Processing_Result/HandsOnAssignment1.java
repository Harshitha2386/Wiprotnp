package Executing_Query_and_Processing_Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class HandsOnAssignment1 {
	 public static void main(String[] args) {
	        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	        String username = "hr";
	        String password = "hr123";
	        try {
	            Connection con = DriverManager.getConnection(url, username, password);
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT id, last_name FROM emp");
	            while (rs.next()) {
	                System.out.println("Emp No : " + rs.getInt(1));
	                System.out.println("Name   : " + rs.getString("last_name"));
	                System.out.println("-------------------------");
	            }
	            rs.close();
	            stmt.close();
	            con.close();
	        } catch (Exception e) {
	            System.out.println("Connection could not be established");
	            System.out.println(e.getMessage());
	        }
	    }
}
