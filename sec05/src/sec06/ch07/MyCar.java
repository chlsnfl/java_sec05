package sec06.ch07;

public class MyCar {

	public static void main(String[] args) {
		Car mycar = new Car();
		System.out.println("회사명은 : "+ mycar.company);
		
		mycar.model = "베뉴";
		System.out.println("회사명은 : " + mycar.company + " 제품명은 : " + mycar.model );
		
		mycar.color = "navy";
		System.out.println("회사명은 : " + mycar.company + " 제품명은 : " + mycar.model +" 색상은 : "+mycar.color);
		
		mycar.maxSpeed = 200;
		System.out.println("회사명은 : " + mycar.company + " 제품명은 : " + mycar.model
							+" 색상은 : "+mycar.color + " 최대 속도는 : "+ mycar.maxSpeed);
		
	
	}

}
