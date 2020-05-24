package Amir.gl99;

import java.util.ArrayList;

public class CommandeShapeComposite implements Commande {
	private String nom; 
	private ArrayList<Shape>shapes;
	public CommandeShapeComposite(String nom) {
		this.nom = nom;
		this.shapes = new ArrayList<Shape>();
	}
	public void execute() {
		// TODO Auto-generated method stub
		ShapeComposite chapline = new ShapeComposite(nom);
	}

}
