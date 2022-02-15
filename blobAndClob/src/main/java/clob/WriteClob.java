package clob;

import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WriteClob {

public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost/nft001";
		String username = "root";
		String password = "";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		String insertBlob = "Insert into clobexample values(?,?)";
		PreparedStatement ps = connection.prepareStatement(insertBlob);
		ps.setInt(1, 102);
		//Reading in input stream to get data in binary form
		FileReader file = new FileReader("E:\\testfile.txt");
		//inserting the binary file
		ps.setClob(2, file);
		ps.executeUpdate();
		
		connection.close();
		
	}

}
