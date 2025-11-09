// ✅ 3️⃣ Shape Area Calculator (Classic Polymorphism Problem)

// Concepts: Method overriding, polymorphism array
// Description:
// Create abstract class Shape with method calculateArea()
// Child classes: Circle, Rectangle, Triangle
// Store shapes in an array, loop, and print area
// Interview Focus: real-life polymorphism use cases.


abstract class Shape{
    abstract double calculateArea();
}
class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius=radius;
    }
    @Override
    double calculateArea(){
        return Math.PI*radius*radius;
    }

}
class Rectangle extends Shape{

   double length,width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea(){
        return length*width;
    }
}
class Triangle extends Shape{
    double base,height;

     Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea(){
        return base*height;
    }
}

public class ShapeAreaCalculator{
    public static void main(String[] args) {
        Shape [] shapes=new Shape[3];

        shapes[0]=new Circle(3);
        shapes[1]=new Rectangle(10,5);
        shapes[2]=new Triangle(3,6);

        for(Shape s:shapes){
            System.out.println("Shapes:"+s.calculateArea());
        }
    }
}