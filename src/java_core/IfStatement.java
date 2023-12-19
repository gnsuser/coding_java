package java_core;

public class IfStatement {
public static void main (String args[]) {
	int numOfItem = 8;
	float unitPrice= 10f;
	double totalCost = numOfItem * unitPrice;
	int deliveryCharges = 40;
	String customerType = "Regular";
	if (customerType == "Prime") {
		System.out.println("5% discount applied along with free delivery as prime member benefit");
		totalCost = totalCost * (1- 0.05);
		System.out.println("Total Price:" +  totalCost);
	}
	else if (customerType =="Regular") {
		totalCost = totalCost + deliveryCharges;
		System.out.println("40rs delivery charges applied\nTotal Price: "+ totalCost);
	
	}
	else {
		System.out.println("Kindly login as Regular/Prime customer to avail service");
	}
	
}
}
