package com.lec.ex11_method.overloading;

public class RectangleMain {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		System.out.println("정사각형의 넓이 = " + rec.arearRectangle(10));
		System.out.println("직사각형의 넓이 = " + rec.arearRectangle(10, 20));
	}
}


// 실습. 정사각형의 넓이, 직사각형의 넓이를 구하는 메서드 작성하기
// areaRectngle(10), areaRectngle(10, 20)
class Rectangle {

	public int arearRectangle(int i) {
		return i*i;
	}

	public int arearRectangle(int i, int j) {
		return i*j;
	}
	
}