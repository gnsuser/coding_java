package java_core;
import java.util.Scanner;
public class DoWhile {
public static void main (String args []) {
	char wantNewOrder = 'N';
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println("Order is placed\nDo you want to place new order?");
		String input = sc.next();
		wantNewOrder = input.charAt(0);
		
	}while (wantNewOrder=='Y' || wantNewOrder=='y');
	System.out.println("Order session closed. Thank you for shopping with us");
}
}
