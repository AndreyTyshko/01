package ex7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();


        //Cat cat = new Cat("Pixel", 5, 0);
        Plate plate = new Plate(100);


        int hungry;
        hungry = random.nextInt(100);

        Cat cats[] = new Cat[10];

        for (int i = 0; i < cats.length; i++) {
            // cats[i] =


            cats[i] = new Cat("Pixel " + (i + 1), 1);

            cats[i].eat(plate);


            cats[i].catInfo();
            cats[i].fillCat();
            cats[i].getSatiety();
            cats[i].getRandom();

            System.out.println();
            if(plate.decreaseFood(0)) break;

        }


     /*   cat.eat(plate);
        cat.eat(plate);
        cat.eat(plate);*/

        System.out.println();

        //System.out.println(cats);
        //cat.catInfo();
        plate.plateInfo();
        System.out.println(plate);


//        cat.eat(plate);
//        for (int i = 0; i <hungry; i++) {
//            cat.eat(plate);
//
//            if (plate.foodVolume ==0) {
//                System.out.println("кот поел "+i);
//                System.out.println("кот был голоден на " +hungry);
//            }
////    break;
//       }


    }


}

