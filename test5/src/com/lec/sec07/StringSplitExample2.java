package com.lec.sec07;

import java.util.StringTokenizer;

public class StringSplitExample2 {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
//		String[] names = text.split(",");
//		
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		StringTokenizer st = new StringTokenizer(text, "/");
		int countToken = st.countTokens();
		for(int i=0; i<countToken; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		while( st.hasMoreTokens() ) {
			text = st.nextToken();
			System.out.println(text);
		}
		
		

	}

}
