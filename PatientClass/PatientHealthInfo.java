import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class PatientHealthInfo {
	public static void main(String[] args) throws ParseException {
		
		Patient pt = new Patient();
		
		Calendar now = Calendar.getInstance();
		pt.setDate(now.getTime());
		
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date bday = (Date)format.parse("12/06/1992");
		pt.setDob(bday);
		
		LocalDate currentLocalDate = LocalDate.now();
		pt.setCld(currentLocalDate); //2016-10-20
		
		LocalDate birthdate = LocalDate.of(1992, Month.DECEMBER, 20);
		pt.setLd(birthdate); //1992-12-06
		
		int p = Period.between(pt.getLd(), pt.getCld()).getYears();
		System.out.println("Using LD - Age " + p);
		
		//System.out.println("This is LDT2 "+ pt.getLd());
		
		
		
		/*Calendar birthday = new GregorianCalendar();
	    birthday.setTime(bday);
	    System.out.println(birthday);*/
		
		//LocalDate birthday = bday.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		
		//pt.setDob(1992, Calendar.DECEMBER, 06);
		pt.setName("Jack","Bauer");		
		pt.setGender(Gender.Male);
		pt.setSSN("123-45-789");
		pt.setRb(ReportedBy.Relative);
		
		ArrayList<String> phNum = new ArrayList<String>();
		phNum.add("+1 458-234-9876");
		pt.setPhNum(phNum);
				
		ArrayList<String> diseaseList = new ArrayList<String>();
		ArrayList<String> allergies = new ArrayList<String>();
		HashMap<String, String> allergySymptomList = new HashMap<String, String>();
		
		Allergy al = new Allergy();
		al.setAllergyName("Peanut Butter");
		al.setSymptomsName("rashes");
		al.setSv(Severity.High);
		allergySymptomList.put(al.getSymptomsName(), al.getSv().toString());
		
		
		Allergy al1 = new Allergy();
		al1.setAllergyName("Pollen");
		al1.setSymptomsName("swelling");
		al1.setSv(Severity.Low);
		allergySymptomList.put(al1.getSymptomsName(), al1.getSv().toString());
						
		pt.setSymptomsList(allergySymptomList);
		
		allergies.add(al.getAllergyName());
		allergies.add(al1.getAllergyName());
		pt.setAllergyList(allergies);
		
		
		Disease d1 = new Disease();
		d1.setDiseaseName("AIDS");
		diseaseList.add(d1.getDiseaseName());
		
		Disease d2 = new Disease();
		d2.setDiseaseName("Dengue");
		diseaseList.add(d2.getDiseaseName());
		diseaseList.remove(0);
		
		pt.setDiseaseList(diseaseList);
		
		
		Temperature t1 = new Temperature();
		t1.setFahrenheit(101.2);
		pt.setFtemp(t1.getFahrenheit());
		pt.setCtemp(t1.getCelsius());
		pt.setTm(TempMeasure.Mouth);
		
		long timeBetweenInMillis = pt.getDate().getTime() - pt.getDob().getTime();
		
		System.out.println("Single line age " + pt.getAge(bday, now, timeBetweenInMillis));
		
		System.out.println("Patient Info::");
		System.out.println("Date - " + pt.getDate());
		System.out.println("Name - " + pt.getName());
		System.out.println("D.O.B - " + pt.getDob());
		
		//System.out.println("Age - "+ (now.get(Calendar.YEAR) - birthday.getYear()) + " years");
		//findAge(bday);
		
		System.out.println("Gender - " + pt.getGender());
		System.out.println("Phone Numbers - " + pt.getPhNum());
		System.out.println("SSN - " + pt.getSSN());
		System.out.println("Allergies - " + pt.getAllergyList());
		System.out.println("Symptoms - " + pt.getSymptomsList());
		System.out.println("Diseases - " + pt.getDiseaseList());
		System.out.println("Temp in F - " + pt.getFtemp());
		System.out.println("Temp in C - " + pt.getCtemp());
		System.out.println("Temp checked through - " + pt.getTm());
		System.out.println("Reported By " + pt.getRb());
		
		if(pt.getFtemp() > 100.8 || pt.getCtemp() > 39){
			System.out.println("Patient has fever");
		}
		
		System.out.println("--------------------------------------");
	}

	private static void findAge(Date birthday) throws ParseException {
		
		Calendar now = Calendar.getInstance();
		now.setTime(new Date());
		
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		birthday = (Date)format.parse("12/31/1992");
		
		Calendar bday = Calendar.getInstance();
		bday.setTime(birthday);
		
		System.out.println("Age - "+ (now.get(Calendar.YEAR) - bday.get(Calendar.YEAR))+ " years");
		
	}

}
