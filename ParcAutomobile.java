package savakre;

   
	import java.util.ArrayList;
	public class ParcAutomobile {
	    private ArrayList<Vehicule> listeVehicules;
	    private ArrayList<Clients> listeClients;

	    public ParcAutomobile() {
	        this.listeVehicules = new ArrayList<>();
	        this.listeClients = new ArrayList<>();
	    }

	    public void ajouterVehicule(Vehicule vehicule) {
	        listeVehicules.add(vehicule);
	        System.out.println("Véhicule ajouté au parc : " + vehicule);
	    }

	    public void ajouterClient(Clients client) {
	        listeClients.add(client);
	        System.out.println("Client ajouté : " + client.nom + " " + client.prenom);
	    }




	        public void listerVehiculesDisponibles() {
	            System.out.println("Liste des véhicules disponibles :");
	            boolean existe = false;

	            for (Vehicule vehicule : listeVehicules) {
	                if ("disponible".equalsIgnoreCase(vehicule.statut)) {
	                    System.out.println(vehicule);
	                    existe = true;
	                }
	            }

	            if (!existe) {
	                System.out.println("Aucun véhicule disponible pour le moment.");
	            }
	        }


	        public void listerVehiculesLoues() {
	            System.out.println("Liste des véhicules loués :");
	            boolean existe = false;

	            for (Vehicule vehicule : listeVehicules) {
	                if ("loué".equalsIgnoreCase(vehicule.statut)) {
	                    System.out.println(vehicule);
	                    existe = true;
	                }
	            }

	            if (!existe) {
	                System.out.println("Aucun véhicule loué pour le moment.");
	            }
	        }
	    }
 
