package savakre;

 

    import java.util.Scanner;
	public class Voiture extends Vehicule implements Louable {
	int nbrDePlaces;
	String TypeDeCarburant;
	Scanner sc = new Scanner(System.in);



		public Voiture( String immatriculation, String marque, String modele, int année, double kilometrage,  int nbrDePlaces,String TypeDeCarburant ) {
		  super(immatriculation,marque,modele,année,kilometrage);
		  this.nbrDePlaces=nbrDePlaces;
		  this.TypeDeCarburant= TypeDeCarburant;
		}
	public  double calculPrixLoc(int nbrjV) {
		final int tarif = 45000;
		System.out.println("Pour combien de jours voulez vous louer la voiture?");
		int nbrj=sc.nextInt(); sc.nextLine();
		return tarif*nbrj;
	}
	public void louer() {
		statut="loué";
	}  
	public void retourner() {
	statut="disponible";
	}
	public String toString() {
		return "Le numéro d'immatriculation est :" +immatriculation+ " La marque est: " +marque+ " L'année de remise en service est: " +année+ " le statut: " +statut+ " le nombre de places est :" +nbrDePlaces+ " le type de carburant :" +TypeDeCarburant;
	}
	 	}





 
