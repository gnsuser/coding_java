package java_core;

public class LoopAssignment7 {
    void displayDate(int day, int month, int year){
        ++day;

            if(month == 1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                if(day>31){
                    month++;
                    day =1;
                }
            }
            else if(day>30){
                month++;
                day=1;
            }
            if(month>12){
                ++year;
                month=1;
            }
        System.out.println(day+"-"+month+"-"+year);
        }

    public static void main(String args []){
        LoopAssignment7 object = new LoopAssignment7();
        object.displayDate(31, 12, 1999);
    }
}

