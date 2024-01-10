package java_oops;

public class MethodDemo {
    private static String methodOne(){
        return "Hello bella";
    }
    public static void main(String args[]){
        MethodDemo object = new MethodDemo();
        System.out.println(MethodDemo.methodOne());
        String wish = MethodDemo.methodOne();
        System.out.println(wish);
    }
}
