package com.lec.ex03_method;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		// return super.areaCircle(r);
		return Math.PI * r * r;
	}
}
