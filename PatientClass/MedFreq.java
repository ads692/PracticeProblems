import java.time.LocalDate;

public class MedFreq {

	private String MedName;
	private int times;
	private LocalDate startDate;
	private LocalDate endDate;
	private MedType mt;
	
	public String getMedName() {
		return MedName;
	}
	public void setMedName(String medName) {
		MedName = medName;
	}
	
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}

	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public MedType getMt() {
		return mt;
	}
	
	public void setMt(MedType mt) {
		this.mt = mt;
	}
	
	public String formatPrescription(){
		return getMedName() + " " + getTimes() + " times " + getMt() + " from " + getStartDate() + " to " + getEndDate();
		
	}
}
