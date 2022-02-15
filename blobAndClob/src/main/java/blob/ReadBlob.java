package blob;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadBlob {

	public static void main(String[] args) throws SQLException, Exception {
		
		String url = "jdbc:mysql://localhost/nft001";
		String username = "root";
		String password = "";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from blobexaple");
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			Blob  b = rs.getBlob(2);
			byte arr[] = b.getBytes(1, (int) b.length());
			FileOutputStream fo = new FileOutputStream("E:\\blob_object.jpg");
			fo.write(arr);	
		}
		
		connection.close();
	}
}
