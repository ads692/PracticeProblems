
public class Temperature {
	double ftemp;
	  
	public double getFahrenheit(){
	    return ftemp;
	}
	
	public void setFahrenheit(double ftemp){
		this.ftemp = ftemp;
	}
	
	public double getCelsius(){
	    return ((double)5/9*(ftemp - 32));
	}
	
	public double getKelvin(){
	    return ((double)5/9*(ftemp + 459.67));
	}
	
	public String hasFever(){
		
		if(getFahrenheit() > 100.8 || getCelsius() > 39){
			return "Patient has fever";
		}
		else{
			return "Patient has no fever";
		}
	}
}
