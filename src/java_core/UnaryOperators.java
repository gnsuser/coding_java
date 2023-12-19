package java_core;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOne = 10;
		int numTwo = 7;
		boolean whatIf = true; 
		System.out.println(numOne++ +" "+ ++numOne +"\n" + numTwo-- +" "+ --numTwo);
		System.out.println(!whatIf);
		
		// bitwise complement 
		System.out.println(~numOne);

	}

}
