package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		// Création de l'objet Gaulois "Asterix"
        Gaulois asterix = new Gaulois("Astérix", 8);
        System.out.println(asterix);

        // Utilisation de la méthode parler
        asterix.parler("Bonjour à tous");
    }
	}

