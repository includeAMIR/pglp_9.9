package Amir.gl99;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TriangleDao extends DAO<Triangle> {

	@Override
	public Triangle create(Triangle obj) {
		// TODO Auto-generated method stub
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("INSERT INTO Triangle(nom, p1.x, p1.y, p2.x, p2.y, p3.x, p3.y)" + " VALUES(?,?,?,?,?,?,?)");
			prepare.setString(1, obj.getNom());
			prepare.setInt(2, obj.getP1().getPointX());
			prepare.setInt(3, obj.getP1().getPointY());
			prepare.setInt(4, obj.getP2().getPointX());
			prepare.setInt(5, obj.getP2().getPointY());
			prepare.setInt(6, obj.getP3().getPointX());
			prepare.setInt(7, obj.getP3().getPointY());
			prepare.executeUpdate();
			this.ConnClose();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Triangle read(String nom) {
		// TODO Auto-generated method stub
		Triangle obj = null;	
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("SELECT * from Triangle WHERE nom = ?");
			prepare.setString(1, nom);
			prepare.executeUpdate();
			ResultSet query = prepare.getResultSet();	
			this.ConnClose();
			Point p1 = new Point(query.getInt("p1.x"), query.getInt("p1.y"));
			Point p2 = new Point(query.getInt("p2.x"), query.getInt("p3.y"));
			Point p3 = new Point(query.getInt("p3.x"), query.getInt("p3.y"));
			obj = new Triangle(query.getString("nom"), p1, p2, p3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Triangle update(Triangle obj) {
		// TODO Auto-generated method stub
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("UPDATE Triangle set p1.x = ?, p1.y = ?,"
					+ " p2.x = ?, p2.y = ?, p3.x = ?, p3.y = ? WHERE nom = ?");
			//	prepare.setString(1, obj.getNom());
			prepare.setInt(1, obj.getP1().getPointX());
			prepare.setInt(2, obj.getP1().getPointY());
			prepare.setInt(3, obj.getP2().getPointX());
			prepare.setInt(4, obj.getP2().getPointY());
			prepare.setInt(5, obj.getP3().getPointX());
			prepare.setInt(6, obj.getP3().getPointY());
			prepare.setString(7, obj.getNom());
			prepare.executeUpdate();	
			this.ConnClose();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public void delete(Triangle obj) {
		// TODO Auto-generated method stub
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("DELETE FROM Triangle WHERE nom = ?");
			prepare.setString(1, obj.getNom());
			prepare.executeUpdate();	
			this.ConnClose();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
