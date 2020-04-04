package dp;

public class Admin implements UtilisateurInterface {

	public String nom;
	public String prenom;
	public String email;
	public Integer tel;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String nom, String prenom, String email, Integer tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
	}

	public Admin(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTel() {
		return tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Admin [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", tel=" + tel + "]";
	}




	public void annoncerDate(String date) {
	
	}

}
