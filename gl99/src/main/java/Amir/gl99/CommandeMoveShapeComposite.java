package Amir.gl99;

public class CommandeMoveShapeComposite implements Commande{
	int dx,dy;
	ShapeComposite sc;
	public CommandeMoveShapeComposite(int dx, int dy, ShapeComposite s) {
		// TODO Auto-generated constructor stub
		this.dx =dx;
		this.dy =dy;
		this.sc =s;
	}

	public void execute() {
		// TODO Auto-generated method stub
		this.sc.move(dx, dy);
	}

}
