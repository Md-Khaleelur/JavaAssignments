package com.company;

import com.company.ClassFour;

public class ClassThree {

    ClassThree(String string){
        System.out.println("Argument"+string);
    }

    public static void main(String[] args) {

        ClassFour arr[] = new ClassFour[5];

        //null values are printed
        for (int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

    }

}

//OUTPUT:
//        null
//        null
//        null
//        null
//        null