package sec05.ch07;

public class ArrayTest {
	
	public static void main(String[] args) {

		String[] strArr = {"길동","순이", "석열"};
		String[] strAddArr = new String[5];
		
		//배열항목복사
		
//		for(int i=0;i<strArr.length; i++) {
//			strArr[i] = strArr[i];
//		}
		
		System.arraycopy(strArr, 0, strAddArr, 0, strArr.length);

		for(int i=0;i<strAddArr.length;i++) {
			System.out.println(strAddArr[i]+",");
		}
	}

}
