package sec05.ch06;

public class ArrayExam03 {

	public static void main(String[] args) {
		int [] arr1 = new int[3];
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]);
		}
		arr1[0] = 20;
		arr1[1] = 30;
		arr1[2] = 40;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}
		arr2[0] = 0.2;
		arr2[1] = 0.5;
		arr2[2] = 0.7;
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		
		
	}

}
}
