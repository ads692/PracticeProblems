
public class Temperature {
	double ftemp;
	  
	public double getFahrenheit(){
	    return ftemp;
	}
	
	public void setFahrenheit(double ftemp){
		this.ftemp = ftemp;
	}
	
	public double getCelsius(){
	    return ((double)5/9*(ftemp-32));
	}
}
