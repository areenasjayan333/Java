//Implement bubble sort Algorithm in java
package nineprogram;

import java.util.Scanner;

class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        System.out.println("Enter the elments of array");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter the " + (i + 1) + "element");
            myArray[i] = scanner.nextInt();
        }
        BubbleSorting bubble = new BubbleSorting();
        bubble.SortingMethod(myArray);
        System.out.println("Sorted Array :");
        for (int j = 0; j < myArray.length; j++) {
            System.out.println(myArray[j]);
        }
    }
}

class BubbleSorting {

    public int[] SortingMethod(int[] myArray) {
        int temp;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length - i - 1; j++) {
                if (myArray[j] < myArray[j + 1]) {
                    temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }

            }

        }

        return myArray;
    }
}
