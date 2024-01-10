package java_oops;

public class RectangleCalci {
    public static void main(String args[]){
        Rectangle rectangle1 = new Rectangle(10.5f, 5.5f);
        rectangle1.area();
        rectangle1.perimeter();
        rectangle1.setArea(1000.01f);
        System.out.println(rectangle1.getArea() + " " + rectangle1.getPerimeter());
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2.area());

    }
}
