package com.company;

public class ClassOverload {

    ClassOverload() {
        this(3);
        System.out.println("Constructor first");
    }

    ClassOverload(int var) {
        System.out.println("Second Constructor");
    }

    public static void main(String[] args) {
        ClassOverload classOverload = new ClassOverload();
    }

}

//OUTPUT:
//        Second Constructor
//        Constructor first
