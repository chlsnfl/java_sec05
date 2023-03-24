package sec06.ch08;

public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 아직 있습니다.");
		return true;
	}
	
	
	void keyTurnOn() {
		if(gas>0) {
			
			System.out.println(" 차량이 출발합니다.");
		}
	}
	//키턴은 메소드를 만든 후 그 안에서 run()을 실행
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("자동차가 달립니다.(gas 잔량 : "+gas+")");
				gas -= 1;
			}else{
				System.out.println("가스가 떨어져 자동차가 멈춥니다. (gas 잔량 : " +gas+")");
				return;
			}
		}
	}
}
