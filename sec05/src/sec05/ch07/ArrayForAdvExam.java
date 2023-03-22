package sec05.ch07;

public class ArrayForAdvExam {

	public static void main(String[] args) {
		int[] scores = {88,95,77,96,48,98};
		int sum = 0;
		//일전에 배운 for문
//		for(int i=0;i<scores.length; i++) {
//			sum += scores[i];
//		}
		//오늘자 for문
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("점수 통합 : " + sum);
		double avg = (double) sum/scores.length;
		System.out.println("평균 : " + avg);
	}

}
