package sec06.ch10;

public class SingleTone {
	private static SingleTone singletone = new SingleTone();   //private 를 사용하여 다른이가 사용 불가하게 만듬
	private SingleTone(){}
	
	static SingleTone getInstance() {
		return singletone;
	}
}
