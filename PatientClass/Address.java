public class Address {
	private String add1;
	private String add2;
	private String ct;
	private USStates st;
	private int zip;
	
	public Address(String AddrLine1, String AddrLine2, String city, USStates state, int zipcode){
		add1 = AddrLine1;
		add2 = AddrLine2;
		ct = city;
		st = state;
		zip = zipcode;
	}
	
	public String getAdd1(){
		return add1;
    }

    public String getAdd2(){
        return add2;
    }
    
    public String getCity(){
        return ct;
    }

    public USStates getState(){
        return st;
    }
    
    public int getZip(){
        return zip;
    }
    
    public String format(){ 
          return add1 + ", "+ add2 + ", " + ct + ", " + st.name +", " + zip;
    }
}
