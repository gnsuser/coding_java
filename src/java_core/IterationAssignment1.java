package java_core;

public class IterationAssignment1 {
    public static void main(String args[]){
        String num = "11333311";
        boolean a = true;
        for(int i=0; i<num.length(); i++){
            int j=num.length()-1-i;
            if(num.charAt(i)==num.charAt(j)){
                
            }else{a = false;break;}
        }
        if(a==true){
            System.out.println(num+" is palindrome");
        }else{System.out.println(num+" is not palindrome");}    
    }
}
