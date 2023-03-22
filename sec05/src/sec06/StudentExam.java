package sec06;

public class StudentExam {

	public static void main(String[] args) {
		Student hong = new Student();
		Student kim = new Student();
		Student lee = new Student();
		
		hong.name = "홍길동";
		hong.mobile = "010-1234-1234";
		
		kim.name = "김철수";
		kim.mobile = "010-4321-4321";
		
		lee.name = "이승만";
		lee.mobile = "010-2222-4454";
	
		hong.absent();
		hong.absent();
		
		kim.comeLate();
		
		lee.leaveEarly();
		
		System.out.println(hong.name+"은 결석을 " +hong.absentSum+"번 했습니다.");
		System.out.println(kim.name+"은 지각을 " + kim.comeLateSum + "번 했습니다.");
		System.out.println(lee.name+"은 결석을 " + lee.absentSum + "번 했고, 조퇴를 " + lee.leaveEarlySum + "번 했습니다.");
	}

}
