import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class PatientHealthInfo {
	public static void main(String[] args) {
		
		Patient pt = new Patient();
		
		Calendar cal = Calendar.getInstance();
		pt.setDate(cal.getTime());
		pt.setName("Jack","Bauer");		
		pt.setAge(23);
		pt.setGender(Gender.Male);
		pt.setSSN("123-45-789");
		
		
		ArrayList<String> phNum = new ArrayList<String>();
		phNum.add("+1 458-234-9876");
		pt.setPhNum(phNum);
				
		ArrayList<String> diseaseList = new ArrayList<String>();
		HashMap<String, String> allergyList = new HashMap<String, String>();
		
		Allergy al = new Allergy();
		al.setAllergyName("rashes");
		al.setSeverity("high");
		
		allergyList.put(al.getAllergyName(), al.getSeverity());
		
		Allergy al1 = new Allergy();
		al1.setAllergyName("swelling");
		al1.setSeverity("medium");
		allergyList.put(al1.getAllergyName(), al1.getSeverity());
		pt.setAllergyList(allergyList);
		
		Disease d1 = new Disease();
		d1.setDiseaseName("AIDS");
		diseaseList.add(d1.getDiseaseName());
		
		Disease d2 = new Disease();
		d2.setDiseaseName("Dengue");
		diseaseList.add(d2.getDiseaseName());
		
		pt.setDiseaseList(diseaseList);
		
		
		Temperature t1 = new Temperature();
		t1.setFahrenheit(101.2);
		pt.setFtemp(t1.getFahrenheit());
		pt.setCtemp(t1.getCelsius());
		pt.setTm(TempMeasure.Mouth);
		
		System.out.println("Patient Info::");
		System.out.println("Date - " + pt.getDate());
		System.out.println("Name - " + pt.getName());
		System.out.println("Age - " + pt.getAge() + " yrs ");
		System.out.println("Gender - " + pt.getGender());
		System.out.println("Phone Numbers - " + pt.getPhNum());
		System.out.println("SSN - " + pt.getSSN());
		System.out.println("Allergies - " + pt.getAllergyList());
		System.out.println("Diseases - " + pt.getDiseaseList());
		System.out.println("Temp in F - " + pt.getFtemp());
		System.out.println("Temp in C - " + pt.getCtemp());
		System.out.println("Temp checked through - " + pt.getTm());
		
		if(pt.getFtemp() > 100.8 || pt.getCtemp() > 39){
			System.out.println("Patient has fever");
		}
		
		System.out.println("--------------------------------------");
	}

}
