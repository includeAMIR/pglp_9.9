package Amir.gl99;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	Point p = new Point(12,12);
    	Rectangle r = new Rectangle("r",p, 4, 5 );
    	r.afficher();
    	r.move(10, 10);
    	r.afficher();
    }
}
