package Amir.gl99;

public class CommandeExit implements Commande{
	public void execute() {
		System.out.println("Vous avez quitter le logiciel");
		System.exit(0);
	}
}
