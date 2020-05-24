package Amir.gl99;

public class Triangle extends Shape{
	private Point p1,p2,p3;
	public Triangle(String nom, Point p1, Point p2,Point p3) {
		super(nom);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("( Triangle (point 1 = "+ this.p1.printPoint()+","+"point 2 = "+ this.p2.printPoint()+","+"point 3 = "+ this.p3.printPoint());
	}

	@Override
	public void move(int deriveX, int deriveY) {
		// TODO Auto-generated method stub
		this.p1.SetPointX(this.p1.getPointX()+deriveX);
		this.p1.SetPointY(this.p1.getPointY()+deriveY);
		
		this.p2.SetPointX(this.p2.getPointX()+deriveX);
		this.p2.SetPointY(this.p2.getPointY()+deriveY);
		
		this.p3.SetPointX(this.p3.getPointX()+deriveX);
		this.p3.SetPointY(this.p3.getPointY()+deriveY);
	}

	/**
	 * @return the p1
	 */
	public Point getP1() {
		return p1;
	}

	/**
	 * @param p1 the p1 to set
	 */
	public void setP1(Point p1) {
		this.p1 = p1;
	}

	/**
	 * @return the p2
	 */
	public Point getP2() {
		return p2;
	}

	/**
	 * @param p2 the p2 to set
	 */
	public void setP2(Point p2) {
		this.p2 = p2;
	}

	/**
	 * @return the p3
	 */
	public Point getP3() {
		return p3;
	}

	/**
	 * @param p3 the p3 to set
	 */
	public void setP3(Point p3) {
		this.p3 = p3;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Triangle";
	}

}
