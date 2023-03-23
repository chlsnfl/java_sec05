package sec06.ch07;

public class Test07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for(int a = 0; a<array.length; a++) {
			if(array[a]>max) {
				max = array[a];
			}
		}
		System.out.println("최대값은 : " + max);
	
		
		
	}
	
}
