package java_core;

// Find LCM of two numbers
public class IterativeAssignment7 {
    void findLCM(int num1, int num2) {
        int smaller;
        int larger;
        int i = 1;

        if (num1 < num2) {
            smaller = num1;
            larger = num2;
        } else {
            smaller = num2;
            larger = num1;
        }

        int lcm = 0;

        // Continue until a multiple is found that is evenly divisible by both numbers
        while (true) {
            lcm = larger * i;

            if (lcm % smaller == 0) {
                break;
            }

            i++;
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }

    public static void main(String args[]) {
        IterativeAssignment7 object = new IterativeAssignment7();
        object.findLCM(9, 7);
    }
}
