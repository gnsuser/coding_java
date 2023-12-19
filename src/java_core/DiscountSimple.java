package java_core;

public class DiscountSimple {
public static void main(String args[]) {
	double finalPrice;
	double totalPrice = 100;
	int discount = 10;
	if (totalPrice > 500) {
		finalPrice = totalPrice * (1- ((double)discount/100));
		System.out.println("Congrats!! you got 10% discount");
		System.out.println(finalPrice);
	}
	else {
		finalPrice = totalPrice * (1- ((double)5/100));
	}
	System.out.println("Total price: " + finalPrice  );
}
}
