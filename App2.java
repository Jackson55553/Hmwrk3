package org.example;

import java.util.*;

class ArrObj {
    private int x;
    private int y;

    public ArrObj(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("x: " + this.x + ", y: " + this.y);
    }
}

public class App2 {


    public static void main(String[] args) {
        System.out.println("=============================4.1============================");
        Stack<ArrObj> a = new Stack<>();
        a.push(new ArrObj(5,2));
        a.push(new ArrObj(2,2));
        a.push(new ArrObj(1,1));
        a.push(new ArrObj(6,3));

        a.peek().print();
        long start = System.nanoTime();
        while (!a.empty()){
            a.pop().print();
        }
        System.out.println(System.nanoTime() - start);
        System.out.println("=============================4.2============================");
        Queue<ArrObj> b = new LinkedList<>();
        b.add(new ArrObj(1,1));
        b.add(new ArrObj(2,3));
        b.add(new ArrObj(4,1));
        b.add(new ArrObj(3,3));

        b.peek().print();
        long start1 = System.nanoTime();
        while (!b.isEmpty()){
            b.poll().print();
        }
        System.out.println(System.nanoTime() - start1);
        System.out.println("=============================4.3============================");
        Deque<ArrObj> c = new ArrayDeque<>();

        c.add(new ArrObj(3,3));
        c.add(new ArrObj(2,2));

        c.peek().print();

        c.addFirst(new ArrObj(7,7));
        c.addLast(new ArrObj(6,6));
        long start2 = System.nanoTime();
        while (!c.isEmpty()){
            c.poll().print();
        }
        System.out.println(System.nanoTime() - start2);
        System.out.println("=============================4.4============================");
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(1);
        p.add(7);
        p.add(2);
        p.add(5);
        long start3 = System.nanoTime();
        while (!p.isEmpty()){
        System.out.println(p.poll());
    }
        System.out.println(System.nanoTime() - start3);
    }
}
