/* Implement  a java class having overloaded methods to calculate the area of a square
rectangle and circle */
package sixthprogram;

class Overloading {
    public static void main(String[] args) {
        OverloadingMethod obj1 = new OverloadingMethod();
        OverloadingMethod obj2 = new OverloadingMethod();
        OverloadingMethod obj3 = new OverloadingMethod();
        System.out.println(obj1.overmethod(4));
        System.out.println(obj2.overmethod(3, 4));
        System.out.println(obj3.overmethod(3.0));

    }

}

class OverloadingMethod {
    public int overmethod(int side) {

        int square = side * side;
        return square;
    }

    public int overmethod(int lenght, int breadth) {

        int rectangle = lenght * breadth;
        return rectangle;
    }

    public double overmethod(double radius) {

        double circle = 3.14 * radius * radius;
        return circle;
    }
}