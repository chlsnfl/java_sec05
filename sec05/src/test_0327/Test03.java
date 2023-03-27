package test_0327;
import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		
		/*예시 565
		 * 1. 565%10 -->5
		 * 2. 56/10으로 나누면 -->6
		 * 3. 56%10 --> 5
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("0에서 1000까지의 숫자를 입력하세용");
		int a = scan.nextInt();

		int f = a%10;
		int nf = a/10;
		int s = a%10;
		nf = nf/10;
		int th = nf%10;
		nf = nf/10;
		int fo = nf%10;
		int sum = th+s+f+fo;
		
		System.out.println(sum);
		
		
		/*
		 * if(a>0 && a<1000){
		 * 	int first = a/100
		 *  int sec = int(a%100*0.1);
		 *  int thr = a%10;
		 *  syso
		 *  }else{
		 *  syso(false);*/
		
	}

}
