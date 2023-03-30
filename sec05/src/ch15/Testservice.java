package ch15;

public class Testservice {
	@PrintAnnotation
	public void method() {
		System.out.println("오늘의 점심은 감자탕탕탕");
	}
	@PrintAnnotation("***")
	public void method2() {
		System.out.println("오늘의 점심은 감자탕탕탕");
	}
}
