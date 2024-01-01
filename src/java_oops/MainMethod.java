package java_oops;
//failed code. could run some error. committing as of now
public class MainMethod {
    public static void main(String[] args){
        if (args.length > 0) {
            System.out.println("hello " + args[0]);
        } else {
            System.out.println("Please provide a command-line argument.");
        }
    }
}
