package Lesson1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers");
        for (int x=0;x<numbers.length;x++) {
            numbers[x] = sc.nextInt();
        }

        System.out.println("Now find below typed numbers in reversed order");
        for (int x=9; x>=0; x--) {
            System.out.println(numbers[x]);
        }


    }
}
