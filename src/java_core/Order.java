package java_core;

public class Order {
    int orderId;
    String orderedFood;
    double totalPrice;
    String status;
    double calculateTotalPrice(int unitPrice){
        totalPrice=unitPrice+unitPrice*0.05;
        System.out.println("Order Details\nOrder ID: "+orderId+"\n"+"Ordered food: "+orderedFood+"\n"+"Order Status: "+status+"Total Price: "+totalPrice);
        return totalPrice;
    }
}
class Tester1{
    public static void main(String args[]){
        Order order1 = new Order();
        order1.orderId= 1001;
        order1.orderedFood= "pineapple pizza";
        order1.status = "delivered";
        order1.calculateTotalPrice(65);
    }
}