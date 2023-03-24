package sec06.ch08;

public class CaculatorExam {

	public static void main(String[] args) {
		//생성
		Calculator cal = new Calculator("노란색", "초딩용");
			
		System.out.println(cal.color + " " + cal.type + " 계산기가 있습니다.");
		
		cal.powerOn();
		
		byte x = 10;
		byte y = 4;
		
		double rs = cal.divide(x, y);
		System.out.println(x + "와 " +y + "를 나눕시다");
		System.out.println("계산 결과값은 : " + rs + " 입니다.");
		
		cal.powerOff();
	}

}
