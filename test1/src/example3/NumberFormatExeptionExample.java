package example3;

public class NumberFormatExeptionExample {

	public static void main(String[] args) {
		String data1= "100";
		String data2= "100";
		String data4= null;
		
		
		try {
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		System.out.println(data4.toString());
		String data3= args[0];
		method1();
		
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(NumberFormatException e) {
		//} catch(Exception e) {
			System.out.println("Number " + e.toString());
		} catch(NullPointerException e) {
			System.out.println("NullPointer " + e.toString());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array " + e.toString());
		} catch(Exception e) {
			System.out.println("Exception " + e.toString());
		}

	}
	public static void method1() {
		String data5 = null;
		System.out.println(data5.toString());
	}

}