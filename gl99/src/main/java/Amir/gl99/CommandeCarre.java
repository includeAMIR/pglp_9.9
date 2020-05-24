package Amir.gl99;

public class CommandeCarre implements Commande{
	private String nom;
	private Point p;
	private int coter;
	public CommandeCarre(String nom, Point p, int coter) {
		this.nom = nom;
		this.p = p;
		this.coter = coter;
	}
	public void execute() {
		// TODO Auto-generated method stub
		Carre c = new Carre(nom, p, coter);
	}

}
