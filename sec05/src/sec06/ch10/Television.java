package sec06.ch10;

public class Television {
	static String company = "samsung";
	static String model = "QLED";
	static String info;
	static int oneSumten;
	
	static {
		info = company + "-" + model;
		int sum = 0;
		for(int i = 0; i<=10; i++) {
			sum += i;
		}
		oneSumten = sum;
	}
}
