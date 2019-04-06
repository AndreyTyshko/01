package ru.geekbrains.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


//        Cat cat = new Cat(" Pixel ");
////        cat.jump();
////       cat.catInfo();
//        cat.run(cat.getNOMINAL_RUN_VALUE(), cat.getRunValue());
//        {
//            System.out.println(cat.getRunValue());
//        }
//
       /* System.out.println();
        Dog dog = new Dog(" Uran ");
//        dog.dogInfo();
        dog.swim(dog.getNOMINAL_SWIM_VALUE(), dog.getSwimValue());
        {
            System.out.println(dog.getSwimValue());
        }*/


        Cat cats[] = new Cat[3];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Cat" + (i + 1));
            cats[i].catInfo();


        }

        Dog dogs[] = new Dog[3];

        for (int i = 0; i < cats.length; i++) {
            dogs[i] = new Dog("Dog" + (i + 1));
            dogs[i].dogInfo();


        }


    }
}
