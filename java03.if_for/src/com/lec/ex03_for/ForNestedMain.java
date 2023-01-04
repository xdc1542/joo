package com.lec.ex03_for;

public class ForNestedMain {

	public static void main(String[] args) {
		
		// 구구단(세로)
		for(int dan=2;dan<=9;dan++) {
			System.out.println("---< " + dan + "단 >---");
			for(int i=1;i<=9;i++) {
				System.out.println(dan + " x " + i + " = " + (dan * i));
			}
			System.out.println();
		}
		// Systen.out.printf()
		System.out.printf("%d x %d = %2d\n", 2, 2, 4);
		System.out.printf("%d x %d = %2d\n", 2, 9, 18);
		System.out.println();
		
		// 실습. 구구단(가로)
		// 2 x 1 = 2  ... 9 x 1 = 9
		// ...
		// 2 x 9 = 18 ...  9 x 9 = 81
		String gugudan;
		
		for(int i=1;i<=9;i++) {
			gugudan = "";
			for(int dan=2;dan<=9;dan++) {
				gugudan += dan + " x " + i + " = " + (dan*i) + " ";			
			}
			System.out.println(gugudan);
		}		
	}

}
