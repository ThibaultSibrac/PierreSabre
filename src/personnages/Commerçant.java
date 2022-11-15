package personnages;
import personnages.Humain;

public class Commerçant extends Humain {
	public Commerçant(String nom, String boisson_fav, int argent) {
		super(nom, "thé" ,argent);
	}
	public String prendreParole() {
		return "Le Commerçant " + nom + " : ";	
	}
	public int seFaireExtorquer() {
		int argentPerdu = argent;
		argent = 0;
		parler("J'ai tout perdu ! Le monde est injuste");
		return argentPerdu;
		
	}
	
	public void recevoir(int argentRecu) {
		gagnerArgent(argentRecu);
		parler(argentRecu + " sous ! Je te remercie généreux donateur!");
	}
	public static void main(String[] args) {
		Commerçant Marco = new Commerçant("Marco","thé",10);
		Marco.recevoir(15);
		
	}

}
