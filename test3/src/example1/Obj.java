package example1;

public class Obj {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = obj1;
		
		boolean result = obj1.equals(obj2);
		System.out.println(result);
		
		
		result = (obj1 == obj2);
		System.out.println(result);

	}

}
