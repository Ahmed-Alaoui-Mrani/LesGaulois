package personnages;

import java.util.Random;

public class Druide extends Gaulois{
	private int quantitePotion;
    private int forcePotion;
    	
	public Druide(String nom) {
        super(nom, 0); 
        fabriquerPotion();
		}
        
        public void fabriquerPotion() {
            Random rand = new Random();
            quantitePotion = rand.nextInt(5) + 2; 
            forcePotion = rand.nextInt(5) + 2; 
        }  
        
            public int getQuantitePotion() {
                return quantitePotion;
            }

            public int getForcePotion() {
                return forcePotion;
            
       }
            public void booster(Gaulois cible) {
                if (!cible.getNom().equals("Obélix")) {
                    if (quantitePotion > 0) {
                        cible.setForce((int) (cible.getForce() * forcePotion));
                        quantitePotion--;
                        if (forcePotion > 1) {
                            forcePotion -= 0.5;
                        }
                    } else {
                        System.out.println("Plus de potion disponible !");
                    }
                } else {
                    System.out.println("Obélix ne peut pas boire de potion !");
                }
            }
        
}
