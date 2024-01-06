package java_core;

public class LoopAssignment6 {
    void requiredNotes(int one$bills, int five$bills, int purchaseAmount ){
        int five$needed = purchaseAmount/5;
        int one$needed = purchaseAmount%5;
        if (five$bills>=five$needed){
            System.out.println("five dollar notes needed are: "+five$needed);
            if(one$bills>=one$needed){
           System.out.println("One dollar notes needed are: "+one$needed);  
            }else{System.out.println("Not sufficient one dollar bills"+ (one$bills-one$needed) + " short");}

        }
        else if(one$bills >= purchaseAmount-(five$bills*5)){
                one$needed = purchaseAmount-(five$bills*5);
                System.out.println("Five dollar notes needed are: "+ five$bills);
                System.out.println("One dollar notes needed are: "+ one$needed);
        }else{System.out.println("Not sufficient five dollar and one dollar bills");}

    }
    public static void main(String args[]){
        LoopAssignment6 object44 = new LoopAssignment6();
        object44.requiredNotes(100, 2, 50);
    }
}
