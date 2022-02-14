package jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class DynamicUpdateExample {

public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost/nft001";
		String username = "root";
		String password = "";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		
		String updateValues = "Insert into employee values (?,?,?,?)";
		String updateName = "Update employee SET ename = ? where eid = ?";
		
		PreparedStatement statement = connection.prepareStatement(updateValues);
		statement.setInt(1, 104);
		statement.setString(2, "Pankaj");
		statement.setInt(3, 1500004);
		statement.setString(4, "Mumbai");
		statement.executeUpdate();
		statement.setInt(1, 105);
		statement.setString(2, "Priya");
		statement.setInt(3, 1500004);
		statement.setString(4, "Patna");
		statement.executeUpdate();
		statement.setInt(1, 106);
		statement.setString(2, "Pallavi");
		statement.setInt(3, 1500004);
		statement.setString(4, "Belur");
		statement.executeUpdate();
		
		PreparedStatement ps = connection.prepareStatement(updateName);
		ps.setString(1, "Leela");
		ps.setInt(2, 104);
		ps.executeUpdate();
		
		connection.close();
	}
}
