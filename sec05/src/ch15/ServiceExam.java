package ch15;

import java.lang.reflect.Method;  //동적으로 실행할 떄 클래스의 정보를 조사 reflect

public class ServiceExam {

	public static void main(String[] args) {
		
		//서비스의 몇 개의 메소드가 있는지 조사한다.
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		Service service = new Service();
		
		for(Method method : declaredMethods) { //향사된 포문 - 옛날포문 for(int i = 0; i<declaredMethod.length; i++)
//			System.out.println(method.getName());  //메소드 이름 출력
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
//				System.out.println(method.getName());
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				System.out.println(method.getName()+": ");
				System.out.println("value : " + printAnnotation.value());
				System.out.println("num : " + printAnnotation.number());
				
				//메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				
				//구문선 출력
				for(int i =0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println("");
				
				//메소드 호출 -- 예외처리 해야 함
				try {
					method.invoke(new Service());
				}catch(Exception e) {}
				System.out.println();
			}
		}

	}

}
