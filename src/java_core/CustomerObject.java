package java_core;

public class CustomerObject {
    String customerId;
    String customerName;
    String phoneNumber;
    String address;

    void displayDetails(){
        System.out.println("Your Customer ID is: "+customerId);
        System.out.println("Your name is: "+customerName);
        System.out.println("Your phone number is: "+phoneNumber);
        System.out.println("Your address is: "+address);
    }
    
}
class tester{
    public static void main(String args[]){
        CustomerObject customer1 = new CustomerObject();
        customer1.customerId = "C001";
        customer1.customerName = "gaurav";
        customer1.phoneNumber = "9970700040";
        customer1.address = "surya bakery, Mysore";

        customer1.displayDetails();
    }
}
