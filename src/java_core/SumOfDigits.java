package java_core;

public class SumOfDigits {
public static void main (String args[]) {
	int digit = 7878;
	int temp = 0;
	while(digit>0) {
		temp = temp + digit % 10;
		digit = digit/10;
	}
	System.out.println("sum of digits = "+ temp);

}
}
