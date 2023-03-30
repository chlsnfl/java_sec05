package ch15;


public class Service {
	//필드, 생성자 없음 메소드만 가지고 있음
	@PrintAnnotation
	public void method1() {
		System.out.println("첫번째 실행내용");
	}
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("두번째 실행내용");
	}
	@PrintAnnotation(value = "#", number = 20)
	public void method3() {
		System.out.println("세번째 실행내용");
	}
	public void method4() {
		System.out.println("네번째 실행내용");
	}
	
}
