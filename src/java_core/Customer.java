package java_core;

public class Customer {
    String customerName;
    String contactNumber;
    String address;
    Customer(String customerName, String contactNumber, String address){
        this.customerName=customerName;
        this.contactNumber=contactNumber;
        this.address=address;
    }
    void displayCustomerDetails(){
        System.out.println(customerName);
        System.out.println(contactNumber);
        System.out.println(address);
    }
}
class Tester{
    public static void main(String args[]){
        Customer piyush = new Customer("piyush", "7733", "eARTH");
        piyush.displayCustomerDetails();
        
    }
}
