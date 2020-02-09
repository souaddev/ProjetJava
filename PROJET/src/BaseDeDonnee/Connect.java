package BaseDeDonnee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	private static Connection connection;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabinetmedicale","root","");   
		}
		catch(ClassNotFoundException e){ 
			//System.out.println("Probl�me au niveau du pilote");
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println("Probl�me au niveau de base ou acc�s au donn�es ");
		}
	}
	
	public static Connection getConnect() {
		return connection;
	}

}
