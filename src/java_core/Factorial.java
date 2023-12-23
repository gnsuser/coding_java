package java_core;
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int factorial =1;
        System.out.println("Welcome to calci factorial ! \nKindly enter the number: ");
        int num = sc.nextInt();
        for (int i=1; i<=num;i++){
         factorial *= i;
        }
        System.out.println("Factorial of "+num+" is: "+factorial);
       
    }

    
}
