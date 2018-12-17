package lesson2;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/*
Время для 10 тысяч вставок
*/

public class Solution1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        LinkedList list1 = new LinkedList();

        System.out.println("Время добавления 1000 элементов в ArrayList: " + getInsertTimeInMs(list));
        System.out.println("Время добавления 1000 элементов в LinkedList " + getInsertTimeInMs(list1));
        System.out.println("Время поиска 1000 элементов в ArrayList " + getSearchTimeInMs(list));
        System.out.println("Время поиска 1000 элементов в LinkedList " + getSearchTimeInMs(list1));
        System.out.println("Время удаления 1000 элементов в ArrayList " + getRemoveTimeInMs(list));
        System.out.println("Время удаления 1000 элементов в LinkedList " + getRemoveTimeInMs(list1));
    }

    public static long getInsertTimeInMs(List list) {
        Date currentDate1 = new Date();
        insert10000(list);
        Date currentDate2 = new Date();
        long msTimeDistance = currentDate2.getTime() - currentDate1.getTime();
        return msTimeDistance;

    }

    public static long getSearchTimeInMs(List list) {
        Date currentDate1 = new Date();
        search10000(list);
        Date currentDate2 = new Date();
        long msTimeDistance = currentDate2.getTime() - currentDate1.getTime();
        return msTimeDistance;
    }

    public static long getRemoveTimeInMs(List list) {
        Date currentDate1 = new Date();
        remove10000(list);
        Date currentDate2 = new Date();
        long msTimeDistance = currentDate2.getTime() - currentDate1.getTime();
        return msTimeDistance;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }

    public static void search10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    public static void remove10000(List list) {
        for (int i = 9999; i >= 0; i--) {
            list.remove(i);
        }
    }
}

