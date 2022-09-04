package recursion18;

import java.util.Scanner;

public class FibonacciTest {

    static int a = 0, b = 1, c;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number to get fibonacci serise: ");
        int input = s.nextInt();
        FibonacciTest ft = new FibonacciTest();
        System.out.print(a + " " + b + " ");
        ft.fiboM(input);
    }

    public void fiboM(int i) {

        if (i >= 3) {

            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            fiboM(i - 1);
        }

    }
}
