package Using_PreparedStatements_and_Metadata_objects;
import java.sql.*;
public class HandsOnAssignment5 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","hr","hr123");
            if (args.length == 1) {
                String sql = "SELECT * FROM STUDENT WHERE ROLLNO = ?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(args[0]));
                rs = ps.executeQuery();
                if (rs.next()) {
                    System.out.println("Roll No      : " + rs.getInt("ROLLNO"));
                    System.out.println("Student Name : " + rs.getString("NAME"));
                    System.out.println("Standard     : " + rs.getString("CLASS"));
                    System.out.println("DOB          : " + rs.getDate("DOB"));
                    System.out.println("Fee          : " + rs.getDouble("FEE"));
                } else {
                    System.out.println("Student not found.");
                }
            }
            else {
                String sql = "SELECT * FROM STUDENT";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getInt("ROLLNO") + "\t"+ rs.getString("NAME") + "\t" + rs.getString("CLASS") + "\t" + rs.getDate("DOB") + "\t"+ rs.getDouble("FEE"));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (ps != null)
                    ps.close();
                if (con != null)
                    con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}