package example4;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
		
	}
	
	@Override
	public String toString() {
//		return company + "," + os;
		return myString();
	}
	
	public String myString() {
		return company + "," + os;
	}

}
