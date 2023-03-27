package sec06.ch11;

public class PersonExam {

	public static void main(String[] args) {
		
		Person p1 = new Person("200101-123415", "이순신");
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		p1.name= "홍길동";
//		p1.ssn = "121205-123456";
		
		System.out.println(p1.name);
		System.out.println(p1.ssn);
	}

}
