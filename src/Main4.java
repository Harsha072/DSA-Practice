
abstract class Shape {
    protected double area;

    public Shape() {
        this.area = 0.0;
    }

    public abstract void calculateArea();

    public void displayArea() {
        System.out.println("Area of the shape: " + area);
    }
}

class Rectangle extends Shape{

    private int length;
    private int breadth;

    Rectangle(int l , int b){
        this.length=l;
        this.breadth = b;
    }

    @Override
    public void calculateArea() {
       area = length*breadth;
    }
}
class Circle extends Shape{

    private int radius;
    ;

    Circle(int r ){
        this.radius=r;

    }

    @Override
    public void calculateArea() {
        area = 3.14*radius*radius;
    }

}
class Triangle extends Shape{

    private int base;
    private int height;

    Triangle(int b , int h){
        this.base=b;
        this.height = h;
    }

    @Override
    public void calculateArea() {
        area = 0.5*base*height;
    }
}



public class Main4 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        Shape circle = new Circle(3);
        Shape triangle = new Triangle(6, 8);

        rectangle.calculateArea();
        circle.calculateArea();
        triangle.calculateArea();

        rectangle.displayArea();
        circle.displayArea();
        triangle.displayArea();
    }

}
