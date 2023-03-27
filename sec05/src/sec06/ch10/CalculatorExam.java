package sec06.ch10;

public class CalculatorExam {
	String myCal = "공학용계산기";

	public static void main(String[] args) {
		CalculatorExam c = new CalculatorExam();
		Calculator myCal = new Calculator(); //객체생성
		System.out.println(myCal.pi);
		System.out.println(myCal.plus(20,15));
		System.out.println(myCal.minus(14,4));
		System.out.println(c.myCal);
	}

}
