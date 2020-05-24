package Amir.gl99;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShapeCompositeDao extends DAO<ShapeComposite> {

	@Override
	public ShapeComposite create(ShapeComposite obj) {
		// TODO Auto-generated method stub
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("INSERT INTO ShapeComposite(nom)" + " VALUES(?)");
			prepare.setString(1, obj.getNom());
			prepare.executeUpdate();
			this.ConnClose();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public ShapeComposite read(String nom) {
		// TODO Auto-generated method stub
		ShapeComposite obj = null;	
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("SELECT * from ShapeComposite WHERE nom = ?");
			prepare.setString(1, nom);
			prepare.executeUpdate();
			ResultSet query = prepare.getResultSet();	
			this.ConnClose();
			obj = new ShapeComposite(query.getString("nom"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public ShapeComposite update(ShapeComposite obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(ShapeComposite obj) {
		// TODO Auto-generated method stub
		this.getConnection();
		try {
			PreparedStatement prepare = this.conn.prepareStatement("DELETE FROM ShapeComposite WHERE nom = ?");
			prepare.setString(1, obj.getNom());
			prepare.executeUpdate();	
			this.ConnClose();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
