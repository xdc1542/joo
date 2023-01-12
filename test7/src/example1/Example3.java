package example1;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Example3 {

	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		System.out.println(c1.getTime());
		
//		System.out.println(c1.getWeeksInWeekYear());
//		System.out.println(c1.getWeekYear());
//		System.out.println(c1.getFirstDayOfWeek());
//		System.out.println(c1.getMinimalDaysInFirstWeek());
//		System.out.println(c1.DAY_OF_WEEK);

		int week = c1.get(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.WEDNESDAY);
		if(week == Calendar.WEDNESDAY) {
			System.out.println("수요일");
		} else {
			System.out.println("...");
		}
		
		c1.clear();
		System.out.println(c1.getTime());
		
		c1.set(2022, 11, 25);
		System.out.println(c1.getTime());

	}

}
