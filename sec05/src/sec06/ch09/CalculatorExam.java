package sec06.ch09;

public class CalculatorExam {

	public static void main(String[] args) {
		
		double rs3 = 10*10*Calculator.pi;

		
		Calculator mycal = new Calculator();
		
		//정사각형 넓이
		double rs1 = mycal.areaRect(12.5);
		
		//직사각형 넓이
		double rs2 = mycal.areaRect(18,21);
		
		System.out.println("정사각형의 넓이는 :" + rs1);
		System.out.println("직사각형의 넓이는 :" + rs2);
		System.out.println("rs3 : " + rs3);
	}

}
