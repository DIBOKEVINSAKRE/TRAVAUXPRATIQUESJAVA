package savakre;

 
	import java.util.Scanner;

	public class Camion extends Vehicule implements Louable {
	double capacité;
	int nbrEssieux;
	Scanner sc = new Scanner(System.in);


		public Camion(String immatriculation, String marque, String modele, int année, double kilometrage,double capacité,int  nbrEssieux) {
			  super(immatriculation,marque,modele,année,kilometrage);
			this.capacité=capacité;
		 this.nbrEssieux= nbrEssieux;
		}
		public  double calculPrixLoc(int nbrjC) {
			final int tarif = 90000;
			System.out.println("Pour combien de jours voulez vous louer le camion?");
			int nbrj=sc.nextInt();
			return tarif*nbrj;
  
		}
		public void louer() {
			statut="loué";
		}
	public void retourner() {
		statut="disponible";
	}
			public String toString() {
				return "Le numéro d'immatriculation est: "+immatriculation+" La marque est: "+marque+" L'anné de remise en service est: "+année+" le statut: "+statut+" la capacité du camion est:"+capacité+ " le nombre d'essieux :"+nbrEssieux;
			}
	}



 
