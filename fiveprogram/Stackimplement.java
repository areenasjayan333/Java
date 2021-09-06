package fiveprogram;

import java.util.Scanner;

public class Stackimplement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack objstack = new Stack();
        int choice = 1;
        while (choice != 0) {
            System.out.println("Enter ur choice 0.exit \n 1.push \n 2.pop \n 3.peek \n 4.display ");
            choice = scanner.nextInt();
            switch (choice) {

            case 0:
                choice = 0;
                break;

            case 1:

                System.out.println("Enter the element to push in the stack ");
                int element = scanner.nextInt();
                objstack.push(element);

                break;
            case 2:

                objstack.pop();

                break;
            case 3:

                objstack.peek();

                break;

            case 4:

                objstack.display();

                break;
            default:
                System.out.println("Invalid entry");
                break;
            }

        }
    }

}

class Stack {
    int stack1[];
    int top;

    public Stack() {
        // System.out.println("Enter the lenght of stack");
        // int n = scanner.nextInt;
        stack1 = new int[10];
        top = -1;
    }

    public int push(int x) {
        if (top >= 10) {
            System.out.println("Stack is full,stack overflow");
        } else {
            stack1[++top] = x;
            System.out.println("Inserted item" + x);
        }
        return 0;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty,stack underflow");
        } else {

            System.out.println(" item Deleted");
            top--;
        }

    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty,stack underflow");
        } else {
            System.out.println("Top element " + stack1[top]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty,stack underflow");
        } else {
            for (int i = top; i > -1; i--) {
                System.out.println("Stack elements are " + stack1[i]);
            }
        }
    }

}
