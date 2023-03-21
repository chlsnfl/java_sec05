package sec05.ch06;

public class ArrayExam9_teacher {

	public static void main(String[] args) {
		String subject = "자바프로그램";
		int location = subject.indexOf("프로그램");
		
		System.out.println(location);
		String cutString = subject.substring(0,location);
		System.out.println(cutString);
		
		location = subject.indexOf("자바");
		if(location == -1) {
			System.out.println("자바와 관련 없는 도서");
		}else {
			System.out.println("자바와 관련 있는 도서");
		}
		
		boolean rs = subject.contains("자바");
		if(rs) {
			System.out.println("자바와 관련 있는 도서");
		}else {
			System.out.println("자바와 관련 없는 도서");
		}
	}

}
