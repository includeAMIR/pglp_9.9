package Amir.gl99;

public class CommandeMoveTriangle implements Commande{
	private int dx,dy;
	private Triangle t;
	public CommandeMoveTriangle(int dx, int dy, Triangle s) {
		// TODO Auto-generated constructor stub
		this.dx =dx;
		this.dy =dy;
		this.t =s;
	}

	public void execute() {
		// TODO Auto-generated method stub
		this.t.move(dx, dy);
	}

}
