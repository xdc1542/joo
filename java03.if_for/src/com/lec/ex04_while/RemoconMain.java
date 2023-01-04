package com.lec.ex04_while;

import javax.swing.JOptionPane;

public class RemoconMain {

	public static void main(String[] args) {
		
		// JOptionPane으로 작성
		// do while : 리모콘제어프로그램 만들기

		int menu = 0;
		int volumn = 0;	
		String data;

		do {
			data = JOptionPane.showInputDialog("번호를 입력하세요!!\n\n" +
						"1. 볼륨업 \n" + "2. 볼륨다운\n" + "3. 종료\n\n" +
					    "1~3번까지 입력하세요!!");
			
			if(data==null) data = "0";
			
			if(data.equals("")) {
				menu = 0;
			} else {
				menu = Integer.parseInt(data);
				
				if(menu==1) {
					volumn++;
				} else if(menu==2) {
					volumn--;
				} else {
					volumn = 0;
				}
				System.out.println("현재 volumn = " + volumn);
			}
			
		} while(menu!=3);	
		
		System.out.println("프로그램이 종료가 되었습니다!");
	}
}











