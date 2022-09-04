package corejava;

import java.util.Arrays;
import java.util.Scanner;

public class BubleSort {

    public static void main(String[] args) {

        bubleS();
    }

    public static void bubleS() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length : ");
        int inp = sc.nextInt();
        int[] marks = new int[inp];
        for (int i = 0; i < inp; i++) {
            System.out.print("Enter value of " +( i + 1+" : "));
            marks[i] = sc.nextInt();
        }
        System.out.println("Starting point: " + Arrays.toString(marks));
        System.out.println("****************************");
        int temp;
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    temp = marks[j + 1];
                    marks[j + 1] = marks[j];
                    marks[j] = temp;

                }
                System.out.println(Arrays.toString(marks));
            }
            System.out.println("****************************");
        }
        System.out.println("Final result: " + Arrays.toString(marks));
    }
}
