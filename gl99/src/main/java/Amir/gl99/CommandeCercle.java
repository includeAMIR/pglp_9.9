package Amir.gl99;

public class CommandeCercle implements Commande{
	private String nom;
	private Point centre;
	private int rayon;
	public CommandeCercle(String nom, Point p, int rayon) {
		this.nom = nom;
		this.centre = p;
		this.rayon = rayon;
	}
	public void execute() {
		// TODO Auto-generated method stub
		Cercle c = new Cercle(nom, centre, rayon);
	}

}
