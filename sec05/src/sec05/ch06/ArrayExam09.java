package sec05.ch06;

public class ArrayExam09 {

	public static void main(String[] args) {
		String subject = "자바프로그램";
		int text = subject.indexOf("프로그램");
		
		if(text == -1) {
			System.out.println("없어용");
		}else {
			System.out.println(subject.substring(0,2));
		}
		
		int text2 = subject.indexOf("자바");
		if(text ==-1) {
			System.out.println("자바와 관련없는 책");
		}else {
			System.out.println("자바와 관련된 책");
		}
		
		if(subject.contains("자바")) {
			System.out.println("자바와 관련된 책");
		}else {
			System.out.println("자바와 관련 없는 책");
		}
		
		
		String str = "1, 자바, 학습, 참조 타입 String 을 공부합니다,홍길동";
		String[] str2 = str.split(",");
		
		System.out.println("번호 : " + str2[0]);
		System.out.println("제목 : " + str2[1]);
		System.out.println("내용 : " + str2[3]);
		
	}

}
