package jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataInsertion {

public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost/nft001";
		String username = "root";
		String password = "";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		
		String updateValues = "Insert into employee values (103,'Ram',90000,'Chennai')";
		String updateName = "Update employee SET ename = 'Shiva' where eid = 101";
		statement.executeUpdate(updateName);
		
		connection.close();
	}
}
