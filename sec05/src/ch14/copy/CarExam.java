package ch14.copy;

public class CarExam {

	public static void main(String[] args) {
			Car mycar = new Car();
			
			//잘못된 속도 변경
			mycar.setSpeed(-50);
			System.out.println("현재 속도 : "+mycar.getSpeed());
			
			mycar.setSpeed(60);
			
			if(mycar.isStop()) {
				mycar.setStop(true);
			}
			
			System.out.println("현재 속도 : " + mycar.getSpeed());
	}

}
