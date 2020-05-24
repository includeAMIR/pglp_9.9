package Amir.gl99;

import java.util.ArrayList;

public class DrawingTUI {
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	public ArrayList<Shape> getShapes() {
		return this.shapes;
	}
	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}
	public Commande	nextCommand(String commande) {
		Commande c = null;
		String[] reg =null;
		Shape s = null;
		commande = commande.replaceAll(" = ( , ) ","tosplit");
		reg = commande.split("tosplit");
		if(reg[0] != "") {
			if(reg[0] == "exit") {
				c = new CommandeExit();
				c.execute();
			}
			else if(reg[0] == "Afficher") {
				CommandeAfficher();
			}
			else if(reg[0] == "Create") {
				if(reg[1] == "Cercle") {
					return CommandeCreateCercle(reg[2], reg[3], reg[4], reg[5]);
				}
				else if(reg[1] == "Carre") {
					return CommandeCreateCarre(reg[2], reg[3], reg[4], reg[5]);
				}
				else if(reg[1] == "Rectangle") {
					return CommandeCreateRectangle(reg[2], reg[3], reg[4], reg[5], reg[6]);
				}
				else if(reg[1] == "Triangle") {
					return CommandeCreateTriangle(reg[2], reg[3], reg[4], reg[5], reg[6], reg[7], reg[8]);
				}
				else if(reg[1] == "ShapeComposite") {
					return CommandeShapeComposite(reg[2]);
				}
			}
			else if(reg[0] == "save") {
				return CommandeSave();
			}
			else if(reg[0] == "move") {
				s = getShape(reg[1]);
				if(s.getType() == "triangle") {
					CommandeMoveTriangle(Integer.parseInt(reg[2]), Integer.parseInt(reg[3]));
				}else if(s.getType() == "ShapeComposite"){
					CommandeMoveShapeComposite(Integer.parseInt(reg[2]), Integer.parseInt(reg[3]));
				}else if(s.getType() == "Carre"){
					CommandeMoveCarre(Integer.parseInt(reg[2]), Integer.parseInt(reg[3]));
				}else if(s.getType()=="Rectangle") {
					CommandeMoveRectangle(Integer.parseInt(reg[2]), Integer.parseInt(reg[3]));
				}else if(s.getType()=="Cercle") {
					CommandeMoveCercle(Integer.parseInt(reg[2]), Integer.parseInt(reg[3]));
				}
			}
			else {
				System.out.println("Operation non reconnnu");
			}
		}

		return c;
	}
	

	private void CommandeMoveCercle(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}
	private void CommandeMoveRectangle(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}
	private void CommandeMoveCarre(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}
	private void CommandeMoveTriangle(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}
	private void CommandeMoveShapeComposite(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}
	public Commande CommandeShapeComposite(String nom) {
		// TODO Auto-generated method stub
		CommandeShapeComposite cs = new CommandeShapeComposite(nom);
		cs.execute();
		return cs;
	}
	public Commande CommandeCreateCercle(String nom, String px, String py, String rayon) {
		// TODO Auto-generated method stub
		Point centre = new Point(Integer.parseInt(px),Integer.parseInt(py));
		CommandeCercle c = new CommandeCercle(nom, centre, Integer.parseInt(rayon));
		c.execute();
		return c;
	}
	public Commande CommandeCreateCarre(String nom, String px, String py, String coter) {
		// TODO Auto-generated method stub
		Point p = new Point(Integer.parseInt(px),Integer.parseInt(py));
		CommandeCarre c = new CommandeCarre(nom, p, Integer.parseInt(coter));
		c.execute();
		return c;
	}
	public Commande CommandeCreateRectangle(String nom, String px, String py, String coterverticale, String coterhorizentale) {
		// TODO Auto-generated method stub
		Point p = new Point(Integer.parseInt(px),Integer.parseInt(py));
		CommandeRectangle c = new CommandeRectangle(nom, p, Integer.parseInt(coterverticale), Integer.parseInt(coterhorizentale));
		c.execute();
		return c;
	}
	public Commande CommandeCreateTriangle(String nom, String p1x, String p1y, String p2x, String p2y, String p3x, String p3y) {
		// TODO Auto-generated method stub
		Point p1 = new Point(Integer.parseInt(p1x),Integer.parseInt(p1y));
		Point p2 = new Point(Integer.parseInt(p2x),Integer.parseInt(p2y));
		Point p3 = new Point(Integer.parseInt(p3x),Integer.parseInt(p3y));
		CommandeTriangle t = new CommandeTriangle(nom, p1, p2, p3);
		t.execute();
		return t;
	}
	public Commande CommandeSave() {
		// TODO Auto-generated method stub
		for(Shape s : shapes) {
			if(s instanceof Carre) {
                CommandeSave sav = new CommandeSave((Carre)s);
                sav.execute();
            }else if(s instanceof Cercle) {
                CommandeSave sav = new CommandeSave((Cercle)s);
                sav.execute();
            }else if(s instanceof Triangle) {
                CommandeSave sav = new CommandeSave((Triangle)s);
                sav.execute();
            }else if(s instanceof Rectangle) {
                CommandeSave sav = new CommandeSave((Rectangle)s);
                sav.execute();
            }
			
		}
		return null;
	}
	public void CommandeAfficher() {
		// TODO Auto-generated method stub
		for(Shape s : this.shapes) {
			s.afficher();
		}
	}
	public Shape getShape(String userinput) {
        for(Shape s: shapes) {
            if(s.getNom()==userinput){
              return s;
            }
          }
		return null;
	}
}
