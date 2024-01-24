package personnages;

import personnages.Romain;

public class Romain extends Personnage{
	 public Romain(String nom, int force) {
	        super(nom, force);
	    }

	    
	    protected String donnerAuteur() {
	        return "Le Romain " + nom;
	    }
	    public void frapper(Gaulois adversaire) {
	        System.out.println(donnerAuteur() + " donne un grand coup au gaulois " + adversaire.getNom() + ".");
	        adversaire.recevoirCoup(force / 3);
	    }
	    }
