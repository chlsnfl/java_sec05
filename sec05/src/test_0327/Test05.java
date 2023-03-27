package test_0327;
import java.util.*;
public class Test05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요");
		int a = scan.nextInt();
		System.out.println("두 번째 숫자를 입력하세요");
		int b = scan.nextInt();
		
		int sum = a+b;
		System.out.println("두 수의 합은 : " +sum);
		int minus = a-b;
		System.out.println("두 수의 차이는 : " + minus);
		int gob = a*b;
		System.out.println("두 수의 차이는 : " + gob);
		int avg = (a+b)/2;
		System.out.println("두 수의 차이는 : " + avg);
//		if(a>b) {
//			System.out.println("두 수 중 큰 수는 : " + a + " 작은 수는 : "+b);
//		}else {
//			System.out.println("두 수 중 큰 수는 : " + b + "작은 수는 : "+a);
//		}
		
		System.out.println("큰 수 " + Math.max(a, b));
		System.out.println("작은 수 " + Math.min(a, b));

	}

}
