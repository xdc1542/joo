package example1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class example2 {

	public static void main(String[] args) {
		Calendar cld = Calendar.getInstance();
		String strcld = cld.toString();
		
		System.out.println(cld);
		System.out.println(strcld);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String ss = sdf.format(cld.getTimeInMillis());
		System.out.println(ss);

	}

}
