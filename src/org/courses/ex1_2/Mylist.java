package org.courses.ex1_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Mylist {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(10);
        list.add(13);
        list.add(8);
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(6);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
          Integer temp = iterator.next();
            System.out.print(temp + " ");
        }
        System.out.println();
    }
}
