// int a_number=1; // (range: 1 to 5 including both)
// Print the value of a_number in word. For example, it should
// print “Four” if a_number
// contains 4.
// 2.No equality ‘= =’ operator.

package thirdprogram;

public class Noequality {
    public static void main(String[] args) {
        int number = 4;
        switch (number) {

        case 1:
            System.out.println("One");
            break;
        case 2:
            System.out.println("Two");
            break;
        case 3:
            System.out.println("Three");
            break;
        case 4:
            System.out.println("Four");
            break;
        case 5:
            System.out.println("Five");
            break;
        default:
            System.out.println("Invalid entry");
            break;
        }
    }
}
