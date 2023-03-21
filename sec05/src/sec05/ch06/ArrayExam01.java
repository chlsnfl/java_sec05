package sec05.ch06;

public class ArrayExam01 {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		double avr = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			avr =(int) sum/scores.length;
			
		}
		System.out.println(sum);
		System.out.println(avr);
	}

}
