package sec06.ch08;

public class CarExam {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		mycar.setGas(10);  //gas 10을 주유 - Car의 setGas() 메소드 호출
		

		
		boolean isGas = mycar.isLeftGas();   //가스가 있는지 확인
		if(isGas) {
			System.out.println("출발합니다.");
			mycar.run();   //Car의 run() 메소드 호출하여 차량을 출발시킨다.
		}
		
		if(!mycar.isLeftGas()) {
			System.out.println("gas를 주입해 주세요.");
		}
		
		mycar.setGas(5);
		boolean isGas2 = mycar.isLeftGas();
		if(isGas) {
			System.out.println("가스가 주입되었습니다.");
			mycar.keyTurnOn();
			mycar.run();
		}

		
		
	}

}
 