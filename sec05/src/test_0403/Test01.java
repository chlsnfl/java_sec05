package test_0403;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String sNum = scan.next(); //입력값을 받음
		
		char[] cNum = sNum.toCharArray(); //String 각각을 Char 로 변환해 배일에 저장
		int sum = 0;
		
		for(int i=0; i<cNum.length; i++) {
			sum+=cNum[i]-'0';
		}
	
		System.out.println(sum);
	}


}

/*
 * String num
 * 정수형 변환 : Integer.parseInt(num);
 * 				Integer.valueOf(num)
 * 실수형 변환 : Double.parseDouble(num) //Double.valueOf(num)
 * float, long, short
 * 
 * int i = 1235;
 * String si = String.valueOf(i)
 * */
 


 