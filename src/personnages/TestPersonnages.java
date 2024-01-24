package personnages;

import personnages.Gaulois;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestPersonnages {
	public static void main(String[] args) {
		
	        Gaulois asterix = new Gaulois("Astérix", 8);
	        Romain minus = new Romain("Minus", 6);

	        asterix.parler("Bonjour à tous");
	        minus.parler("UN GAU... UN GAUGAU...");

	        // Astérix frappe Minus
	        asterix.frapper(minus);

	        // Minus reçoit deux coups
	        minus.recevoirCoup(3);
	        minus.recevoirCoup(3);
	    }

		
	}
