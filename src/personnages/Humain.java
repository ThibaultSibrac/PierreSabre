package personnages;

public class Humain {
	protected String nom;
	protected String boisson_fav;
	protected int argent;
	
	
	
	public Humain(String nom, String boisson_fav, int argent) {
		this.nom = nom;
		this.boisson_fav = boisson_fav;
		this.argent = argent;
	}
	public int getArgent() {
		return argent;
	}
	public void setArgent(int argent) {
		this.argent = argent;
	}
	public String getBoisson_fav() {
		return boisson_fav;
	}
	public void setBoisson_fav(String boisson_fav) {
		this.boisson_fav = boisson_fav;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	public String prendreParole() {
		return "L'humain " + nom + " : ";
	}
	public void direBonjour(){
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire " + boisson_fav);
	}
	public void boire() {
		parler("Mmm ,un bon verre du " + boisson_fav +"! GLOUPS !");
	}
	public void gagnerArgent(int gain) {
		argent = argent + gain;
	}
	public void perdreArgent(int perte) {
		argent = argent - perte;
	}
	public void acheter(int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche.Je vais pouvoir m'offrir une boisson à " + prix+ " sous");
			perdreArgent(prix);
			boire();
			}
		else {
			parler("Je n'ai pas assez de sous");
		}
	}
	
	public static void main (String[] args) {
		Humain Silas = new Humain("Silas", "eau",100);
		Silas.direBonjour();
		Silas.boire();
		Silas.acheter(110);
		
	}

}
