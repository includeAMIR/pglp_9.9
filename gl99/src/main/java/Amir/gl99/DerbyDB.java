package Amir.gl99;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DerbyDB {
	public final String dburl = "jdbc:derby:gl99;create=true";
	public final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	  public void Connectionn() throws SQLException, ClassNotFoundException{
		  Class.forName(DRIVER);
		  Connection conn = DriverManager.getConnection(dburl);
		  System.out.println("Connecter");
	  }
}
