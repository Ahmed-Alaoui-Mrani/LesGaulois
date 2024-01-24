package personnages;

public class Soldat extends Romain {
	    private String grade;

	    public Soldat(String nom, int force, String grade) {
	        super(nom, force);
	        this.grade = grade;
	    }

	    // Getter pour le grade
	    public String getGrade() {
	        return grade;
	    }

}
