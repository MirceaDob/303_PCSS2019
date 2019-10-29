import java.sql.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MysqlCon {
	
	
	public static void printSQL(int genID) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// dedicated connection url, name and password
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questiondata?useTimezone=true&serverTimezone=UTC", "Test", "root");
			// remember to include the timezone edit
			// used to implement simple SQL elements with no parameters
			Statement stmt = con.createStatement();
			// this one asks for which columns in the table to print out

			int find = genID;
			String query = "SELECT * FROM questiondata WHERE ID = '" + find + "'";
			ResultSet rs = stmt.executeQuery(query);


			while (rs.next()) {
				String ID = rs.getString("ID");
				String qst = rs.getString("Qst");
				String ans1 = rs.getString("Opt1");
				String ans2 = rs.getString("Opt2");
				String ans3 = rs.getString("Opt3");
					
				//System.out.println(ID + " Question: " + qst);
				//System.out.println("A - " +    ans1  +"     B - " + ans2 +"     C - " + ans3);
				
				String[] qna = {qst,ans1,ans2,ans3};
				
				System.out.println(qna[0]);
				System.out.println(qna[1]+"  " + qna[2] + "   " +qna[3] + "   ");
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}