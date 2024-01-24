package personnages;

public class Gaulois {
	    private String nom;
	    private int force;

	    // Constructeur
	    public Gaulois(String nom, int force) {
	        this.nom = nom;
	        this.force = force;
	    }

	    // Getter pour le nom
	    public String getNom() {
	        return nom;
	    }	
	    public int getForce() {
	        return force;
	    }

	    @Override
	    public String toString() {
	        return nom;
	    }
	    
	    public void parler(String texte) {
	        System.out.println("Le gaulois " + nom + " : \"" + texte + "\".");
	    }

	    public static void mainA(String[] args) {
	        Gaulois asterix = new Gaulois("Astérix", 8);

	        // Utiliser System.out.println avec l'objet Gaulois
	        System.out.println(asterix);  // Cela appelle automatiquement la méthode toString
	    }
	}
