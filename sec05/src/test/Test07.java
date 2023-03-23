package test;
import java.util.*;
public class Test07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번쨰 숫자를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("첫번쨰 숫자를 입력하세요");
		int num2 = scan.nextInt();
		
		String change1 = Integer.toBinaryString(num1);
		String change2 = Integer.toBinaryString(num2);
		
		System.out.println("첫번째 숫자의 이진수는 : " + change1);
		System.out.println("두번째 숫자의 이진수는 : " + change2);
	}

}
