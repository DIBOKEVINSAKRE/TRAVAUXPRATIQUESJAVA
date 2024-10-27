# TP
TP

# FONCTIONNEMENT DE L APPLICATION
 Lors de son lancement, l’application affichera un menu interactif comportant les éléments suivants :
1. Ajouter un nouveau véhicule au parc.
2. Ajouter un nouveau client.
3. Louer un véhicule à un client.
4. Retourner un véhicule. 
5. Lister les véhicules disponibles.
6. Lister les véhicules loués
7. Quitter
 
 

 En choisissant l’option (1), l’application demandera si l’utilisateur souhaite ajouter une voiture ou un camion. Après ce choix, il devra entrer les détails du véhicule, qui seront alors sauvegardés dans le parc sous forme de liste.

 Si l’utilisateur opte pour l’option (2), il sera invité à entrer les informations du client, qui seront ensuite ajoutées à une liste.
	 Pour l’option (3), l’application demandera le nom et le prénom du client qui désire louer un véhicule. Ensuite, le client devra indiquer le type de véhicule qu’il souhaite louer. Si le véhicule n’est pas disponible, un message d’erreur apparaîtra. De plus, si le client souhaite louer un camion, l’application vérifiera d’abord qu’il possède le permis approprié. Une fois la location réalisée, elle sera consignée dans une liste.
 	En choisissant l’option (4), l’utilisateur devra fournir l’immatriculation du véhicule à rendre, qui sera alors de nouveau accessible.
	 	Si l’utilisateur sélectionne l’option (5), l’application affichera la liste des véhicules disponibles, en précisant tous leurs détails.
	 	Pour l’option (6), l’application présentera la liste des véhicules loués, accompagnée de leurs informations détaillées.
	 	Enfin, si l’utilisateur choisit l’option (7), il mettra fin à sa session sur l’application.
 
 #STRUCTURE DU PROJET 
 Le projet se compose de neuf classes :

	 	1. La classe « Vehicule » :

Il s’agit de la classe parente des classes « Voiture » et « Camion ». Elle est abstraite, car elle contient les méthodes abstraites « calculPrixLocation » et « toString ».
	2.	L’interface « Louable » :
Cette interface définit les méthodes « louer » et « retourner », qui sont implémentées dans les classes « Voiture » et « Camion ».
	3.	La classe « Voiture » :
Cette classe hérite de « Véhicule » et implémente les méthodes « calculPrixLocation » et « toString », ainsi que celles de l’interface « Louable ».
	4.	La classe « Camion » :
Tout comme la classe « Voiture », cette classe hérite de « Véhicule » et implémente les méthodes « calculPrixLocation » et « toString », ainsi que celles de l’interface « Louable ».
	5.	La classe « Client » :
Cette classe permet d’enregistrer les locations d’un client et de les stocker.
	6.	La classe « ParcAutomobile » :
Cette classe est conçue pour stocker les véhicules enregistrés et créer la liste des véhicules disponibles ou indisponibles.
 	7. 
     La classe « ClientNonAutoriseException » :
Cette classe gère l’exception pour les clients qui ne possèdent pas le permis adéquat pour louer un camion.
	8.	La classe « VehiculeIndisponibleException » :
Cette classe gère l’exception pour les véhicules qui ne sont pas disponibles, c’est-à-dire ceux qui sont déjà loués.
	9.	La classe « Main » :
Il s’agit de la fonction principale, qui contient le menu interactif permettant à l’utilisateur d’interagir avec l’application.
