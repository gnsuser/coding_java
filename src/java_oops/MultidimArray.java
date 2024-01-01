package java_oops;

public class MultidimArray {
    public static void main(String args[]) {
        int[][] tempDate = new int[][] {{21, 11}, {22, 12}, {20, 13}, {19, 14}, {18, 15}, {17, 16}, {15, 17}};
        
        for (int i = 0; i < 7; i++) {

                    System.out.println("Minimum temperature on " + tempDate[i][1] + " January is "+ tempDate[i][0]+ "°C");
            }
        }
    }
