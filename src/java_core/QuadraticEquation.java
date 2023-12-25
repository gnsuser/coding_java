package java_core;
import java.util.Scanner;
import java.lang.Math;
public class QuadraticEquation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quadratic equation = ax^2+bx+c=0. Kindly enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Quadratic equation = ax^2+bx+c=0. Kindly enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("Quadratic equation = ax^2+bx+c=0. Kindly enter the value of c : ");
        int c = sc.nextInt();
        double discriminant = ((b*b) - (4*a*c));
        double root1 = (-b + Math.sqrt(discriminant))/(2*a);
        double root2 = (-b - Math.sqrt(discriminant))/(2*a);
        if (discriminant==0){
            System.out.println("The value of root (x) is : "+root1);
        }
        else if(discriminant>0){
            System.out.println("The roots are unequal real roots. The values of roots are: "+root1 +" and "+root2);
        }
        else{
           System.out.println("this equation has no real roots"); 
        }

    }
    }

