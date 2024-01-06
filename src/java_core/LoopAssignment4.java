package java_core;

public class LoopAssignment4 {
    void costCalculator (char typeOfFood, int distance, int qty){
        int totalCost =0;
        int costOfFood;
        if ((typeOfFood=='V'|| typeOfFood=='v' || typeOfFood=='N' || typeOfFood=='n') && distance>0 && qty>=1){
            if (typeOfFood=='v' || typeOfFood == 'V'){
            costOfFood = 12;
            }
            else{costOfFood=15;
            }
            if(distance<=3){
               totalCost = costOfFood*qty;
            }
            else if(distance <=6){
                totalCost = (costOfFood*qty) + (distance-3);
            }
            else if(distance >6){
               totalCost = (costOfFood*qty)+ 3 + ((distance-6)*2);
            }
            
        }

        else{
            totalCost = -1;
        }
                    System.out.println(totalCost);
          

    }
            public static void main(String args[]){
        LoopAssignment4 object1 = new LoopAssignment4();
        object1.costCalculator('v', 7, 1);
    }

}


