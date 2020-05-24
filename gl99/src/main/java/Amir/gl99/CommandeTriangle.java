package Amir.gl99;

public class CommandeTriangle implements Commande {
	private String nom;
	private Point p1,p2,p3;

	public CommandeTriangle(String nom, Point p1, Point p2, Point p3) {
		this.nom = nom;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	public void execute() {
		// TODO Auto-generated method stub
		Triangle t = new Triangle(nom, p1, p2, p3);
	}
}
