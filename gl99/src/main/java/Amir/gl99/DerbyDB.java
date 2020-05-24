package Amir.gl99;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DerbyDB {
	public final String dburl = "jdbc:derby:gl99;create=true";
	public final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	  public DerbyDB(){
		  try {
			  Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection conn = DriverManager.getConnection(dburl);
			if(conn != null) {
				System.out.println("Connecter");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
