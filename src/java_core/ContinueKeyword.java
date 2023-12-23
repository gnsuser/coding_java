package java_core;
import java.util.Scanner;
public class ContinueKeyword {
public static void main(String args[]){
System.out.println("Enter the amount to add in your wallet");
Scanner sc = new Scanner(System.in);
int walletBalance = sc.nextInt();
System.out.println("Amount added successfully. Wallet balance is: "+ walletBalance);
char continuePay = 'N';
char tryOtherAmount = 'N';
int amount = 0;

do{
System.out.println("Enter amount to pay: ");
amount = sc.nextInt();
System.out.println(amount+" INR paid successfully!");
if (walletBalance<amount){
    System.out.println("Not enough balance in wallet. Current wallet balance: "+ walletBalance + "\nWant to try with other Amount? Y/N :");
    tryOtherAmount = sc.next().charAt(0);
    if (tryOtherAmount == 'y' || tryOtherAmount == 'Y'){
        continue;
    }
    else{
    break;
}
    }

walletBalance -= amount;
System.out.println("You want to make next payment? Y/N:");
continuePay = sc.next().charAt(0);
} while(continuePay == 'y' || continuePay== 'Y');
System.out.println("Thank you for using genieusPay! visit again :)");
sc.close();
}   
}


