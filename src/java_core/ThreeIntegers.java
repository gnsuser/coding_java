/*Problem Statement
Implement a program to calculate the product of three positive integer values.
 However, if one of the integers is 7, consider only the values to the right of 7 for calculation.
  If 7 is the last integer, then display -1.
Note: Only one of the three values can be 7. */
package java_core;
import java.util.Scanner;
public class ThreeIntegers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the first positive integer: ");
        int num1 = sc.nextInt();
        while (num1<0){
           System.out.println("Integer value is negative Kindly enter positive integer: ");
           num1 = sc.nextInt(); 
        }
        System.out.println("Kindly enter the second positive integer: ");
                int num2 = sc.nextInt();
        while (num2<0){
           System.out.println("Integer value is negative Kindly enter positive integer: ");
           num2 = sc.nextInt(); 
        }
        System.out.println("Kindly enter the third positive integer: ");
                int num3 = sc.nextInt();
        while (num3<0){
           System.out.println("Integer value is negative Kindly enter positive integer: ");
           num3 = sc.nextInt(); 
        }
        if (num1 ==7 || num2==7 || num3==7){
            //logic
            if (num1 ==7){
                System.out.println("Output: "+(num2*num3));
            }
            else if(num2 ==7){
                System.out.println("Output: "+num3);
            }
            else{
                System.out.println("Output: "+ "-1");
            }
            }
        else {
            System.out.println("Output: "+(num1*num2*num3));
        }
    }
}