package personnages;

public abstract class Personnage {
	protected String nom;
    protected int force;

    protected Personnage(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }
    public Integer getForce() {
        return force;
    }
    public void parler(String texte) {
        System.out.println(donnerAuteur() + " : \"" + texte + "\".");
    }

    public void frapper(Personnage adversaire) {
        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + adversaire.getNom() + ".");
        adversaire.recevoirCoup(force / 3);
    }

    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force < 0) {
            force = 0;
        }

        if (force > 0) {
            parler("Aïe !");
        } else {
            parler("J'abandonne...");
        }
    }
    protected abstract String donnerAuteur();
    
    public boolean estATerre() {
        return force <= 0;
    }
    
}

