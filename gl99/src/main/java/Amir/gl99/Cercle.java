package Amir.gl99;

public class Cercle extends Shape {
	private Point centre;
	private int rayon;
	public Cercle(String nom, Point centre, int rayon) {
		super(nom);
		this.centre = centre;
		this.rayon = rayon;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("( Cercle(centre = "+this.centre.printPoint()+","+"rayon = "+ rayon+")");
	}

	@Override
	public void move(int deriveX, int deriveY) {
		// TODO Auto-generated method stub
		centre.SetPointX(centre.getPointX() + deriveX);
		centre.SetPointY(centre.getPointY() + deriveY);
	}
	public Point getCentre() {
		return this.centre;
	}
	public int getRayon() {
		return this.rayon;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Cercle";
	}

}
