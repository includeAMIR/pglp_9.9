package Amir.gl99;

import java.util.ArrayList;

public class ShapeComposite extends Shape {
	private ArrayList<Shape>shapes;
	public ShapeComposite(String nom) {
		super(nom);
		this.shapes = new ArrayList <Shape>();
	}
	public void AddShape(Shape s) {
		this.shapes.add(s);
	}
	public void RemoveShape(Shape s) {
		this.shapes.remove(s);
	}
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void move(int deriveX, int deriveY) {
		// TODO Auto-generated method stub
		
	}
}
