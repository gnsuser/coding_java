package java_core;

public class CustomerConstructor {  
    String customerID;
    String customerName;
    String contactNo;
    String address;
    CustomerConstructor(){
        System.out.println("this is a parameterless constructor");
    }
    CustomerConstructor(String cid, String cname, String phno, String add){
        System.out.println("Parameterized constructor called");
        customerID = cid;
        customerName = cname;
        contactNo = phno;
        address = add;
    }
    void displayDetails(){
        System.out.println("Your Customer ID is: "+customerID);
        System.out.println("Your name is: "+customerName);
        System.out.println("Your phone number is: "+contactNo);
        System.out.println("Your address is: "+address);
    }
}
class tester{
    public static void main(String args[]){
        CustomerConstructor customer1 = new CustomerConstructor();
      
        CustomerConstructor customer2 = new CustomerConstructor("C001", "Gaurav", "9270239980", "surya bakery, Mysore");
        customer1.displayDetails();
        customer2.displayDetails();
    }
}
