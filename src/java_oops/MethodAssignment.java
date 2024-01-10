package java_oops;

public class MethodAssignment {
    private int orderId;
    private String orderedFood;
    private double totalPrice;
    private String status;

    double calculateTotalPrice(double unitPrice, double qty){
            totalPrice= unitPrice*qty + (unitPrice*qty*0.05);
        return totalPrice;
    }
    public static void main(String args[]){
        MethodAssignment object = new MethodAssignment();
        object.calculateTotalPrice(21, 2);
        System.out.println(object.totalPrice);
    }
}
