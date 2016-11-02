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
		
		Address ad = new Address("1130 E univ Dr", "Apt 201", "Tempe", USStates.AZ, 85281);
		pt.setAddress(ad.format());
		
		
		//-----------------------All Dates functionalities--------------------------------------
		
		Calendar now = Calendar.getInstance();
		pt.setDate(now.getTime());
		
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date bday = (Date)format.parse("12/06/1992");
		pt.setDob(bday);
		
		LocalDate currentLocalDate = LocalDate.now();
		pt.setCld(currentLocalDate);
		
		LocalDate birthdate = LocalDate.of(1992, Month.DECEMBER, 6);
		pt.setBirthdate(birthdate);
		
		long timeBetweenInMillis = pt.getDate().getTime() - pt.getDob().getTime();
		
		LocalDate endDate1 = LocalDate.of(2016, Month.NOVEMBER, 15);
		LocalDate endDate2 = LocalDate.of(2016, Month.DECEMBER, 17);
		
		/*int NoOfDays = Period.between(mf.getStartDate(), mf.getEndDate()).getDays();
		System.out.println("Meds prescribed for med 1 " + NoOfDays + " days");
		
		int NoOfDays2 = Period.between(mf.getStartDate(), mf.getEndDate()).getDays();
		System.out.println("Meds prescribed for Med 2 " + NoOfDays2 + " days");*/
		
		//System.out.println("This is LDT2 "+ pt.getLd());
		
/*		Calendar birthday = new GregorianCalendar();
	    birthday.setTime(bday);
	    System.out.println(birthday);
*/		
		
		//-----------------------All Dates functionalities--------------------------------------
		
		pt.setName("Jack","Bauer");		
		pt.setGender(Gender.Male);
		pt.setSSN("123-45-789");
		pt.setRb(ReportedBy.Relative);
		
		ArrayList<String> phNum = new ArrayList<String>();
		phNum.add("+1 458-234-9876");
		pt.setPhNum(phNum);
		
		ArrayList<String> allergies = new ArrayList<String>();
		ArrayList<String> medList = new ArrayList<String>();
		ArrayList<String> diseaseList = new ArrayList<String>();
		
		Allergy al = new Allergy();
		al.setAllergyName("Peanut Butter");
		al.setSymptomsName("rashes");
		al.setSv(Severity.High);
		allergies.add(al.formatAllergy());
		
		Allergy al1 = new Allergy();
		al1.setAllergyName("Pollen");
		al1.setSymptomsName("swelling");
		al1.setSv(Severity.Low);			
		allergies.add(al1.formatAllergy());
		
		pt.setAllergyList(allergies);
		
		MedFreq mf = new MedFreq();
		mf.setMedName("Med1");
		mf.setMt(MedType.Hourly);
		mf.setTimes(3);
		mf.setStartDate(currentLocalDate);
		mf.setEndDate(endDate1);
		medList.add(mf.formatPrescription());
				
		MedFreq mf1 = new MedFreq();
		mf1.setMedName("Med2");
		mf1.setMt(MedType.Daily);
		mf1.setTimes(2);
		mf1.setStartDate(currentLocalDate);
		mf1.setEndDate(endDate2);		
		medList.add(mf1.formatPrescription());
		
		//medList.remove(mf.getMedName());
		
		pt.setMedChart(medList);
		
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
		pt.setKtemp(t1.getKelvin());
		pt.setTm(TempMeasure.Mouth);
		
		System.out.println("Patient Info::");
		System.out.println("Date - " + pt.getDate());
		System.out.println("Name - " + pt.getName());
		System.out.println("D.O.B - " + pt.getDob());
		
		findAge(bday);
		
		System.out.println("Single line age - " + pt.getAge(bday, now, timeBetweenInMillis));
		System.out.println("Using LocalDate - Age - " + pt.getAgeFromLD() + " years");
		
		
		System.out.println("Address - " + pt.getAddress());
		System.out.println("Gender - " + pt.getGender());
		System.out.println("Phone Numbers - " + pt.getPhNum());
		System.out.println("SSN - " + pt.getSSN());
		
		System.out.println("Allergies - " + pt.getAllergyList());
		System.out.println("Prescription - " + pt.getMedChart());
		System.out.println("Diseases - " + pt.getDiseaseList());
		
		System.out.println("Temp in F - " + pt.getFtemp());
		System.out.println("Temp in C - " + Math.round(pt.getCtemp() * 100d) / 100d);
		System.out.println("Temp in K - " + Math.round(pt.getKtemp() * 100d) / 100d);
		System.out.println("Temp checked through - " + pt.getTm());
		System.out.println("Reported By " + pt.getRb());
		System.out.println(t1.hasFever());
		
		System.out.println("--------------------------------------");
	}

	private static void findAge(Date birthday) throws ParseException {
		
		Calendar now = Calendar.getInstance();
		now.setTime(new Date());
		
		DateFormat format = new SimpleDateFormat("MMM dd yyyy");
		birthday = (Date)format.parse("Dec 6 1992");
		System.out.println("D.O.B throught String - " + format.format(birthday));
		
		Calendar bday = Calendar.getInstance();
		bday.setTime(birthday);
		
		System.out.println("Age using function - "+ (now.get(Calendar.YEAR) - bday.get(Calendar.YEAR))+ " years");
		
	}

}
