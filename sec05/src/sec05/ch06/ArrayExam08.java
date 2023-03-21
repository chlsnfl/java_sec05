package sec05.ch06;

public class ArrayExam08 {
//주민번호를 생년 번호와 뒷 번호로 나누어 출력하라
	public static void main(String[] args) {
		String main = "990909-245888";
		
		String front = main.substring(0, 6);
		System.out.println(front);
		
		String back = main.substring(7, 13);
		System.out.println(back);
		
	}

}
