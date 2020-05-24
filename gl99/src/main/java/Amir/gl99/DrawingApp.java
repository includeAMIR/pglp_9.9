package Amir.gl99;

import java.util.Scanner;

public class DrawingApp {
	private Scanner sc =new Scanner(System.in);;
	public void run() {
		System.out.println("Vous trouverez le mannuel d'utilisation danns le readme");
	    DrawingTUI dt = new DrawingTUI();
	    System.out.println("Entrez votre commande :");
		String commande = "";
		while (true) {
		  if (sc.hasNext()) {
			commande = sc.next();
		    dt.nextCommand(commande);
		  }
		}
	}
}
