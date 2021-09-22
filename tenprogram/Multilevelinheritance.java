/*Write a program to illustrate multilevel hierarchy, where Box is the super class and  the subclass
BoxWeight is used as a superclass to create the subclass called Shipment. Shipment inherits
all of the traits of BoxWeight and Box, and adds a field called cost, which holds the cost of
shipping such a parcel.*/

package tenprogram;

class Box {

    double height;
    double width;
    double depth;

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double volume() {
        return height * width * depth;
    }
}

class Boxweight extends Box {
    double weight;

    public Boxweight(double height, double width, double depth, double weight) {
        super(height, width, depth);
        this.weight = weight;
    }

    public double weightmethod() {
        return volume() / weight;
    }
}

class Shipment extends Boxweight {
    double cost;

    public Shipment(double height, double width, double depth, double weight, double cost) {
        super(height, width, depth, weight);
        this.cost = cost;
    }

    public double costMethod() {
        return weightmethod() * 0.5;

    }
}

public class Multilevelinheritance {

    public static void main(String[] args) {
        Box box = new Box(3, 3, 3);
        System.out.println(box.volume());
        Boxweight boxweight = new Boxweight(4, 4, 4, 4);
        System.out.println(boxweight.volume());
        System.out.println(boxweight.weightmethod());
        Shipment shipment = new Shipment(2, 2, 2, 2, 3);
        System.out.println(shipment.volume());
        System.out.println(shipment.weightmethod());
        System.out.println(shipment.costMethod());

    }

}
