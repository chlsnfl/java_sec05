package sec05.ch07;

public class ArrayCopyExam02 {

	public static void main(String[] args) {
		String[] oldStr = {"java", "html", "css"};
		String[] newstr = new String[6];
		
		System.arraycopy(oldStr, 0, newstr, 0, oldStr.length);
		
		for(int i=0; i<newstr.length; i++) {
			System.out.print(newstr[i]+",");
		}
	}

}
