package tp4;

public class Personne {
	String nom ;
	String prenom;
	String adresse;
	
	Personne(String nom, String prenom, String adresse){
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
	}
	
	@Override
	public String toString() {
		return ("le nom est"+nom+"le prenom est"+prenom+"adresse"+adresse);
	}
	
}

