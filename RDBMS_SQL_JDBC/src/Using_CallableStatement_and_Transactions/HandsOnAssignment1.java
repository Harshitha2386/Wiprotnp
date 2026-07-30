package Using_CallableStatement_and_Transactions;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
public class HandsOnAssignment1 {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1","hr", "hr123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery( "SELECT EMPLOYEE_ID,FIRST_NAME FROM EMPLOYEES");
            System.out.println("----------------------------------------");
            System.out.println("EMPLOYEE_ID\tNAME\tNET SALARY");
            System.out.println("----------------------------------------");
            while (rs.next()) {
                int empId = rs.getInt("EMPLOYEE_ID");
                String name = rs.getString("FIRST_NAME");
                CallableStatement cs =con.prepareCall("{call CAL_NETSAL(?,?)}");
                cs.setInt(1, empId);
                cs.registerOutParameter(2, Types.DOUBLE);
                cs.execute();
                double netSalary = cs.getDouble(2);
                System.out.println(empId + "\t\t" + name + "\t" + netSalary);
                cs.close();
            }
            rs.close();
            st.close();
            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
