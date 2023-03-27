package test_0327;

import java.time.Instant;

public class Test04 {

	public static void main(String[] args) {

		long unixTime = Instant.now().getEpochSecond();
		System.out.println(unixTime);
		
		long year = unixTime / (365*24*60*60);
		long day = (int)(unixTime / 60/60/24)%365;
		
		System.out.println(year + "년" + day + "일 지났습니다.");
		
		int a = 40;
		int b = 90;
		
		System.out.println("큰 수 " + Math.max(a, b));
	}

}
