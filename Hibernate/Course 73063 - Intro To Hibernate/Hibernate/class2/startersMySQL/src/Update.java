import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class Update {

    public static void main(String argv[]) {
        try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/Starters";
			Connection con = DriverManager.getConnection(url, "root", "password");
			System.out.println("Database connection established");
                       
            // Using Statement ************************************
            Statement stmt1 = con.createStatement();
            int i = stmt1.executeUpdate("UPDATE Table1 SET fieldInt = 300 WHERE fieldText = 'java' ");
            System.out.println("Updated \"java\" row OK using Statement. " + i + " row(s)");

            
            
            // Using Prepared Statement ***************************
            PreparedStatement stmt = con.prepareStatement("UPDATE Table1 SET fieldInt = ? WHERE keyText = ?");

            stmt.setInt(1, 34);
            stmt.setString(2, "Fail");
            i = stmt.executeUpdate();
            System.out.println("Updated \"Fail\" row OK using Prepared Statement. " + i + " row(s)");

            stmt.setString(2, "Goodbye");
            i = stmt.executeUpdate();
            System.out.println("Updated \"Goodbye\" row OK using Prepared Statement. " + i + " row(s)");

            
            
            stmt.close();
            stmt1.close();
            con.close();
            
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
    }
}