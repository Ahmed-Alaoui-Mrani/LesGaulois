package personnages;

import test_fonctionnel.*;

public class Soldat extends Romain {
	    private Grade grade;

	    public Soldat(String nom, int force, Grade grade) {
	        super(nom, force);
	        this.grade = grade;
	    }

	    // Getter pour le grade
	    public Grade getGrade() {
	        return grade;
	    }

}
