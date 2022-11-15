package personnages;

public class Yakuza extends Humain {
	private int reputation;
	private String clan;
	
	public Yakuza(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite ,argent);
		this.setReputation(0);
		this.setClan(clan);
		
	}
	public void extorquer(Commerçant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime + ", si tu tiens à la vie donne moi ta bourse !");
		
	}
	public int getReputation() {
		return reputation;
	}
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	public String getClan() {
		return clan;
	}
	public void setClan(String clan) {
		this.clan = clan;
	}

}
