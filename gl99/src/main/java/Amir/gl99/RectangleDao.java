package Amir.gl99;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RectangleDao extends DAO<Rectangle> {

	@Override
	public Rectangle create(Rectangle obj) {
		// TODO Auto-generated method stub
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("INSERT INTO Rectangle(nom, p.x, p.y, cotervertivale, coterhorizentale)" + " VALUES(?,?,?,?,?)");
			prepare.setString(1, obj.getNom());
			prepare.setInt(2, obj.getPoint().getPointX());
			prepare.setInt(3, obj.getPoint().getPointY());
			prepare.setInt(4, obj.getCoterverticale());
			prepare.setInt(5,  obj.getCoterhorizentale());
			prepare.executeUpdate();
			this.ConnClose();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Rectangle read(String nom) {
		// TODO Auto-generated method stub
		Rectangle obj = null;	
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("SELECT * from Rectangle WHERE nom = ?");
			prepare.setString(1, nom);
			prepare.executeUpdate();
			ResultSet query = prepare.getResultSet();	
			this.ConnClose();
			Point p = new Point(query.getInt("p.x"), query.getInt("p.y"));
			obj = new Rectangle(query.getString("nom"), p, query.getInt("coterverticale"), query.getInt("coterhorizentale"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Rectangle update(Rectangle obj) {
		// TODO Auto-generated method stub
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("UPDATE Rectangle set p.x = ?, p.y = ?, coterverticale = ?, coterhorizentale = ? WHERE nom = ?");
			//	prepare.setString(1, obj.getNom());
			prepare.setInt(1, obj.getPoint().getPointX());
			prepare.setInt(2, obj.getPoint().getPointY());
			prepare.setInt(3, obj.getCoterverticale());
			prepare.setInt(4, obj.getCoterhorizentale());
			prepare.setString(5, obj.getNom());
			prepare.executeUpdate();	
			this.ConnClose();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		return obj;
	}

	@Override
	public void delete(Rectangle obj) {
		// TODO Auto-generated method stub
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("DELETE FROM Rectangle WHERE nom = ?");
			prepare.setString(1, obj.getNom());
			prepare.executeUpdate();	
			this.ConnClose();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
