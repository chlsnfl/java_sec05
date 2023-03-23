package test_teacher;


public class Test01_teacher03 {
	

	public static void main(String[] args) {
			double width = 5.5;
			double height = 8.5;
			
			double perimeter = 2*(width+height);
			double area = width*height;
			
			System.out.printf("직사각형의 둘레는 2*(%.1f+%.1f)=%.2f\n", height, width, perimeter);
	}

}
