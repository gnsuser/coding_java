package java_core;

public class IfStatement {
public static void main (String args[]) {
	int numOfItem = 8;
	float unitPrice= 10f;
	double totalCost = numOfItem * unitPrice;
	String customerType = "Prime";
	if (customerType == "Prime") {
		System.out.println("5% discount applied as prime member benefit");
		totalCost = totalCost * (1- 0.05);
		System.out.println("Total Price:" +  totalCost);
	}
}
}
