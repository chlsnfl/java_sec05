package sec05.ch07;

import java.util.Calendar;

public class MyWeek {

	public static void main(String[] args) {
		
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int Week = cal.get(Calendar.DAY_OF_WEEK);
		
//		switch(Week) {
//		case 1 :
//			today = Week.SUNDAY; 
//			break;
//		case 2 :
//			today = Week.MONDAY;
//			break;
//		case 3 :
//			today = Week.TUESDAY;
//			break;
//		case 4 :
//			today = Week.WENDESDAY;
//			break;
//		case 5 :
//			today = Week.THURSDAY;
//			break;
//		case 6 :
//			today = Week.FRIDAY;
//			break;
//		case 7 :
//			today = Week.SATURDAY;
//			break;
//			
//		}
//		System.out.println("오늘은 + "+today+"입니다.");
//		
//		if(today==Week.FRIDAY) {
//			System.out.println("불금을 준비합니다.");
//		}else if(today == Week.WENDESDAY) {
//			System.out.println("일주일의 반이 지났습니다. 피곤해~~");
//		}else {
//			System.out.println("열심히 자바를 공부합니다.");
//		}
//	}

}
