package sec06.ch09;

public class Television {
	//정적필드만들기
	
	static String company = "LG";
	static String model = "OLED";
	static String info;
	static {
		info = company + " - " + model;
	}
}
