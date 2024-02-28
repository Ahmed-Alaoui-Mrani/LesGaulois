package personnages;

import personnages.Romain;

public class Romain extends Personnage{
	private boolean estVivant;
	    private Equipement[] equipements;
	    
	 public Romain(String nom, int force) {
		 super(nom, force);
		 this.estVivant = true;
		 this.equipements = new Equipement[3]; 
	    }
	 
	 public void equiper(Equipement equipement) {
	        if (equipement instanceof Casque) {
	            equipements[0] = equipement;
	        } else if (equipement instanceof Plastron) {
	            equipements[1] = equipement;
	        } else if (equipement instanceof Bouclier) {
	            equipements[2] = equipement;
	        }
	    }
	 
	 public void parler(String message) {
	        System.out.println("Le soldat " + nom + " : \"" + message + "\".");
	    }
	 
	 public void attaquer(Gaulois adversaire) {
	        if (estVivant && !adversaire.estATerre()) {
	            parler("UN GAU... UN GAUGAU...");
	            adversaire.recevoirCoup(force);
	        }
	 }
	    
	    protected String donnerAuteur() {
	        return "Le Romain " + nom;
	    }
	    public void frapper(Gaulois adversaire) {
	        System.out.println(donnerAuteur() + " donne un grand coup au gaulois " + adversaire.getNom() + ".");
	        adversaire.recevoirCoup(force / 3);
	    }
	    }
