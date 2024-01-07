package java_core;

public class LoopAssignment8 {
    void zipZapZoom(int num){
        if (num%3==0){
            if(num%5==0){
                System.out.println("Zoom");
            }else{System.out.println("Zip");}
        }
        else if(num%5==0){System.out.println("Zap");}
        else{System.out.println("Invalid");}
    }
    public static void main(String args[]){
        LoopAssignment8 object88 = new LoopAssignment8();
        object88.zipZapZoom(77);
    }
}
