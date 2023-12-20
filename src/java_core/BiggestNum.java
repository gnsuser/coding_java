package java_core;

public class BiggestNum {
public static void main(String args[]) {
	short num1 = 30;
	short num2 = 4;
	short num3 = 5;
	
	if (num1>num2 && num1>num3) {
		System.out.println(num1);
	}
	else if (num2>num3 && num2>num1) {
		System.out.println(num2);
	}
	else {
		System.out.println(num3);
	}
}
}
