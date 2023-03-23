package test;
import java.util.*;
public class Test13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세용");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수를 입력하세용");
		int num2 = scan.nextInt();
		
		if(num1 == num2) {
			System.out.println("두 수가 같네용");
		}else if(num1>num2) {
			System.out.println("첫번째 정수가 크네용");
		}else if(num1<num2) {
			System.out.println("두번째 정수가 크네용");
		}
		
		
	}

}
