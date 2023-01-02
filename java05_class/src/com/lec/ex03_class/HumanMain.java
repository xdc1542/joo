package com.lec.ex03_class;

public class HumanMain {

	public static void main(String[] args) {
		
		Human 미국놈 = new Human("steve");
		Human korean = new Human("홍길동");
		
		System.out.println(미국놈.name);
		System.out.println(korean.name);
		System.out.println();
		
		미국놈.speak();
		korean.speak();
		System.out.println();
		
		미국놈.speak("영어");
		korean.speak("한글");
		System.out.println();
		
		미국놈.speak("영어", 28);
		korean.speak("한글", 27);
		System.out.println();
		
		System.out.println(미국놈.speak(1000, "영어"));
		System.out.println(korean.speak(999, "한글"));
		System.out.println();
		
		String result = korean.speak(31, "영어");
		System.out.println(result);
	}

}
