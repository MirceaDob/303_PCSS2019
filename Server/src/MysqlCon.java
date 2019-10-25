import java.sql.*;



public class MysqlCon {
	public static void printSQL() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//dedicated connection url, name and password
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questiondata", "root", "Matus_2208");
			//used to implement simple SQL elements with no parameters
			Statement stmt = con.createStatement();
			//this one asks for which columns in the table to print out
			ResultSet rs = stmt.executeQuery("select ID, Qst, Opt1, Opt2, Opt3 from questiondata");
			while (rs.next())
				//prints out in the console the columns, number suggests the column
				System.out.println(rs.getInt(1) + " | " + rs.getString(2) + "     A (" + rs.getString(3) +")"+ "     B (" + rs.getString(4)+")" + "     C (" + rs.getString(5)+")");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}