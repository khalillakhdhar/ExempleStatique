package demo;

public class User {
	private int id=0;
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
	public User( String nom, String prenom) {
		super();
		this.id = this.id+1;
		this.nom = nom;
		this.prenom = prenom;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
		this.id++;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	

}
