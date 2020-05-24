package Amir.gl99;

public class Rectangle extends Shape{
	private Point p;
	private int coterverticale, coterhorizentale;
	public Rectangle(String nom,Point p, int coterverticale, int coterhorizentale) {
		super(nom);
		this.p = p;
		this.setCoterverticale(coterverticale);
		this.setCoterhorizentale(coterhorizentale);
	}
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("( Rectangle (point_haut_gauche = "+this.p.printPoint()+","+"largeur = "+this.coterhorizentale+", " + "hauteur = "+this.coterverticale+")");
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
	/**
	 * @return the coterverticale
	 */
	public int getCoterverticale() {
		return coterverticale;
	}
	/**
	 * @param coterverticale the coterverticale to set
	 */
	public void setCoterverticale(int coterverticale) {
		this.coterverticale = coterverticale;
	}
	/**
	 * @return the coterhorizentale
	 */
	public int getCoterhorizentale() {
		return coterhorizentale;
	}
	/**
	 * @param coterhorizentale the coterhorizentale to set
	 */
	public void setCoterhorizentale(int coterhorizentale) {
		this.coterhorizentale = coterhorizentale;
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}

}
