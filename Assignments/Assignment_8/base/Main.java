package base;

import javax.swing.plaf.basic.BasicBorders;

public class Main {

    public static void main(String args[]) {
            int maxNumber = 10;
            System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
            for(int i = 0; i < maxNumber; i++){
                System.out.print(LinearRecursion.FibRecursion(i) +" ");


            }
            System.out.println();
            for(int i = 0; i < maxNumber; i++) {
                System.out.print(Head.fib(i) + " ");
        }
            System.out.println();
            for(int i = 0; i < maxNumber; i++) {
                System.out.print(Tail.fib(i) + " ");
        }
    }
}
