package test0330;

public class MemberService {
	
	String id;
	String password;
	

	
	boolean login(String id, String password) {
		if(id == "hong") {
			if(password == "1234") {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * String id = "hong";
	 * String password = "12345*;
	 * 
	 * public boolean(String id, String password){
	 * 	if(this.id==id && this.password == password){
	 * 		return true
	 * }else{
	 * return false;
	 * }
	 * }*/
	
	
	void logout(String id) {
		this.id=id;
		System.out.println("로그아웃 되었습니다.");
				
	}
				
	
	
	
}
