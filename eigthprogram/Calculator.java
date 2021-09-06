/*Write a Java program to perform Calculator operations.

1.addition
2.Subtraction
3.multiplication
4.Division
5.square
6.square root
7.factorial
8.power/ exponent of a number
*/

package eigthprogram;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        CalMenu calmenu = new CalMenu();
        while (true)

        {

            System.out.println(
                    " \n Enter a option :\n 1.addition \n 2.Subtraction \n 3.multiplication \n 4.Division \n 5.square  \n 6.square root  \n 7.factorial  \n 8.power/exponent of a number ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
            case 1:
                System.out.println("Enter two numbers for addition");
                double a = scanner.nextDouble();
                scanner.nextLine();
                double b = scanner.nextDouble();
                System.out.println(calmenu.Addition(a, b));
                break;
            case 2:
                System.out.println("Enter two numbers for substraction");
                double c = scanner.nextDouble();
                scanner.nextLine();
                double d = scanner.nextDouble();
                System.out.println(calmenu.Subtraction(c, d));
                break;
            case 3:
                System.out.println("Enter two numbers for multiplication");
                double e = scanner.nextDouble();
                scanner.nextLine();
                double f = scanner.nextDouble();
                System.out.println(calmenu.Multiplication(e, f));

                break;

            case 4:
                System.out.println("Enter two numbers for division");
                double g = scanner.nextDouble();
                scanner.nextLine();
                double h = scanner.nextDouble();
                System.out.println(calmenu.Division(g, h));

                break;
            case 5:
                System.out.println("Enter a numbers ");
                double i = scanner.nextDouble();
                System.out.println(calmenu.Sqaure(i));

                break;
            case 6:
                System.out.println("Enter a numbers ");
                double j = scanner.nextDouble();
                System.out.println(calmenu.SqaureRoot(j));

                break;
            case 7:
                System.out.println("Enter a numbers ");
                int k = scanner.nextInt();
                System.out.println(calmenu.Factorial(k));

                break;
            case 8:
                System.out.println("Enter two numbers ");
                double l = scanner.nextInt();
                double m = scanner.nextInt();
                System.out.println(calmenu.Power(l, m));

                break;
            default:
                System.out.println("Invalid Entry");
                break;
            }
        }

    }
}

class CalMenu {

    public double Addition(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public double Subtraction(double a, double b) {
        double difference = a - b;
        return difference;
    }

    public double Multiplication(double a, double b) {
        double product = a * b;
        return product;
    }

    public double Division(double a, double b) {
        double quoteint = a / b;
        return quoteint;
    }

    public double Sqaure(double a) {
        double result = a * a;
        return result;
    }

    public double SqaureRoot(double a) {
        double sqroot = Math.sqrt(a);
        return sqroot;
    }

    public int Factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = n * Factorial(n - 1);
        return fact;
    }

    public double Power(double a, double b) {
        double pwer = Math.pow(a, b);
        return pwer;

    }

}
