package sec06.ch10;

public class SingleToneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTone obj = SingleTone.getInstance();
		SingleTone obj2 = SingleTone.getInstance();
	
		if(obj == obj2) {
			System.out.println("같은 singletone 객체 입니다");
		}else {
			System.out.println("다른 singletone 객체 입니다.");
		}
	}

}
