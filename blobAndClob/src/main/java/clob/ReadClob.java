package clob;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadClob {

public static void main(String[] args) throws SQLException, Exception {
		
		String url = "jdbc:mysql://localhost/nft001";
		String username = "root";
		String password = "";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from clobexample");
		while (rs.next()) {
			int eid = rs.getInt(1);
			System.out.println(rs.getInt(1));
		    Clob c = rs.getClob(2);
			Reader r = c.getCharacterStream();
			FileWriter fw = new FileWriter("E:\\clob_object_"+eid+".txt");
			int i;
			while ((i = r.read())!=-1) {
				fw.write(i);
			}
			fw.close();
			
		}
		connection.close();
	}

}
