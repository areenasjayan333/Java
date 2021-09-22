/* consider base class Figure from which two subclasses are derived - Rectangle, Triangle.
Each of these subclass overrides area() so that it returns area of rectangle and triangle.
Apply method overriding.

*/
package twelveprogram;

class Figure {
    double length;

    public Figure(double length) {
        this.length = length;
    }

    public double area() {
        System.out.println("hello");
        return 3;
    }
}

class Rectangle extends Figure {

    double breadth;

    public Rectangle(double length, double breadth) {
        super(length);
        this.breadth = breadth;
    }

    @Override
    public double area() {
        super.area();
        return length * breadth;

    }
}

class Triangle extends Figure {

    double height;

    public Triangle(double length, double height) {
        super(length);
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * length * height;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Figure figure = new Figure(2);
        System.out.println(figure.area());
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.area());
        Triangle triangle = new Triangle(2, 8);
        System.out.println(triangle.area());

    }
}
