package sec06;

public class NewCarExam {

	public static void main(String[] args) {
		//Car 객체를 생성하자용
		
		Newcar mycar = new Newcar();
		
		//Newcar 의 필드값을 읽어보자
		System.out.println("모델명 : "+mycar.model);
		System.out.println("시동 여부 : "+mycar.start);
		System.out.println("속도 : "+mycar.speed);
		
//		mycar.model = "현대자동차";
		
	}

}
