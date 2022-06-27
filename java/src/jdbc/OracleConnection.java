package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class OracleConnection {

	
	public static Connection getConnection()throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@192.168.100.121:1521:xe";
		String user="java10";
		String pwd="java";
		Connection conn = DriverManager.getConnection(url,user,pwd);
		return conn;
		
	}
	
}
