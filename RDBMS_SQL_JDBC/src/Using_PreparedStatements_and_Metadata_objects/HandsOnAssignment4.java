package Using_PreparedStatements_and_Metadata_objects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class HandsOnAssignment4 {
	public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","hr","hr123");
            int rollNo = Integer.parseInt(args[0]);
            double fee = Double.parseDouble(args[1]);
            String sql = "UPDATE STUDENT SET FEE = ? WHERE ROLLNO = ?";
            ps = con.prepareStatement(sql);
            ps.setDouble(1, fee);
            ps.setInt(2, rollNo);
            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Student record updated successfully.");
            else
                System.out.println("Student not found.");
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
