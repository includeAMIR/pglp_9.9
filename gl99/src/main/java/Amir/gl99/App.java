package Amir.gl99;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException{
    	//DerbyDB db = new DerbyDB();

    	Point p = new Point(12,12);
    	Rectangle r = new Rectangle("r",p, 4, 5 );
    	Point p1 = new Point(1,1);
    	Rectangle r1 = new Rectangle("r",p1, 4, 3);
    	Point p2 = new Point(2,2);
    	Rectangle r2 = new Rectangle("r",p2, 8, 6 );
    	Point p3 = new Point(13,2);
    	Cercle c = new Cercle("r",p3, 4);
    	ShapeComposite shapes = new ShapeComposite("groupe1");
    	shapes.AddShape(r);
    	shapes.AddShape(r1);
    	shapes.AddShape(r2);
    	shapes.AddShape(c);
    	shapes.afficher();
    	shapes.move(2, 2);
    	System.out.println("Post move");
    	shapes.afficher();

    }
}
