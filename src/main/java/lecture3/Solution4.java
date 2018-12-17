package lecture3;

import java.util.Date;
import java.util.TreeSet;
import java.util.HashSet;


public class Solution4 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        HashSet<Integer> set1 = new HashSet<Integer>();

        // Добавление 10000 элементов в TreeSet
        Date currentDate = new Date();
        for (int i = 0; i < 10000; i++) {
            set.add(i);
        }
        Date currentDate1 = new Date();
        long msTimeDistance = currentDate1.getTime() - currentDate.getTime();
        System.out.println("Время добавления 10000 элементов в TreeSet: " + msTimeDistance);

        // Добавление 10000 элементов в HashSet
        Date currentDate2 = new Date();
        for (int i = 0; i < 10000; i++) {
            set1.add(i);
        }
        Date currentDate3 = new Date();
        long msTimeDistance1 = currentDate3.getTime() - currentDate2.getTime();
        System.out.println("Время добавления 10000 элементов в HashSet: " + msTimeDistance1);

        // Поиск 10000 в TreeSet
        Date currentDate4 = new Date();
        for (Integer s: set) {
            set.contains(s);
            Date currentDate5 = new Date();
            long msTimeDistance2 = currentDate5.getTime() - currentDate4.getTime();
            System.out.println("Время поиска 10000 элементов в TreeSet: " + msTimeDistance2);


            //Поиск 10000 в HashSet
            Date currentDate6 = new Date();
            for (Integer l: set1) {
                set1.contains(l);
            }
            Date currentDate7 = new Date();
            long msDistance3 = currentDate7.getTime() - currentDate6.getTime();
            System.out.println("Время поиска 10000 в HashSet: " + msDistance3);


            //Удаление 10000 элементов в TreeSet
            Date currentDate8 = new Date();
            for (int i = 9999; i>= 0; i--) {
                set.remove(i);
            }
            Date currentDate9 = new Date();
            long msDistance4 = currentDate9.getTime() - currentDate8.getTime();
            System.out.println("Время удаления 10000 элементов в HashSet: " + msDistance4);

            //Удаление 10000 элементов в HashSet
            Date currentDate10 = new Date();
            for (int i = 9999; i >=0; i--) {
                set1.remove(i);
            }
            Date currentDate11 = new Date();
            long msDistance5 = currentDate11.getTime() - currentDate10.getTime();
            System.out.println("Время удаления 10000 в HashSet: " + msDistance5);
        }

    }

}

