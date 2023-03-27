package sec06.ch10;

public class Car {
	int speed;
	void run() {
		System.out.println("자동차가 "+speed+" 으로 달립니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Car car = new Car();
			car.speed = 60;
			car.run();
			
			System.out.println(car);
	}

}
