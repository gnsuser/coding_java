package java_core;
import java.util.Scanner;
public class ForLoop {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Kindly enter number of routers to add");
	int noOfRouters = sc.nextInt();
	for (int i=1; i<=noOfRouters; i++ ) {
		System.out.println("Dragged router number "+i+" successfully!");
	}
}
}
