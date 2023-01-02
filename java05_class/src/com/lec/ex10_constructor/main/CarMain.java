package com.lec.ex10_constructor.main;

public class CarMain {

	public static void main(String[] args) {
		
		// 기본생성자 이외의 다른 생성자가 정의 되어
		// 있다면 기본 생성자는 자동으로 추가되지 않기
		// 떄문에 기본생성자를 별도로 정의해야 한다.
		Car car1 = new Car();
		Car car2 = new Car("분홍", 3000);
		Car car3 = new Car(2500, "검정");
		Car car4 = new Car("회색", 3000, "벤츠");
	}

}
