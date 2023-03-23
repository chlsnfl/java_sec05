package test;
import java.util.*;
public class Test08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세용");
		int a = scan.nextInt();
		
		String rs = Integer.toOctalString(a);
		
		System.out.println("숫자를 8진수로 변환하면 : "+ rs+" 입니당");
	}

}
