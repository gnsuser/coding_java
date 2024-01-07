package java_core;

public class IterationAssignment6 {
    void isLuckyNumber(int num){
        int i=1; 
        int total = 0;
        while(i<=Integer.toString(num).length()){
           int temp =  Integer.toString(num).charAt(i);
           total = total + temp*temp;
            i=i+2;
        }
        //System.out.println(total);
        if(total%9==0){
            System.out.println(num + " is a lucky number for you");
        }else{System.out.println(num + " NOT a lucky number for you");}
        
    }
public static void main(String args[]){
    IterationAssignment6 object = new IterationAssignment6();
    object.isLuckyNumber(2326);
}
}
