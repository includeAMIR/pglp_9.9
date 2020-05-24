package Amir.gl99;

public class CommandeMoveRectangle implements Commande{
	private int dx, dy;
	private Rectangle r;
	public CommandeMoveRectangle(int dx, int dy, Rectangle s) {
		// TODO Auto-generated constructor stub
		this.dx = dx;
		this.dy = dy;
		this.r =s;
	}

	public void execute() {
		// TODO Auto-generated method stub
		this.r.move(this.dx, this.dy);

	}

}
