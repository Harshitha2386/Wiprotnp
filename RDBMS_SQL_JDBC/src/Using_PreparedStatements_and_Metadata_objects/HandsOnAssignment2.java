package Using_PreparedStatements_and_Metadata_objects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class HandsOnAssignment2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","hr","hr123");
            String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, 1001);
            ps.setString(2, "AJIT");
            ps.setString(3, "IV");
            ps.setDate(4, java.sql.Date.valueOf("2001-11-20"));
            ps.setDouble(5, 4000);
            ps.executeUpdate();

            ps.setInt(1, 1002);
            ps.setString(2, "RAHUL");
            ps.setString(3, "VI");
            ps.setDate(4, java.sql.Date.valueOf("2002-05-15"));
            ps.setDouble(5, 4500);
            ps.executeUpdate();

            ps.setInt(1, 1003);
            ps.setString(2, "KIRAN");
            ps.setString(3, "X");
            ps.setDate(4, java.sql.Date.valueOf("2000-09-10"));
            ps.setDouble(5, 5000);
            ps.executeUpdate();

            System.out.println("Records inserted successfully.");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
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
