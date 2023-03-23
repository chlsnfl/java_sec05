package sec06.ch07;
import java.util.*;
public class Test09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scroes = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				System.out.println("학생 수 >");
				int selectNo1 = scanner.nextInt();
			}else if(selectNo == 2) {
				System.out.println("점수 입력 >");
				int selectNo2_1 = scanner.nextInt();
				int selectNo2_2 = scanner.nextInt();
				int selectNo2_3 = scanner.nextInt();
			}else if(selectNo == 3) {
				
			}else if(selectNo ==4) {
				
			}else if(selectNo == 5) {
				run = false;
			}
		}

	}

}
