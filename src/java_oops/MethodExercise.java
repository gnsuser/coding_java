package java_oops;

import java.lang.reflect.Method;

public class MethodExercise {
    private double averageCalculator(int a, int b, int c){
        double average = (double)(a+b+c)/3;
        double newint = (Math.round(average*100.0)/100.0);
        System.out.println(newint);
        return newint;
    }
    public static void main(String args[]){
        MethodExercise object1 = new MethodExercise();
        object1.averageCalculator(12, 8, 15);

        double j = 5.54744444;
        System.out.println(Math.round(j*100.0)/100.0);
    }
}
