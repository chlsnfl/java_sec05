package test_teacher;

import java.util.Scanner;

public class Test01_teacher02 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세용");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세용");
		int num2 = sc.nextInt();
		System.out.println("세 번째 숫자를 입력하세용");
		int num3 = sc.nextInt();
		
		System.out.println((num1+num2+num3)/3);
	}

}
