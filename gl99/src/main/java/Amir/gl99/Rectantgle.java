package Amir.gl99;

public class Rectantgle extends Shape{
	private Point p;
	private int coterverticale, coterhorizentale;
	public Rectantgle(String nom,Point p, int coterverticale, int coterhorizentale) {
		super(nom);
		this.p = p;
		this.coterverticale = coterverticale;
		this.coterhorizentale = coterhorizentale;
	}
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("( Rectangle (point_haut_gauche = "+this.p.printPoint()+","+"largeur = "+this.coterhorizentale + "hauteur = "+this.coterverticale+")");
	}
	@Override
	public void move(int deriveX, int deriveY) {
		// TODO Auto-generated method stub
		this.p.SetPointX(this.p.getPointX()+deriveX);
		this.p.SetPointY(this.p.getPointY()+deriveY);		
	}
	public Point getPoint() {
		return this.p;
	}

}
