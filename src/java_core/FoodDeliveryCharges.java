package java_core;
import java.util.Scanner;
public class FoodDeliveryCharges {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Kindly enter the type of meal you want to order. \nType 'V' for veg meal\nType 'N' for no-veg meal");
    char foodType = sc.nextLine().charAt(0);
    int foodCost = 0;
    if (foodType == 'v' || foodType == 'V'){
        foodCost = 12;
    }
    else { foodCost = 15;}
    System.out.println("Kindly enter number of meals you want to order: ");
    int qty = sc.nextInt();
    System.out.println("Kindly enter the distance to your place in KM :");
    int distance = sc.nextInt();
    int deliveryCharge;
    if (distance<=3){
        deliveryCharge = 0;
    }
    else if(distance<=6 && distance >3){
        deliveryCharge = 1;
    }
    else {deliveryCharge = 2;}
    if((foodType == 'V' || foodType == 'v' || foodType == 'n' || foodType == 'N' ) && (distance>0) && (qty>=1)){
            System.out.println("Final bill amount without delivery = "+ ((foodCost*qty)));
            System.out.println("Final bill amount to be paid = "+ ((foodCost*qty)+((distance-3)*deliveryCharge)));
    }
    else{
    System.out.println(-1);
    }

} 
}
