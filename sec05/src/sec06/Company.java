package sec06;

public class Company {

	public static void main(String[] args) {

		Car kia = new Car();
		
		kia.speedsum();
		kia.speedsum();
		
		System.out.println(kia.company);
		System.out.println(kia.color);
		System.out.println(kia.model);
		System.out.println(kia.maxSpeed);
		System.out.println(kia.speed);
		
		//필드값 변경
		kia.speed = 60;
		
	
		
		System.out.println("수정된 속도 : " +kia.speed);
	}

}
