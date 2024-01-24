package sites;

import personnages.Gaulois;
import personnages.Soldat;

public class TestSites {
	public static void main(String[] args) {
		// Création du gaulois Vercingétorix et du village
	    Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
	    Village village = new Village(vercingetorix);
	    vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village.");

	    // Création du romain Minus et du camp
	    Soldat minus = new Soldat("Minus", 2, "SOLDAT");
	    Camp camp = new Camp(minus);
	    minus.parler("Je suis en charge de créer un nouveau camp romain.");

}
}
