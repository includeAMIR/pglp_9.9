package Amir.gl99;

public class Carre extends Shape {
	private Point p;
	private int coter;
	public Carre(String nom, Point p, int coter) {
		super(nom);
		this.p = p;
		this.coter = coter;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("( Carre (point_haut_gauche = "+this.p.printPoint()+","+"coter = "+this.coter +")");
	}

	@Override
	public void move(int deriveX, int deriveY) {
		// TODO Auto-generated method stub
		this.p.SetPointX(this.p.getPointX()+deriveX);
		this.p.SetPointY(this.p.getPointY()+deriveY);	
	}

	/**
	 * @return the coter
	 */
	public int getCoter() {
		return coter;
	}

	/**
	 * @param coter the coter to set
	 */
	public void setCoter(int coter) {
		this.coter = coter;
	}

	/**
	 * @return the p
	 */
	public Point getP() {
		return p;
	}

	/**
	 * @param p the p to set
	 */
	public void setP(Point p) {
		this.p = p;
	}

}
