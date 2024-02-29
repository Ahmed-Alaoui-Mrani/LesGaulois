package sites;
	
import personnages.Gaulois;
import personnages.Soldat;
	
public class TestSites {
    public static void main(String[] args) {
        // Création des Gaulois
        Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 5); // Création d'Abraracourcix
      //Gaulois agecanonix = new Gaulois("Agecanonix", 1);
        //Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
        //Gaulois asterix = new Gaulois("Astérix", 5);
        //Gaulois obelix = new Gaulois("Obélix", 15);
      //Gaulois prolix = new Gaulois("Prolix", 2);
        
        // Création des Soldats
     /*   Soldat briseradius = new Soldat("Briseradius", 4, "SOLDAT");
        Soldat chorus = new Soldat("Chorus", 4, "CENTURION"); // Création de Chorus
        Soldat brutus = new Soldat("Brutus", 5, "CENTURION"); */
        /*
        Soldat milexcus = new Soldat("Milexcus", 2, "SOLDAT");
        Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2, "TESSERARIUS");
        Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, "OPTIO");
		*/
        
        // Création du village avec Vercingétorix comme chef
        Village village = new Village(vercingetorix);
        
     // Création du camp avec Minus comme commandant
       // Camp camp = new Camp(brutus); 
        

        // Ajout des villageois et des soldats au village et au camp
        village.ajouterVillageois(abraracourcix);
     //   camp.ajouterSoldat(briseradius);
     //   camp.ajouterSoldat(chorus);
        /*
        camp.ajouterSoldat(brutus);
        camp.ajouterSoldat(milexcus);
        camp.ajouterSoldat(tulliusOctopus);
        camp.ajouterSoldat(ballondebaudrus);
        
        village.ajouterVillageois(agecanonix);
        village.ajouterVillageois(assurancetourix);
        village.ajouterVillageois(asterix);
        village.ajouterVillageois(obelix);
        //village.ajouterVillageois(prolix);
        */
        
     // Affichage des messages de bienvenue et de rejet
        /*
        System.out.println(brutus.getNom() + " : « Je mets mon épée au service de Rome dans le camp dirigé par Minus ».");
        System.out.println(milexcus.getNom() + " : « Je mets mon épée au service de Rome dans le camp dirigé par Minus ».");
        System.out.println(tulliusOctopus.getNom() + " : « Je mets mon épée au service de Rome dans le camp dirigé par Minus ».");
        System.out.println("Le romain " + minus.getNom() + " : « Désolé " + ballondebaudrus.getNom() + " notre camp est complet ! ».");

        System.out.println(vercingetorix.getNom() + " : « Bienvenue " + agecanonix.getNom() + " ! ».");
        System.out.println(vercingetorix.getNom() + " : « Bienvenue " + assurancetourix.getNom() + " ! ».");
        System.out.println(vercingetorix.getNom() + " : « Bienvenue " + asterix.getNom() + " ! ».");
        System.out.println(vercingetorix.getNom() + " : « Bienvenue " + obelix.getNom() + " ! ».");
        System.out.println(vercingetorix.getNom() + " : « Désolé " + prolix.getNom() + " mon village est déjà bien rempli. ».");
        */
    

        // Appel des méthodes pour changer le chef du village et le commandant du camp
        village.changerChef(abraracourcix);
      //  camp.changerCommandant(briseradius);
     //   camp.changerCommandant(chorus);
    }
}


