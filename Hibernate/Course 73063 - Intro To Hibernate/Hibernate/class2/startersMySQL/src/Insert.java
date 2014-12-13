import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class Insert {

    public static void main(String argv[]) {
        try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/Starters";
			Connection con = DriverManager.getConnection(url, "root", "password");
			System.out.println("Database connection established");

            
            
            
            // Using Statement ******************************
            Statement stmt1 = con.createStatement();
            
            int i = stmt1.executeUpdate( "INSERT INTO Table1 VALUES (200,200.,'c',false,'undone')");
            System.out.println("Inserted: row OK using Statement."  + i + " row(s)");
            
            i = stmt1.executeUpdate( "INSERT INTO Table1 (fieldInt,fieldFloat,fieldText,fieldBool,keyText) " +
            		                  "VALUES (999,99.,'many',true,'present')");
            System.out.println("Inserted: row OK using Statement."  + i + " row(s)");
            
            
            
            
            
            //Using Prepared Statement **********************
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Table1 VALUES (?,?,?,?,?)");
            stmt.setInt(1, 100);
            stmt.setDouble(2, 100.);
            stmt.setString(3, "java");
            stmt.setBoolean(4, true);
            stmt.setString(5, "done");

            stmt.executeUpdate();
            System.out.println("Inserted: row OK using Prepared Statement.");

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