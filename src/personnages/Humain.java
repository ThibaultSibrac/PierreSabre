package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	public int getArgent() {
		return argent;
	}
	public void setArgent(int argent) {
		this.argent = argent;
	}
	public String getBoissonFavorite() {
		return boissonFavorite;
	}
	public void setBoisson_fav(String boissonFavorite) {
		this.boissonFavorite = boissonFavorite;
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
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire " + boissonFavorite);
	}
	public void boire() {
		parler("Mmm ,un bon verre du " + boissonFavorite +"! GLOUPS !");
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
