import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Patient {
	
	private String fname, lname;
	private int age;
	private Gender gender;
	private TempMeasure tm;
	private String ssn;
	private Date date;
	private ArrayList<String> phNum;
	private HashMap<String, String> symptomsList;
	private ArrayList<String> allergyList;
	private ArrayList<String> diseaseList;
	private double ftemp, ctemp;
	
	public String getName() {
		return fname +" "+ lname;
	}

	public void setName(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getSSN(){
		return ssn;
	}
	
	public void setSSN(String ssn){
		this.ssn = ssn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList<String> getAllergyList() {
		return allergyList;
	}

	public void setAllergyList(ArrayList<String> allergyList) {
		this.allergyList = allergyList;
	}

	public HashMap<String, String> getSymptomsList() {
		return symptomsList;
	}

	public void setSymptomsList(HashMap<String, String> symptomsList) {
		this.symptomsList = symptomsList;
	}

	public ArrayList<String> getDiseaseList() {
		return diseaseList;
	}

	public void setDiseaseList(ArrayList<String> diseaseList) {
		this.diseaseList = diseaseList;
	}

	public ArrayList<String> getPhNum() {
		return phNum;
	}

	public void setPhNum(ArrayList<String> phNum) {
		this.phNum = phNum;
	}
	
	public Gender getGender(){
        return gender;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

	public double getFtemp() {
		return ftemp;
	}

	public void setFtemp(double ftemp) {
		this.ftemp = ftemp;
	}

	public double getCtemp() {
		return ctemp;
	}

	public void setCtemp(double ctemp) {
		this.ctemp = ctemp;
	}

	public TempMeasure getTm() {
		return tm;
	}

	public void setTm(TempMeasure tm) {
		this.tm = tm;
	}
}
