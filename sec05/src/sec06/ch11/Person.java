package sec06.ch11;

public class Person {
	
	//필드
	final String nation = "Korea";
	final String ssn;  //final 은 한번 초기화 되면 수정할 수 없다
	String name;
	
	//생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
