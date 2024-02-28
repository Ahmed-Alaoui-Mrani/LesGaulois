package test_fonctionnel;

import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;
import personnages.Bouclier;
import personnages.Casque;
import personnages.Plastron;

public class TestGaulois {
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix");
        Gaulois asterix = new Gaulois("Asterix", 5);
        Gaulois obelix = new Gaulois("Obélix", 10);
        Gaulois assurancetourix = new Gaulois("Assurancetourix", 3);
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 7);
        Gaulois agecanonix = new Gaulois("Agecanonix", 6);
        Romain minus = new Romain("Minus", 6);
        
        minus.equiper(new Bouclier());
        minus.equiper(new Casque());
        minus.equiper(new Plastron());

        asterix.parler("J'ai concocté 3 doses de potion magique. Elle a une force de 3.");
        asterix.parler("Tiens asterix un peu de potion magique.");
        asterix.parler("Non, Obélix Non !... Et tu le sais très bien !");
        asterix.parler("Tiens Assurancetourix un peu de potion magique.");
        asterix.parler("Tiens Abraracourcix un peu de potion magique.");
        asterix.parler("Désolé Agecanonix il n'y a plus une seule goutte de potion.");

        asterix.attaquer(minus);
        
        panoramix.fabriquerPotion();
        System.out.println("Le gaulois Panoramix : « Tiens Asterix un peu de potion magique. ».");
        panoramix.booster(asterix);
        System.out.println("Le gaulois Panoramix : « Non, Obélix Non !... Et tu le sais très bien ! ».");
        panoramix.booster(obelix);
        System.out.println("Le gaulois Panoramix : « Tiens Assurancetourix un peu de potion magique. ».");
        panoramix.booster(assurancetourix);
        System.out.println("Le gaulois Panoramix : « Tiens Abraracourcix un peu de potion magique. ».");
        panoramix.booster(abraracourcix);
        System.out.println("Le gaulois Panoramix : « Désolé Agecanonix il n'y a plus une seule goutte de potion. ».");

        asterix.parler("Bonjour à tous");
        minus.parler("UN GAU... UN GAUGAU...");

        asterix.frapper(minus);
        minus.frapper(asterix);
        asterix.frapper(minus);
        minus.frapper(asterix);
        asterix.frapper(minus);
        minus.frapper(asterix);
        asterix.frapper(minus); 

       
	} 
}

	

