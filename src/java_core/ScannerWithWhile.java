package java_core;
import java.util.Scanner;
public class ScannerWithWhile {
public static void main(String args[]) {
	Scanner ScannerObj = new Scanner(System.in);
	char orderPlace = 'Y';
	while (orderPlace=='Y' || orderPlace == 'y') {
	System.out.println("Do you want to place next order? Y/N : ");
	String input = ScannerObj.next();
	orderPlace = input.charAt(0);
	if (orderPlace=='Y' || orderPlace == 'y') {
	System.out.println("Order Placed successfully");
	}
	}
	System.out.println("Thanks for shopping at genieus.in :) have a good day !!");
	
}
}
