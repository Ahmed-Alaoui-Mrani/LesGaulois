package personnages;

public class Gaulois extends Personnage{
	public Gaulois(String nom, int force) {
        super(nom, force);
    }
	public void setForce(int force) {
        this.force = force;
    }
    
    protected String donnerAuteur() {
        return "Le Gaulois " + nom;
    }
    public void attaquer(Romain adversaire) {
        
    }
	}
