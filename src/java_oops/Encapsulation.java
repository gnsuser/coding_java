package java_oops;

public class Encapsulation {
private    String paymentMode;
private    int amount;
private    String receiverContact;
private    int secretKey;

public void setPaymentMode(String paymentMode){
    this.paymentMode=paymentMode;
}
public String getPaymentMode(){
    return paymentMode;
}

}
class Test {
    public static void main(String args[]){
        Encapsulation object1 = new Encapsulation();
        object1.setPaymentMode("upi");
        System.out.println(object1.getPaymentMode());
        
    }
}

