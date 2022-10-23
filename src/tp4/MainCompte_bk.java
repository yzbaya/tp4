package tp4;


public class MainCompte_bk {


	public static void main(String[] args) {
		//tableau
		Personne t[]=new Personne[3];
		for(int i=0;i<=3;i++) {
//
//			Object scanner;
//			scanner
		}
		
		
		
		Personne P1=new Personne("yazidi","ons","aaaaaaa");
		Personne P2=new Personne("yazidi","baya","bbbbbb");
		
		Compte c1=new Compte(P1);//Personne P,float solde ,double debiMax ,double decouvertMax
        c1.toString();
        Compte c2=new Compte(P2,900,1000,-900);
        c2.toString();
        //virement 1 et 2
        c1.virement(c2, 200);
        Compte.virement(c1, c2, 500);
        c1.retrait(500);
        c2.crediter(500);
	}

}
