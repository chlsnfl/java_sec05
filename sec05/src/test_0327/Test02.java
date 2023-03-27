package test_0327;
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("인치를 입력하세용");
		double in = scan.nextDouble();
		
		double rs = (double)in*0.0254;
		
		System.out.println(rs + "m");
	}

}
