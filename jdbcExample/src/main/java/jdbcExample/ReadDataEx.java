package jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadDataEx {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost/nft001";
		String username = "root";
		String password = "";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		
		String fetchtable = "Select * from employee";
		ResultSet result = statement.executeQuery(fetchtable);
		while (result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getInt(3));
			System.out.println(result.getString(4));
		}
		
		connection.close();
	}
}
