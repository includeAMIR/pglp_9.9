package Amir.gl99;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarreDao extends DAO<Carre>{
	@Override
	public Carre create(Carre obj) {
		// TODO Auto-generated method stub
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("INSERT INTO Carre(nom, p.x, p.y, coter)" + " VALUES(?,?,?,?)");
			prepare.setString(1, obj.getNom());
			prepare.setInt(2, obj.getP().getPointX());
			prepare.setInt(3, obj.getP().getPointY());
			prepare.setInt(4, obj.getCoter());
			prepare.executeUpdate();
			this.ConnClose();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	@Override
	public Carre read(String nom) {
		// TODO Auto-generated method stub
		Carre obj = null;	
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("SELECT * from Carre WHERE nom = ?");
			prepare.setString(1, nom);
			prepare.executeUpdate();
			ResultSet query = prepare.getResultSet();	
			this.ConnClose();
			Point p = new Point(query.getInt("p.x"), query.getInt("p.y"));
			obj = new Carre(query.getString("nom"), p, query.getInt("coter"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	@Override
	public Carre update(Carre obj) {
		// TODO Auto-generated method stub
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("UPDATE Carre set nom = ?, p.x = ?, p.y = ?, coter = ? WHERE nom = ?");
			//	prepare.setString(1, obj.getNom());
			prepare.setInt(1, obj.getP().getPointX());
			prepare.setInt(2, obj.getP().getPointY());
			prepare.setInt(3, obj.getCoter());
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
	public void delete(Carre obj) {
		// TODO Auto-generated method stub
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("DELETE FROM Carre WHERE nom = ?");
			prepare.setString(1, obj.getNom());
			prepare.executeUpdate();	
			this.ConnClose();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
