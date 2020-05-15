package Amir.gl99;

public abstract class Shape {
	private String nom;
	public Shape(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return this.nom;
	}
	public abstract void afficher();
	public abstract void move();
}
