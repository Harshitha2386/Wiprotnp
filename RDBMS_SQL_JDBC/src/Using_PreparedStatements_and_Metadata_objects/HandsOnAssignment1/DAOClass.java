package Using_PreparedStatements_and_Metadata_objects.HandsOnAssignment1;
import java.sql.*;
public class DAOClass {
    Connection con;
    public DAOClass() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","hr","hr123");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void insert(int rollno, String name, String studentClass, String dob, int fee) {
        try {
            String sql = "INSERT INTO STUDENT VALUES(?,?,?,TO_DATE(?,'DD-MON-YYYY'),?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setString(3, studentClass);
            ps.setString(4, dob);
            ps.setInt(5, fee);
            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Record Inserted Successfully");
        } catch (Exception e) {
            System.out.println(e);

        }

    }
    public void delete(int rollno) {
        try {
            String sql = "DELETE FROM STUDENT WHERE ROLLNO=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rollno);
            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Record Deleted Successfully");
            else
                System.out.println("Record Not Found");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public void modify(int rollno, int fee) {
        try {
            String sql = "UPDATE STUDENT SET FEE=? WHERE ROLLNO=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, fee);
            ps.setInt(2, rollno);
            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Record Updated Successfully");
            else
                System.out.println("Record Not Found");
        } catch (Exception e) {
            System.out.println(e);

        }
    }
    public void display(int rollno) {
        try {
            String sql = "SELECT * FROM STUDENT WHERE ROLLNO=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rollno);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                System.out.println("Record Not Found");
                return;
            }
            do {
                System.out.println( rs.getInt("ROLLNO") + " "+ rs.getString("NAME") + " "+ rs.getString("CLASS") + " "+ rs.getDate("DOB") + " "+ rs.getInt("FEE"));
            } while (rs.next());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void display() {
        try {
            String sql = "SELECT * FROM STUDENT";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("ROLLNO") + " "+ rs.getString("NAME") + " "+ rs.getString("CLASS") + " "+ rs.getDate("DOB") + " "+ rs.getInt("FEE"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
