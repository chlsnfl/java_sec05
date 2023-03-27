package test_0327;
import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("온도를 입력하세용");
		int a = scan.nextInt();
		
		double f = (double)(a*1.8)+32;
		System.out.println("화씨는 : "+ f);
		
		double weather = (double)(5*(f-32))/9;
		System.out.println("섭씨는 : " + weather);
	}

}
