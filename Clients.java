package savakre;

 
	import java.util.ArrayList;
	import java.util.Scanner;

	public class Clients {
	    String nom;
	    String prenom;
	    int numeroDePermis;
	    int numeroDeTel;
	    ParcAutomobile parc = new ParcAutomobile();
	    public Clients(String nom, String prenom) {
	    	this.nom=nom;
	    	this.prenom=prenom;
	    }
	    public Clients(String nom, String prenom, int numeroDePermis, int numeroDeTel) {
	        this.nom = nom;
	        this.numeroDePermis = numeroDePermis;
	        this.numeroDeTel = numeroDeTel;
	        this.prenom = prenom;
	    }

	    ArrayList<Vehicule> listLoc = new ArrayList<>();
	    Scanner sc = new Scanner(System.in);
  
	    void StockageLoc()   {
	        boolean continuer = true;
	        while (continuer) {
	            System.out.println("Voulez-vous ajouter une location?");
	            System.out.println("1/OUI");
	            System.out.println("2/NON");

	            int reponse = sc.nextInt();
	            sc.nextLine();

	            switch (reponse) {
	                case 1:
	                    AjouterLocation();
	                    break;
	                case 2:
	                    continuer = false;
	                    break;
	                default:
	                    System.out.println("Choix invalide");
	                    break;
	            }
	        }
	    }

	    public void AjouterLocation() {
	        System.out.println("VOULEZ-VOUS LOUER UNE VOITURE OU UN CAMION?");
	        System.out.println("1/CAMION");
	        System.out.println("2/VOITURE");

	        int choix = sc.nextInt();
	        sc.nextLine();

	        switch (choix) {
	            case 1:
	            	System.out.println("Entrez les détails du camion");
	                System.out.println("Immatriculation:");
	                String immatriculationC = sc.nextLine();
	                System.out.println("Modele");
	                String modeleC =sc.nextLine();
	                sc.nextLine();
	                System.out.println("Marque:");
	                String marqueC=sc.nextLine();
	                System.out.println("Annee de mise en service:");
	              int anneeC = sc.nextInt();
	              sc.nextLine();
	              System.out.println("Nombre d'essieux:");
	              int nbrEssieux= sc.nextInt();
	              sc.nextLine();
	              System.out.println("Kilometrage:");
	              double kilometrageC= sc.nextDouble();
	              sc.nextLine();
	              System.out.println("La capacite de stock :");
	              double capacité = sc.nextDouble();

	                Camion camion = new Camion(immatriculationC,modeleC, marqueC,anneeC,kilometrageC,capacité,nbrEssieux );
	                parc.ajouterVehicule(camion);
	                break;
	            case 2:
	                System.out.println("Entrez les détails de la voiture");
	                System.out.println("Entrez les détails de la voiture");
	                System.out.println("Immatriculation:");
	                String immatriculation = sc.nextLine();
	                sc.nextLine();
	                System.out.println("Marque:");

	                String marque = sc.nextLine();
	                sc.nextLine();
	                System.out.println("Modele");
	                String modele =sc.nextLine();
	                sc.nextLine();
	                System.out.println("Annee de mise en service:");
	              int annee = sc.nextInt();
	              sc.nextLine();
	              System.out.println("Nombre de places:");
	              int nbrDePlaces= sc.nextInt();
	              sc.nextLine();
	              System.out.println("Kilometrage:");
	              double kilometrage= sc.nextDouble();
	              sc.nextLine();
	              System.out.println("Type de carburant::");
	              String TypeDeCarburant = sc.nextLine();
	              sc.nextLine();


				Voiture voiture = new Voiture(immatriculation, marque,modele,annee,kilometrage,nbrDePlaces, TypeDeCarburant );

				parc.ajouterVehicule(voiture);
	                break;
			default:
	                System.out.println("Choix invalide");
	                break;
	        }
	    }
		public boolean VehiculeInDisponibleException() {
			// TODO Auto-generated method stub
			return false;
		}
		public boolean ClientNonAutoriseException() {
			// TODO Auto-generated method stub
			return false;
		}
	}


 
