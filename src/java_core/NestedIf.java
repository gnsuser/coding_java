package java_core;

public class NestedIf {
	public static void main (String args[]) {
		int numOfItem = 20;
		float unitPrice= 10f;
		double totalCost = numOfItem * unitPrice;
		int deliveryCharges = 40;
		String customerType = "Regular";
		if (customerType == "Prime") {
			System.out.println("5% discount applied along with free delivery as prime member benefit");
			totalCost = totalCost * (1- 0.05);
			System.out.println("Total Price:" +  totalCost);
			if (totalCost>100) {
				System.out.println("You got a complementary discount voucher for next order. Click to avail. ");
			}
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
