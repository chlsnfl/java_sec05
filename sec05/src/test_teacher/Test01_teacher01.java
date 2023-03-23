package test_teacher;

public class Test01_teacher01 {
	
	private static double radius = 7.5;
	
	//static 넣어야함 
	
	
	public static void main(String[] args) {
		double perimeter = 2 * Math.PI* radius;
		double area = Math.PI * radius * radius;
		
		System.out.println("원 둘레는 : " + perimeter);
		System.out.println("원 넓이는 : " + area);
	}

}
