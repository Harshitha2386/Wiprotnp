package Using_PreparedStatements_and_Metadata_objects;

import java.sql.*;
public class HandsOnAssignment3 {
	 public static void main(String[] args) {
	        Connection con = null;
	        PreparedStatement psSelect = null;
	        PreparedStatement psInsert = null;
	        PreparedStatement psDelete = null;
	        ResultSet rs = null;
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1", "hr","hr123");
	            int rollNo = Integer.parseInt(args[0]);
	            psSelect = con.prepareStatement("SELECT ROLLNO, NAME, CLASS FROM STUDENT WHERE ROLLNO=?");
	            psSelect.setInt(1, rollNo);
	            rs = psSelect.executeQuery();
	            if (rs.next()) { 
	                psInsert = con.prepareStatement("INSERT INTO STUDENTLOG VALUES(?,?,?,SYSDATE)");
	                psInsert.setInt(1, rs.getInt("ROLLNO"));
	                psInsert.setString(2, rs.getString("NAME"));
	                psInsert.setString(3, rs.getString("CLASS"));
	                psInsert.executeUpdate();
	                psDelete = con.prepareStatement("DELETE FROM STUDENT WHERE ROLLNO=?");
	                psDelete.setInt(1, rollNo);
	                psDelete.executeUpdate();
	                System.out.println("Student record deleted successfully.");
	            } else {
	                System.out.println("Student not found.");
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        } finally {
	            try {
	                if (rs != null)
	                    rs.close();
	                if (psSelect != null)
	                    psSelect.close();
	                if (psInsert != null)
	                    psInsert.close();
	                if (psDelete != null)
	                    psDelete.close();
	                if (con != null)
	                    con.close();
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }
}
