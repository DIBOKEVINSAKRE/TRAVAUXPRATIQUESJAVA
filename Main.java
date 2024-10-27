package savakre;
 
import java.util.Scanner;  

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ParcAutomobile parc = new ParcAutomobile();

    public static void main(String[] args)   {
        boolean continuer = true;
        while (continuer) {
            System.out.println("Bienvenue dans le MENU");
            System.out.println("1. AJOUTER NOUVEAU VEHICULE");
            System.out.println("2. AJOUTER NOUVEAU CLIENT");
            System.out.println("3. LOUER UN VEHICULE A UN CLIENT");
            System.out.println("4. RETOURNER UN VEHICULE");
            System.out.println("5. LISTER LES VEHICULES DISPONIBLES");
            System.out.println("6. LISTER LES VEHICULES DEJA LOUES");
            System.out.println("7. QUITTER");

            int choix = sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                    ajouterVehicule();
                    break;
                case 2:
                    ajouterClient();
                    break;
                case 3:
                    louerVehicule();
                    break;
                case 4:
                    retournerVehicule();
                    break;
                case 5:
                    listeVehiculeDispo();
                    break;
                case 6:
                    listeVehiculeLoue();
                    break;
                case 7:
                    continuer = false;
                    System.out.println("Ah, tu quittes le menu? Yapadrap ");
                    break;
                default:
                    System.out.println("Option invalide");
            }
        }
    }

    private static void ajouterVehicule() {

    	        System.out.println("Quel type de vehicule souhaitez-vous ajouter?");
    	        System.out.println("1. Voiture");
    	        System.out.println("2. Camion");
    	        int choix = sc.nextInt();
    	        sc.nextLine();


    	        switch (choix) {
    	            case 1:
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


					Voiture voiture = new Voiture(immatriculation, marque,modele,annee,kilometrage,nbrDePlaces ,TypeDeCarburant );
    	                parc.ajouterVehicule(voiture);
    	                break;
    	            case 2:
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
    	            default:
    	                System.out.println("Option non valide");
    	                break;
    	        }

    	    }
    private static void ajouterClient()      {
        System.out.println("Entrer les informations du client:");
        System.out.println("Nom:");
        String nom = sc.nextLine();
        System.out.println("Prénom:");
        String prenom = sc.nextLine();


        Clients client = new Clients(nom, prenom);
        System.out.println("Le client " + nom + " " + prenom + " a bien été ajouté");
        client.StockageLoc(); 
    }

    private static void louerVehicule() {
        System.out.println("Entrer le nom et prénom du client");

        System.out.print("NOM: ");
        String nom = sc.nextLine();
        System.out.print("PRENOM: ");
        String prenom = sc.nextLine();

        Clients client = new Clients(nom, prenom);


        if (!client.ClientNonAutoriseException() == false) {
            System.out.println("Erreur: Le client n'est pas autorisé à louer un véhicule.");
            return;
        }


        if (!client.VehiculeInDisponibleException() == false) {
            System.out.println("Erreur: Aucun véhicule disponible pour la location.");
            return;
        }


        client.AjouterLocation();

        System.out.println("Location ajoutée avec succès.");
    }
    private static void retournerVehicule() {
        System.out.println("Souhaitez-vous retourner une voiture ou un camion?");
        System.out.println("1. Voiture");
        System.out.println("2. Camion");
        int choix = sc.nextInt();
        sc.nextLine();
        switch (choix) {
            case 1:
            	System.out.println("Entrez les détails de la voiture");
                System.out.println("Immatriculation:");
                String immatriculation = sc.nextLine();  sc.nextLine();

                System.out.println("Marque:");

                String marque = sc.nextLine();   sc.nextLine();

                System.out.println("Modele");
                String modele =sc.nextLine(); sc.nextLine();

                System.out.println("Annee de mise en service:");
              int annee = sc.nextInt();sc.nextLine();

              System.out.println("Nombre de places:");
              int nbrDePlaces= sc.nextInt(); sc.nextLine();

              System.out.println("Kilometrage:");
              double kilometrage= sc.nextDouble(); sc.nextLine();

              System.out.println("Type de carburant::");
              String TypeDeCarburant = sc.nextLine(); sc.nextLine();



			Voiture voiture = new Voiture(immatriculation, marque,modele,annee,kilometrage,nbrDePlaces ,TypeDeCarburant );
                parc.ajouterVehicule(voiture);
                break;
		case 2:
			System.out.println("Entrez les détails du camion");
            System.out.println("Immatriculation:");
            String immatriculationC = sc.nextLine();
            System.out.println("Modele");
            String modeleC =sc.nextLine(); sc.nextLine();

            System.out.println("Marque:");
            String marqueC=sc.nextLine();         sc.nextLine();
            System.out.println("Annee de mise en service:");
          int anneeC = sc.nextInt();        sc.nextLine();

          System.out.println("Nombre d'essieux:");
          int nbrEssieux= sc.nextInt();         sc.nextLine();

          System.out.println("Kilometrage:");
          double kilometrageC= sc.nextDouble();         sc.nextLine();

          System.out.println("La capacite de stock en kilo:");
          double capacité = sc.nextDouble();         sc.nextLine();
            Camion camion = new Camion(immatriculationC,modeleC, marqueC,anneeC,kilometrageC,capacité,nbrEssieux );
		default:
                System.out.println("Option invalide");
                break;
        }

    }

        private static void listeVehiculeLoue() {
            parc.listerVehiculesLoues();
        }

        private static void listeVehiculeDispo() {
            parc.listerVehiculesDisponibles();
        }
    }






 
