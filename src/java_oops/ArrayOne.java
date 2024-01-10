package java_oops;

public class ArrayOne {
    public static void main(String args[]){
        String[] contactNumber = {"9999", "8888", "7777", "6666"};
        contactNumber[3] = "5555";
        System.out.println(contactNumber[3]);
        String[] Address = new String[8];
        Address[7]="something";
        System.out.println(Address.length);
        for(int i=0; i<contactNumber.length; i++ ){
            System.out.println(contactNumber[i]);
        }
        //or for array there is one more for-each loop
        for(String contact: contactNumber){
            System.out.println(contact);
        }
        //below is an example of a 2D array 
        int TwoDimArray[][] = {{22,29},{21,21}, {50,50}, {55,55}};
        System.out.println(TwoDimArray[0][0]);
        
    }
}
