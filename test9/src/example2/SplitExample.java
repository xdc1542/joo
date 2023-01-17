package example2;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		String[] names = str.split(",");
		
		System.out.println();
		
		for(String name: names) {
			System.out.println(name);
		}

	}

}
