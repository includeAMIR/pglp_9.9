package Amir.gl99;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CercleDao extends DAO<Cercle> {

	@Override
	public Cercle create(Cercle obj) {
		// TODO Auto-generated method stub
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("INSERT INTO Cercle(nom, p.x, p.y, rayon)" + " VALUES(?,?,?,?)");
			prepare.setString(1, obj.getNom());
			prepare.setInt(2, obj.getCentre().getPointX());
			prepare.setInt(3, obj.getCentre().getPointY());
			prepare.setInt(4, obj.getRayon());
			prepare.executeUpdate();
			this.ConnClose();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Cercle read(String nom) {
		// TODO Auto-generated method stub
		Cercle obj = null;	
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("SELECT * from Cercle WHERE nom = ?");
			prepare.setString(1, nom);
			prepare.executeUpdate();
			ResultSet query = prepare.getResultSet();	
			this.ConnClose();
			Point centre = new Point(query.getInt("p.x"), query.getInt("p.y"));
			obj = new Cercle(query.getString("nom"), centre, query.getInt("rayon"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Cercle update(Cercle obj) {
		// TODO Auto-generated method stub
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("UPDATE Cercle set p.x = ?, p.y = ?, coter = ? WHERE nom = ?");
			//	prepare.setString(1, obj.getNom());
			prepare.setInt(1, obj.getCentre().getPointX());
			prepare.setInt(2, obj.getCentre().getPointY());
			prepare.setInt(3, obj.getRayon());
			prepare.setString(4, obj.getNom());
			prepare.executeUpdate();	
			this.ConnClose();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public void delete(Cercle obj) {
		// TODO Auto-generated method stub
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("DELETE FROM Cercle WHERE nom = ?");
			prepare.setString(1, obj.getNom());
			prepare.executeUpdate();	
			this.ConnClose();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
