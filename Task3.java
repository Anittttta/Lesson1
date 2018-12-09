package Lesson1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 20 чисел");
        for (int x=0; x<numbers.length; x++) {
            numbers[x] = sc.nextInt();
        }

        System.out.println("Please find even numbers");
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x]%2==0) {
                System.out.println(numbers[x]);
            }
        }

        System.out.println("Please find odd numbers below");
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x]%2!=0) {
                System.out.println(numbers[x]);
            }
        }

    }

}
