package sec06.ch07;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언(오버로딩)
	Car() {}
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

