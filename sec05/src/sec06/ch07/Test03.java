package sec06.ch07;

public class Test03 {

	public static void main(String[] args) {
		int[][] array;
		array= new int[][] {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			for (int j = 0; j<array[i].length; j++) {
					sum += array[i][j];
			}
		}
		System.out.println("총 합은 : "+ sum);
		
		double avg = (double)sum/10;
		System.out.println("평균은 : " + avg);
	}

}
