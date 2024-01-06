package java_core;

public class LoopAssignment5 {
    void loanAmountCalci(int accNo, int salary, int accBalance, String loanType, int expectedAmount, int expectedEmis){
        if (accNo<=1999 && accNo>=1000){
            if(accBalance>=1000){
                if (loanType.equalsIgnoreCase("Car")){
                    if(salary >25000){
                        if(expectedAmount<=500000){
                            if(expectedEmis<=36){
                                System.out.println("Congrats! you are eligible for 500000 Rs loan amount\n Eligible emi's = 36");
                            }else{System.out.println("Maximum 36 emi's are allowed for Car loans");}

                        }else{System.out.println("Expected loan amount exceeds the maximum limit of 500000 for car loans");}
                    }else{System.out.println("We are sorry :( Car Loans are eligible for employees with salary more than 25000");}

                }
                else if (loanType.equalsIgnoreCase("house")){
                    if(salary >50000){
                        if(expectedAmount<=6000000){
                            if(expectedEmis<=60){
                                System.out.println("Congrats! you are eligible for 6000000 Rs loan amount\n Eligible emi's = 60");
                            }else{System.out.println("Maximum 60 emi's are allowed for House loans");}

                        }else{System.out.println("Expected loan amount exceeds the maximum limit of 6000000 for House loans");}
                    }else{System.out.println("We are sorry :( House Loans are eligible for employees with salary more than 500000");}


                }
                else if(loanType.equalsIgnoreCase("business")){
                    if(salary >75000){
                        if(expectedAmount<=7500000){
                            if(expectedEmis<=84){
                                System.out.println("Congrats! you are eligible for 7500000 Rs loan amount\n Eligible emi's = 84");
                            }else{System.out.println("Maximum 84 emi's are allowed for business loans");}

                        }else{System.out.println("Expected loan amount exceeds the maximum limit of 7500000 for business loans");}
                    }else{System.out.println("We are sorry :( Business Loans are eligible for employees with salary more than 75000");}


                }
                else {System.out.println("Invalid loan type! Kindly type between - Car, House & Business loan");}

            }else{System.out.println("Not sufficient account balance");}

        }
        else{System.out.println("Wrong account number");}
    }
        public static void main(String args[]){
        LoopAssignment5 object1 = new LoopAssignment5();
        object1.loanAmountCalci(1001, 40000, 1000, "CAR", 300000, 100);
    }
    
}
