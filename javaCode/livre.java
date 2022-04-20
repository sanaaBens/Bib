public class livre {

	public livre(int idLivre, String titre, String auteur, String etat) {
		super();
		this.idLivre = idLivre;
		this.titre = titre;
		this.auteur = auteur;
		this.etat = etat;
	}

	private int idLivre;
	private String titre;
	private String auteur;
	private String etat;

	public String getTitre() {
		return this.titre ;
	}

	/**
	 * 
	 * @param titre
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getEtat() {
		return this.etat;
	}

	/**
	 * 
	 * @param etat
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}

}