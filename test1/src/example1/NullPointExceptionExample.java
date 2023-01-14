package example1;

public class NullPointExceptionExample {
	public static void main(String[] args) {
		String data = null;
		try {
			
		
		System.out.println(data.toString());
		} catch(NullPointerException e) {
			System.out.println("NullPointException");
		
		} catch(NullPointerException e) {
			System.out.println(e.toString());
		}
		
		
	}
	


}
