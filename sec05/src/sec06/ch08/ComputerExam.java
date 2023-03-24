package sec06.ch08;

public class ComputerExam {

	public static void main(String[] args) {
		Computer computer = new Computer();
		
//		int rs = computer.sum1(new int[] {1,2,3});
//		
//		System.out.println(rs);
//		
		
		int[] valueA = {1,2,3};
		int rs1 = computer.sum1(valueA);
		System.out.println("rs1 : " + rs1);

		int rs2 = computer.sum1(new int[] {1,2,3,4,5});
		System.out.println("rs2 : " + rs2);
		
		int rs3 = computer.sum2(1,4,6,11);
		System.out.println("rs3 : " + rs3);
		
	}

}
