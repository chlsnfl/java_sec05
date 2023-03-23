package test;
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력");
		int a = scan.nextInt();
		System.out.println("두번째 숫자 입력");
		int b = scan.nextInt();
		System.out.println("세번째 숫자 입력");
		int c = scan.nextInt();
		
		double rs = (double)(a+b+c)/3;
		System.out.println("결과값은 : " + rs + " 입니다.");
		
	}

}
