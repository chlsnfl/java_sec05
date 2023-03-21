package sec05.ch06;

public class ArrayExam07 {
	//주민번호 길이 같은지
	public static void main(String[] args) {
//		String ch = "01010124356";
//		String sn = "99134-274244";
//		
//		if(ch.length()==sn.length()) {		
//			System.out.println("길이가 같아용");
//		}else {
//			System.out.println("길이가 달라용");
//		}
		
		String ssn = "010101-4445454";
		String mssn = ssn.replace("-", "");
		int length = mssn.length();
		if(length==13) {
			System.out.println("번호가 같아용");
			}else {
				System.out.println("번호가 달라용");
			}
		
		
		//indexOf 찾는 문자열이 없으면 -1 리턴 있으면 index 번호를 리턴
		//srt.contains("문자") --> true, false 를 리턴함
		
		String str = "떠들지 마라 쫌";
		int index = str.indexOf("쫌");
		if(index == -1) {
			System.out.println("찾는 문자가 없어용");
			
		}else {
			System.out.println("찾았어용 : " + index);
		}
				
		}
	}


