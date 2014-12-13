import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Select{ 

    public static void main(String argv[]) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/Starters";
			Connection con = DriverManager.getConnection(url, "root", "password");
			System.out.println("Database connection established");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("SELECT fieldInt, fieldFloat, fieldText, fieldBool, keyText FROM Table1");
			System.out.println("Got some results:");

			while (rs.next()) {
				int a = rs.getInt(1);
				float b = rs.getFloat("fieldFloat");
				String c = rs.getString(3);
				boolean d = rs.getBoolean(4);
				String e = rs.getString("keyText");

				System.out.print("keyText=" + e);
				System.out.print("\t\t fieldInt=" + a);
				System.out.print("\t\t fieldFloat=" + b);
				System.out.print("\t\t fieldText=" + c);
				System.out.print("\t\t fieldBool=" + d);
				System.out.print("\n");
			}
			stmt.close();
			con.close();

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}