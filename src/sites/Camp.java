package sites;

import personnages.Soldat;

import java.util.ArrayList;
import java.util.List;

public class Camp {
	    private Soldat commandant;
	    private List<Soldat> soldats;
	    
	    public Camp(Soldat commandant) {
	        this.commandant = commandant;
	        this.soldats = new ArrayList<>();
	        this.soldats.add(commandant); 
	    }
	    
	    public Soldat getCommandant() {
	        return commandant;
	    }
	    public void ajouterSoldat(Soldat soldat) {
	        soldats.add(soldat);
	    }
	    
	    // Méthode pour afficher le camp romain
	    public void afficherCamp() {
	        System.out.println("Le Camp dirigé par Minus contient les soldats:");
	        for (int i = 1; i < soldats.size(); i++) {
	            System.out.println("- " + soldats.get(i).getNom());
	        }
	    }
	    
	 // Dans la classe Camp
	    public void changerCommandant(Soldat nouveauCommandant) {
	        if (nouveauCommandant.getGrade().equals("CENTURION")) {
	            System.out.println("Le romain " + nouveauCommandant.getNom() + " : « Moi, " + nouveauCommandant.getNom() +
	                    " je prends la direction du camp romain. ».");
	            commandant = nouveauCommandant;
	        } else {
	            if (!nouveauCommandant.getNom().equals(commandant.getNom())) {
	                System.out.println("Le romain " + nouveauCommandant.getNom() + " : « Je ne suis pas suffisamment gradé pour prendre la direction du camp romain. ».");
	            }
	        }
	    }



}
