package sec06;

public class Student {
	//필드
	String name;  //이름
	String mobile;   //휴대폰번호
	int absentSum;   //결석누계
	int comeLateSum;   //지각누계
	int leaveEarlySum;   //조퇴누계
	
	
	//결석하다  (메소드)
	void absent() {
		absentSum += 1;
	}
	//지각하다 (메소드)
	void comeLate() {
		comeLateSum += 1;
	}
	//조퇴하다 (메소드)
	void leaveEarly() {
		leaveEarlySum += 1;
	}
	
}
