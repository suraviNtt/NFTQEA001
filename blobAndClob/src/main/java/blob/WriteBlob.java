package blob;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteBlob {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost/nft001";
		String username = "root";
		String password = "";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		String insertBlob = "Insert into blobexaple values(?,?)";
		PreparedStatement ps = connection.prepareStatement(insertBlob);
		ps.setInt(1, 101);
		//Reading in input stream to get data in binary form
		FileInputStream file = new FileInputStream("E:\\avatargirl.jpg");
		//inserting the binary file
		ps.setBlob(2, file);
		ps.executeUpdate();
		
		connection.close();
		
	}
}
