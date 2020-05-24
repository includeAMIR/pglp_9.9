package Amir.gl99;

public class CommandeMoveCercle implements Commande {
	private int dx, dy;
	private Cercle c;
	public CommandeMoveCercle(int dx, int dy, Cercle s) {
		// TODO Auto-generated constructor stub
		this.dx = dx;
		this.dy = dy;
		this.c = c;
	}
	public void execute() {
		// TODO Auto-generated method stub
		this.c.move(this.dx, this.dy);
	}
	

}
