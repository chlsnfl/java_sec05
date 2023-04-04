package test_0403;
import java.util.*;
public class Test02 {
	/*
	 * 두개의 점수를 입력받은 후 점수 배열에서 가장 큰 수를 별도로 저장해 놓는다.
	 * a/m*1000+b/m*100 = (a+b)*100/m/2*
	  */

	/*
	 * 1. 1차원 배열 선언 점수 입력
	 * 2. 과목의 길이를 저장
	 * 3. for(과목 길이만큼){
	 * 		배열에 각 점수 저장
	 * 		}
	 * 	for(){
	 * 		최고점수 max, 총점은 sum에다가 저장
	 * 		}
	 * 		sum *100 /max/n(갯수)
	 *  */
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //과목 수 선언
		int a[] = new int[n];  //과목 수 만큼 배열을 만듬
		for (int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		long sum = 0;
		long max = 0;
		for(int i = 0; i<n; i++) {
			if(a[i]>max)max = a[i];
			sum = sum+a[i];  //점수 총합
		}
		
		//한 과목과 관련된 수식을 총합한 후 수식으로 변환
		System.out.println("원래 평균 : " + sum/n);
		System.out.println("사기친평균 : " + sum * 100.0 / max / n); //long이니까 100.0임
	}
	
}
