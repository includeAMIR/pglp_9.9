package Amir.gl99;

public class CommandeRectangle implements Commande{

	private String nom;
	private Point p;
	private int coterverticale;
	private int coterhorizentale;
	public CommandeRectangle(String nom, Point p, int coterverticale, int coterhorizentale) {
		this.nom = nom;
		this.p = p;
		this.coterverticale = coterverticale;
		this.coterhorizentale = coterhorizentale;
	}
	public void execute() {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(nom, p, coterverticale, coterhorizentale);
	}
}
