package savakre;


public abstract	class Vehicule {
		protected  String immatriculation;
		protected String marque;
		protected String modele;
		protected int année ;
		protected double kilometrage;
		protected String statut;
 
		public Vehicule(String immatriculation, String marque, String modele, int année, double kilometrage ) {
			this.immatriculation = immatriculation;
			this.marque= marque;
			this.modele=modele;
			this.année=année;
			this.kilometrage=kilometrage;
			this.statut="disponible";
		}



		public abstract double calculPrixLoc(int nbrj);
		public abstract String toString();
}

 
