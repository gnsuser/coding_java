package java_oops;

//find Tester4 class in same repo

public class PrintString {
    private int soldierId;
    private String soldierName;
    private String[] soldierQualities;
    private char soldierStatus;
    public PrintString(int soldierId, String soldierName, String[] soldierQualities, char soldierStatus){
        System.out.println("parameterized constructor called");
        this.soldierId=soldierId;
        this.soldierName=soldierName;
        this.soldierQualities=soldierQualities;
        this.soldierStatus=soldierStatus;
    }
    int getSoldierId(){
        return this.soldierId;
    }
    void setSoldierId(int soldierId){
        this.soldierId=soldierId;
    }
        String getSoldierName(){
        return this.soldierName;
    }
    void setSoldierName(String soldierName){
        this.soldierName=soldierName;
    }
    String[] getSoldierQualities(){
        return this.soldierQualities;
    }
    void setSoldierQualities(String[] soldierQualities){
        this.soldierQualities=soldierQualities;
    }
        char getSoldierStatus(){
        return this.soldierStatus;
    }
    void setSoldierStatus(char soldierStatus){
        this.soldierStatus=soldierStatus;
    }
    void displaySoldierDetails(){
        System.out.println("id of the soldier is: "+this.soldierId); // question to chatgpt- why to use this.soldierId here and not just soldierId?
        System.out.println("soldier name is: "+ this.soldierName);
        System.out.print("soldier qualities are: ");
        for (int i=0; i<soldierQualities.length; i++){
          System.out.print(", "+ soldierQualities[i]); 
        }
        System.out.println("\nsoldier Status is: "+ this.soldierStatus);

    }

}

