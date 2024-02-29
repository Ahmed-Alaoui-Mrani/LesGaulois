package batailles;

public class Embuscade implements DescriptionBataille{
	@Override
    public String decrireContexte() {
        return "Embuscade au cœur de la forêt";
    }
	
	@Override
    public String choisirCombattants() {
        return "Deux soldats tendent une embuscade à trois Gaulois";
    }
	
	@Override
    public String preparerCombat() {
        return "Les soldats sont équipés de tous leurs équipements";
    }

    @Override
    public String decrireCombat() {
        return "Les Gaulois, faisant une simple promenade, n'ont pas anticipé la bataille";
    }
    
    @Override
    public String donnerResultat() {
        return "Les Gaulois tombent dans l'embuscade et se retrouvent en difficulté";
    }

}
