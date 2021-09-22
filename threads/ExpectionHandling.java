
package threads;

import java.util.Scanner;

public class ExpectionHandling {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       try{
           System.out.println("Enter 1 number :");
       int a = scanner.nextInt();
       scanner.nextLine();
       System.out.println("Enter 2 number :");
       int b = scanner.nextInt();
        float c = (int)a/(int)b;
       System.out.println("result : " + c);
       
       }catch(ArithmeticException e){
          System.out.println("Dividing by 0 not possible");
   }
   try{
   int[] a = new int[10];
   a[11]=9;
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBounds");
    }
      
   try{
   int a = Integer.parseInt("sss");
   System.out.println(a);
    }catch(NumberFormatException e){
        System.out.println("NumberFormatException");
    }
    }
       
   } 
}
