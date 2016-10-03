public class Allergy {

	private String AllergyName;
	private String symptomName;
	private Severity sv;

	
	public String getAllergyName() {
		return AllergyName;
	}

	public void setAllergyName(String allergyName) {
		AllergyName = allergyName;
	}

	public String getSymptomsName() {
		return symptomName;
	}

	public void setSymptomsName(String symptomName) {
		this.symptomName = symptomName;
	}
	
	public Severity getSv() {
		return sv;
	}

	public void setSv(Severity sv) {
		this.sv = sv;
	}
	
}
