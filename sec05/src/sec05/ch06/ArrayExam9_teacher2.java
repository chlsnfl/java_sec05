package sec05.ch06;

public class ArrayExam9_teacher2 {

	public static void main(String[] args) {
		String board = "1, 자바, 학습, 참조 타입 String 을 공부합니다,홍길동";
		
		String[] tk  = board.split(",");
		
		System.out.println("번호 : "+tk[0]);
		System.out.println("제목 : "+tk[1]);
		System.out.println("내용 : "+tk[2]);
		System.out.println("이름 : "+tk[3]);
	}

}
