package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		// Création de l'objet Gaulois "Asterix"
        Gaulois asterix = new Gaulois("Astérix", 8);
        System.out.println(asterix);

        // Utilisation de la méthode parler
        asterix.parler("Bonjour à tous");
        
     // Création d'un objet Romain pour Minus
        Romain minus = new Romain("Minus", 6);

        // Faire parler le Romain
        minus.parler("UN GAU... UN GAUGAU...");
        
        Gaulois asterix1 = new Gaulois("Astérix", 8);
        Romain minus1 = new Romain("Minus", 6);

        asterix1.parler("Bonjour à tous");
        minus1.parler("UN GAU... UN GAUGAU...");

        // Faire recevoir deux coups successifs de force 3 à Minus avec une boucle for
        for (int i = 0; i < 2; i++) {
            minus1.recevoirCoup(3);
        }
        
        // Astérix frappe Minus
        asterix1.frapper(minus1);

        // Afficher la force restante de Minus après le coup
        System.out.println("Force restante de " + minus1.getNom() + " : " + minus1.getForce());
    }
	}

