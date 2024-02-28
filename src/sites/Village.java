package sites;

import personnages.Gaulois;

import java.util.ArrayList;
import java.util.List;

public class Village {
	
	private Gaulois chef;
	private List<Gaulois> habitants;

    public Village(Gaulois chef) {
        this.chef = chef;
        this.habitants = new ArrayList<>();
        this.habitants.add(chef); 
    }
    
    public Gaulois getChef() {
        return chef;
    }
    
    public void ajouterVillageois(Gaulois villageois) {
        habitants.add(villageois);
    }
    
 // Méthode pour afficher le village
    public void afficherVillageois() {
        System.out.println("Le village de Vercingétorix est habité par:");
        for (int i = 1; i < habitants.size(); i++) {
            System.out.println("- " + habitants.get(i).getNom());
        }
    }
    
    public void changerChef(Gaulois nouveauChef) {
        if (!habitants.contains(chef)) {
            System.out.println("L'ancien chef " + chef.getNom() + " rejoint le village comme simple villageois.");
            ajouterVillageois(chef);
        }
        System.out.println("Le gaulois " + chef.getNom() + " : « Je laisse mon grand bouclier au grand " + nouveauChef.getNom() + " ».");
        System.out.println("Le gaulois " + nouveauChef.getNom() + " : « Merci ! ».");
        chef = nouveauChef;
        habitants.remove(nouveauChef);
    }

}