import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class InsertPS {
	
    public static void main(String argv[]) {

    	Connection con = null;
    	PreparedStatement stmt = null;    	
    	Statement stmt1 = null;
    	ResultSet rs = null;
    	
		Scanner keyboard = null;

		try {
			keyboard = new Scanner(new File("data.in"));
		} catch (FileNotFoundException e1) {
            System.exit(0);
		}

    	try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/Starters";
			con = DriverManager.getConnection(url, "root", "password");
			System.out.println("Database connection established");

            stmt = con.prepareStatement("INSERT INTO people " + 
            		"(firstname,lastname,email,userId,gender,height,weight,modified)" + 
            		" VALUES (?,?,?,?,?,?,?,?)");

			System.out.println("\nLoading Data from file......");

			int count = 0;
            while (keyboard.hasNext()){
            	String[] record = (keyboard.next()).split(":");
 			
            	stmt.setString(1, record[0]);
            	stmt.setString(2, record[1]);
				stmt.setString(3, record[2]);
				stmt.setInt(4, Integer.parseInt(record[3]));
				stmt.setString(5, record[4]);
				stmt.setInt(6, Integer.parseInt(record[5]));
				stmt.setInt(7, Integer.parseInt(record[6]));
				stmt.setTimestamp(8, new Timestamp((new java.util.Date()).getTime()));

				stmt.executeUpdate();
				count++;
				System.out.println("Inserted: row OK. count: " + count);           
            }

            stmt1 = con.createStatement();
            rs = stmt1.executeQuery("select * from people");
            Person person = null;
            HashMap bag = new HashMap();
			System.out.println("\nLoading Data from database......");
            while (rs.next()){
                person = new Person();
            	person.setFirstName(rs.getString("firstname"));
            	person.setLastName(rs.getString("lastname"));
            	person.setEmail(rs.getString("email"));
            	bag.put(rs.getInt("id"),person);
            	
            	System.out.println(person.toString());
            }
        	System.out.println("\nBag size is " + bag.size());

            Iterator it = bag.keySet().iterator();
            System.out.println("\nIterator Results");
            while(it.hasNext()){
            	Person p = (Person)bag.get(it.next());
            	System.out.println(p.getFirstName());
            }

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();// not good!
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();// not good!

		} finally {
			try {
				rs.close();
				stmt.close();
				stmt1.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();// not good!
			}
		}
    }
}