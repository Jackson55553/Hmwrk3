package org.example;


import java.util.*;

public class App
{
    public static void main(String[] args) {
        System.out.println("==========================3.1,3.2==============================");
        List a = new LinkedList();
        List b = new ArrayList(10);
        create(a);
        System.out.println("связанный список: " + a.toString());
        realization(a);

        System.out.println("========================================================");

        create(b);
        System.out.println("ArrayList: " + b.toString());
        realization(b);

        System.out.println("==========================3.3, 3.4==============================");
        //не понял задания. нужно было переопределить методы для LinkedList? Или просто в ручную набрать класс List?
        System.out.println("==========================3.5==============================");

        Iterator iterator = a.listIterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(iterator.next());

    }

    public static void create(List<Integer> y){
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            y.add(rnd.nextInt(10));
        }
    }

    public static void realization(List<Integer> y){
        long start = System.nanoTime();
        System.out.println(y.get(1));
        System.out.println("(find) " + (System.nanoTime() - start));
        long start1 = System.nanoTime();
        y.remove(1);
        System.out.println("(delete) " + (System.nanoTime() - start1));
        System.out.println(y.toString());
        long start2 = System.nanoTime();
        y.add(0,7);
        System.out.println("(add) " + (System.nanoTime() - start2));
        System.out.println(y.toString());

    }
}
