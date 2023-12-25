package java_core;
import java.util.Scanner;
public class DoubleSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Kindly enter the second number: ");
        int num2 = sc.nextInt();
        if (num1 == num2){
          System.out.println("Both Numbers are same hence num1+num2 = "+ (num1+num2));  
        }
        else {
            System.out.println("Both numbers are different hence 2*(num1+num2) = "+ (2*(num1+num2)));
        }

    }
}
