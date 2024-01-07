package java_core;
import java.util.Scanner;

public class IterationAssignment {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Kinldy enter the value of X");
    int x = sc.nextInt();
         int temp = x;
    System.out.println("Kinldy enter the value of Y");
    int y = sc.nextInt();
    int root =1;
    while (x>0){
  
        root = root *(x%10);
        x/=10;

    }
    System.out.println(temp*root);
    if(temp*root==y){
        System.out.println(temp+" is root of "+y);
    }else{System.out.println(temp+" is NOT root of "+y);}

    }

}
