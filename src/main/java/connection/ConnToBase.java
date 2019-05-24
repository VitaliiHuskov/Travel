package connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnToBase {
	
	public ConnToBase() {
		
	}

	public Connection getConnection() {
		Connection connection = null;
		try {
			InitialContext initContext = new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:comp/env/connPool");
			connection = ds.getConnection();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
