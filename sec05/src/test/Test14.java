package test;

public class Test14 {

	public static void main(String[] args) {
		String a = "The quick brown fox";
		StringBuffer c = new StringBuffer(a);
		String b = c.reverse().toString();
		
		System.out.println(b);
	
	}

}
