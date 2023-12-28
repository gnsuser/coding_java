package java_core;

public class MethodParameter {
    String customerName;

    void updateName(MethodParameter object2 ){
    object2.customerName = "yuvraaj";
}
class TheClass {
    public static void main(String args[]){
        MethodParameter object1 = new MethodParameter();
        object1.customerName = "Gaurav";
        System.out.println("name before calling parameterized method: "+object1.customerName);
        object1.updateName(object1);
        System.out.println("name after calling parameterized method: "+object1.customerName);
    }
}
}
