package Amir.gl99;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DAO<T> {
	public abstract T create(T obj);
	public abstract T read(String id);
	public abstract T update(T obj);
	public abstract void delete(T obj);
	Connection conn;
	public Connection getConnection() {
		final String dburl = "jdbc:derby:DBgl99;create=true";
		final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
		  try {
			 // Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			conn = DriverManager.getConnection(dburl);
			if(conn != null) {
				System.out.println("Connecter");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		}
		return conn;
	}
	public void ConnClose() throws SQLException {
		this.conn.close();
	}
}