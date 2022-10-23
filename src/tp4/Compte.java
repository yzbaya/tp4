package tp4;


public class Compte {
    private int num;
    private float solde;
    private Personne titulaire;
    private boolean estAdecouvert;
    double debiMax;//maximum de retrait 
    double decouvertMax;//maximum de rouge
    private int nbrCompte;
     //first constructor 
       Compte(Personne P){
    	   nbrCompte++;
    	   titulaire=P;
    	   debiMax=1000;
    	   decouvertMax=-800;
    	   this.num=nbrCompte;
       }
       
       Compte (Personne P,float solde ,double debiMax ,double decouvertMax) {
    	  this.nbrCompte++;
    	  this.titulaire=P;
    	  this.solde=solde;
    	  this.debiMax=debiMax;
    	  this.decouvertMax=decouvertMax;
    	  this.num=nbrCompte;
    	   
       }
       
    //getter and setter solde
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	//getter and setter solde
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
    
	Boolean retrait(double m) {
		if (m>debiMax) {
			System.out.println("error");
			return false;
		}
		
		else 
			if ((solde-m)>decouvertMax ) {
				System.out.println("error");
				return false;
		}
		   solde-=m;
		  if(solde<0) {
			  estAdecouvert=true;
		  }
		  else {
			  estAdecouvert=false;
		  }
			  
		return estAdecouvert;
	}
	//ajouter du solde dans le compte
	void crediter (double n) {
		this.solde+=n;
	}
	
	//methode de virement 1
	 void virement(Compte c,double n) {
		c.retrait(n);
		this.crediter(n);
	}
	//methode virement 2
	static void virement (Compte c1, Compte c2, double n) {
		boolean b=c1.retrait(n);
		if(b)
		c2.crediter(n);
		
	}
	
	
	@Override
	public String toString() {
		
		return ("le titulaire est"+this.titulaire);
	}
	
	
	
	
	
}
