/*Write a program in java to generate an abstract class A also class B inherits the class A.
generate the object for class B and display the text “call me from B”.*/

package elevenprogram;

abstract class ClassA {
    String name;

    ClassA(String name) {
        this.name = name;
    }

    public abstract void helloMessage();
}

class ClassB extends ClassA {

    ClassB(String name) {
        super(name);
    }

    @Override
    public void helloMessage() {
        System.out.println("Call from B " + name);
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        ClassB classB = new ClassB("Areena");
        classB.helloMessage();

    }
}
