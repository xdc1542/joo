package example2;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		if(args.length == 1) {
			String data1 = args[0];
			System.out.println(data1);
			if(data1.equals("help")) {
				System.out.println("1: aaaaaa");
				System.out.println("2: bbbbbb");
				System.out.println("3: cccccc");
				System.out.println("4: dddddd");
			}
		} else {
			System.out.println("usage: only 1 args");
		}
		
//		String data1 = args[0];
//		String data2 = args[1];
//		System.out.println(data1);
//		System.out.println(data2);
//		
//		
//		System.out.println("args[0]: " + data1);
//		System.out.println("args[1]: " + data2);
		

	}

}