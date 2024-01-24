package personnages;

import personnages.Romain;

public class Romain {
	    private String nom;
	    private int force;

	    // Constructeur
	    public Romain(String nom, int force) {
	        this.nom = nom;
	        this.force = force;
	    }

	    // Getter pour le nom
	    public String getNom() {
	        return nom;
	    }
	    
	    //Getter pour le force
	    public int getForce() {
	        return force;
	    }
	    
	 // Nouvelle méthode parler pour les Romains
	    public void parler(String texte) {
	        System.out.println("Le Romain " + nom + " : \"" + texte + "\".");
	    }
	    
	    
	    // Nouvelle méthode pour recevoir un coup
	    public void recevoirCoup(int forceDuCoup) {
	        force -= forceDuCoup;
	        if (force < 0) {
	            force = 0;
	        }

	        if (force > 0) {
	            parler("Aïe !");
	        } else {
	            parler("J'abandonne...");
	        }
	    
	        }
	    }
