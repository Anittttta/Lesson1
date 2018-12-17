package lesson2;

import java.util.HashSet;
import java.util.Set;

/*
Set из котов
*/

public class Solution3 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.toArray()[0]);
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<Cat>();
        for (int i = 0; i < 3; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat c : cats) {
            System.out.println(c);
        }
    }

    public static class Cat {

    }
}

