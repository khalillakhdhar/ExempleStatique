package demo;

public class StatUser {
	public static int id=0;
	private String nom,prenom;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public StatUser(String nom, String prenom) {
		super();
		id++;
		this.nom = nom;
		this.prenom = prenom;
	}
	public StatUser() {
		id++;
	}
	@Override
	public String toString() {
		return "StatUser [nom=" + nom + ", prenom=" + prenom + ", Id=" + getId() + "]";
	}
	
	
	
}
