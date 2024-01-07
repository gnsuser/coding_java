package java_core;

public class IterationAssignment3 {
    public static void main(String args[]){
        int num = 123;
        int tempNum = num;
        int sumOfDigits = 0;
        while (tempNum>0){
            sumOfDigits = sumOfDigits + tempNum%10;
            tempNum /= 10;
        }
        if(num%sumOfDigits==0){
            System.out.println(num+" is divisible by sum of its digits");
        }else{System.out.println(num+" is not divisible by sum of its digits");}
    }
}
