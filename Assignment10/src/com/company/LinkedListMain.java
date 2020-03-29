package com.company;

public class LinkedListMain {

    public static void main(String args[]) {

        SList<Integer> sl=new SList<Integer>();
        SListIterator<Integer> si =sl.iterator();

        si.add(1);
        si.remove(1);
        si.add(2);
        si.remove(1);

        si.add(1);
        si.add(2);
        si.add(3);
        si.add(12);
        si.add(14);
        si.add(23);
        si.add(36);

        System.out.println("Linked list is  :"+sl);
    }
}

//OUTPUT:
//        Linked list is  :1 2 3 12 14 23 36