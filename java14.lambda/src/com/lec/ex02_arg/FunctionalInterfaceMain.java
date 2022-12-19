package com.lec.ex02_arg;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FuncInterface fi1 = null;
		fi1 = (int a) -> {
			int result = a+10;
			System.out.println(a + " + 10 = " + result);
		};
		fi1.method(10);
		fi1.method(100);
		System.out.println();
		
		fi1 = a -> { System.out.println(a + " + 10 = " + (a*10)); };
		fi1.method(10);
		// fi1.method("10"); 에러
		
		fi1 = a -> System.out.println(a + " + 10 = " + (a*10));
		fi1.method(100);

	}

}

@FunctionalInterface
interface FuncInterface {
	void method(int a);
}
