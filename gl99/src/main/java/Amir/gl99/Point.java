package Amir.gl99;

public class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getPointX(){
		return this.x;
	}
	public int getPointY() {
		return this.y;
	}
	public void SetPointX(int x) {
		this.x = x;
	}
	public void SetPointY(int y) {
		this.y = y;
	}
	public String printPoint() {
		return"("+this.x+","+this.y+")";
	}
}
