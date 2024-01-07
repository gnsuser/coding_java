package java_core;

public class IterationAssignment5 {
    public static void main(String args[]){
        int num = 1634;
        int dummy = num;
        int power = Integer.toString(num).length();
        double output =0;
        while(dummy>0){
            int temp = dummy%10;
             output += Math.pow(temp,power);
             System.out.println(output);
            dummy /= 10;
        }
        if(output==num){
            System.out.println(num + " is a Armstrong number");
        }else{System.out.println(num + " is not a Armstrong number");}
    }
}
