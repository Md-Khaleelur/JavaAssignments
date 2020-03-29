package com.company;

public class ClassFour {

    ClassFour(String string){
        System.out.println("Argument"+string);
    }


    public static void main(String[] args) {

        ClassFour arr[] = new ClassFour[5];

        //String values are printed
        for (int i=0;i<5;i++){
            arr[i] =new ClassFour(" Message");
            //System.out.println(arr[i]);
        }

    }
}

//OUTPUT:
//        Argument Message
//        Argument Message
//        Argument Message
//        Argument Message
//        Argument Message