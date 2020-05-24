package Amir.gl99;

public class CommandeSave implements Commande{
	private Carre c;
	private CarreDao dc;
	
	private Rectangle r;
	private RectangleDao dr;
	
	private Cercle cer;
	private CercleDao dcer;
	
	private Triangle t;
	private TriangleDao dt;
	
	private ShapeComposite groupes;
	private ShapeCompositeDao dgroupes;
	private String shapetype;
	public CommandeSave(Carre s) {
		// TODO Auto-generated constructor stub
		this.c = s;
		this.dc = new CarreDao();
		shapetype = "Carre";
	}

	public CommandeSave(Rectangle s) {
		// TODO Auto-generated constructor stub
		this.r = s;
		this.dr = new RectangleDao();
		shapetype = "Rectangle";
	}
	public CommandeSave(Cercle s) {
		// TODO Auto-generated constructor stub
		this.cer = s;
		this.dcer = new CercleDao();
		//this.dcer.create(cer);
		shapetype = "Cercle";
	}

	public CommandeSave(Triangle s) {
		// TODO Auto-generated constructor stub
		this.t = s;
		this.dt = new TriangleDao();
		//this.dt.create(t);
		shapetype = "Triangle";
	}
	public CommandeSave(ShapeComposite s) {
		this.groupes = s;
		this.dgroupes = new ShapeCompositeDao();
		shapetype = "ShapeComposite";
	}


	public void execute() {
		// TODO Auto-generated method stub
		if(shapetype=="Carre") {
			this.dc.create(this.c);
		}else if(shapetype=="Rectangle") {
			this.dr.create(this.r);
		}else if(shapetype=="Cercle") {
			this.dcer.create(this.cer);
		}else if(shapetype=="Triangle") {
			this.dt.create(this.t);
		}else if(shapetype == "ShapeComposite") {
			this.dgroupes.create(groupes);
		}
	}

}
