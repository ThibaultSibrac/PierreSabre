package personnages;
import personnages.Humain;

public class Commer�ant extends Humain {
	public Commer�ant(String nom, String boisson_fav, int argent) {
		super(nom, "th�" ,argent);
	}
	public String prendreParole() {
		return "Le Commer�ant " + nom + " : ";	
	}
	public int seFaireExtorquer() {
		int argentPerdu = argent;
		argent = 0;
		parler("J'ai tout perdu ! Le monde est injuste");
		return argentPerdu;
		
	}
	
	public void recevoir(int argentRecu) {
		gagnerArgent(argentRecu);
		parler(argentRecu + " sous ! Je te remercie g�n�reux donateur!");
	}
	public static void main(String[] args) {
		Commer�ant Marco = new Commer�ant("Marco","th�",10);
		Marco.recevoir(15);
		
	}

}
