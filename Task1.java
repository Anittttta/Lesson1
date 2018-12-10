package lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите Ваше имя");
        String name = sc.nextLine();

        System.out.println("Введите Ваш возраст");
        int age = sc.nextInt();

        System.out.println("Я " + name + " и мне " + age + " лет!");

    }
}
