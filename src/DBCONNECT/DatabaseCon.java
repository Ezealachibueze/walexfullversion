package DBCONNECT;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseCon {



	
	//		String  url= "jdbc:postgresql://localhost:5432/postgres";
	//		String username="postgres";
	//		String password="vkw6432kvze";
//   String url="jdbc:mariadb://localhost/fun";
//   String user="root";
//   String pass="7h8g2cc";
//  Class.forName("org.postgresql.Driver");
// con=DriverManager.getConnection(Cre.url, Cre.user, Cre.pass);
	
	
	
	
	
	public  Connection getConnection() {
			Connection con=null;
				try {
					 Class.forName("org.mariadb.jdbc.Driver");
					  con=DriverManager.getConnection(Cre.url, Cre._user, Cre._pass);
					  //System.out.println("Connected");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e);
					
				}
				return con;
	}
	
	
	


}
