package Amir.gl99;

public class CommandeMoveCarre implements Commande{
	private int dx, dy;
	private Carre c;
	public CommandeMoveCarre(int dx, int dy, Carre c) {
		this.dx = dx;
		this.dy = dy;
		this.c = c;
	}
	public void execute() {
		// TODO Auto-generated method stub
		this.c.move(this.dx, this.dy);
	}

}
