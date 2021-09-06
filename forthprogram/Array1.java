
/*
 * 1.Write a program same as the above, but don’t use numbers (like 0, 1, 2…etc)
 * to access the elements in the array. Declare an int variable ‘i’ and use it
 * as an index into the arrays.
 */
package forthprogram;

public class Array1 {

    public static void main(String[] args) {

        // String[]myStrings =new String[5];
        String[] names = { "Sumanh", "Rameesh", "Don", "Lee", "Manu" };
        int[] marks = { 40, 30, 50, 36, 35 };
        for (int i = 0; i < 5; i++) {
            if (marks[i] > 35) {
                System.out.println("Name :" + names[i] + "marks :" + marks[i]);
            }
        }

    }
}
