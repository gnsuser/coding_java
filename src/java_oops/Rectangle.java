package java_oops;
// find RectangleCalci class in same folder 
public class Rectangle {
    private float length;
    private float breadth;
    private float area;
    private float perimeter;
    public float getArea(){
        return this.area;
    }
    public float getPerimeter(){
        return this.perimeter;
    }
    public void setArea(float area){
        this.area = area;
    }
    Rectangle(float length, float breadth){
        this.length=length;
        this.breadth=breadth;
    }
    Rectangle(){
        System.out.println("Parameterless constructor called");
    }

    public float area(){
        this.area = length*breadth;
        return area;
    }
    public float perimeter(){
        this.perimeter = 2*(length+breadth);
        return perimeter;
    }

}

