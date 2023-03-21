package sec05.ch05;

public class StringEqualsExam {

	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2가 참조하는 주소는 같다.");
		}else {
			System.out.println("strVar1과 strVar2가 참조하는 주소는 다르다.");
		}
		String strvar3 = new String("홍길동");
		String strvar4 = new String("홍길동");
		if(strvar3 == strvar4) {
			System.out.println("strVar1과 strVar2가 참조하는 주소는 같다.");
		}else {
			System.out.println("strVar1과 strVar2가 참조하는 주소는 다르다.");
		}
		//문자열의 연산 내용은 equals를 이용한다.
		if(strvar3.equals(strvar4)) {
			System.out.println("strVar1과 strVar2가 참조하는 주소는 같다.");
		}else {
			System.out.println("strVar1과 strVar2가 참조하는 주소는 다르다.");
		}
	}

}
