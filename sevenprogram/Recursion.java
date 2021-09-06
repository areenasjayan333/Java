//Find factorial of a number using recursion

package sevenprogram;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println(factorial.fact(number));
    }
}

class Factorial {
    public int fact(int n) {

        if (n == 0) {
            return 1;
        }
        int result = n * fact(n - 1);
        return result;

    }
}
