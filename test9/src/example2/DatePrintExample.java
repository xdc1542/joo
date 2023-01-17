package example2;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DatePrintExample {

	public static void main(String[] args) {
		Date now = new Date(System.currentTimeMillis());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		String strDate = sdf.format(new Date());
		
		System.out.println(strDate);
				

	}

}
