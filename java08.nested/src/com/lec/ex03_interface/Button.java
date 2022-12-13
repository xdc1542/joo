package com.lec.ex03_interface;

public class Button {

	private OnClickListner listner;
	XXX xxx;
	
	// 메서드
	void click() {
		listner.OnClick();
	}
	
	public void setListner(OnClickListner listner) {
		this.listner = listner;
	}
	
	// 중첩인터페이스
	interface OnClickListner {
		void OnClick();
	}
}

interface XXX {
	void OnClick();
}