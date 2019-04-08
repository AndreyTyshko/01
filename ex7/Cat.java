package ex7;

import java.util.Random;

public class Cat {
    public int MAX_SATIETY;
    Random random = new Random();
    private String name;

    private int satiety;


    public Cat(String name) {
        this.name = name;

        MAX_SATIETY = random.nextInt(20);

    }


    public void eat(Plate plate) {

        if (plate.foodVolume <= MAX_SATIETY)
            System.out.println("Кот " + name + " --->>> НЕ НАЕЛСЯ<<<---");
        else
            plate.foodVolume -= MAX_SATIETY;
        System.out.println("Кот " + name + "  НАЕЛСЯ :) ");
        // plate.foodVolume -= MAX_SATIETY;
    }

    public int fillCat() {
        int foodNeed = MAX_SATIETY - satiety;
        satiety = MAX_SATIETY;
        return foodNeed;
    }


    public Random getRandom() {
        System.out.println("Кот хотел съесть " + MAX_SATIETY);
        return random;
    }

    public void catInfo() {
        System.out.println("Cat: " + name);
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +

                ", Сытость= " + satiety +
                '}';
    }


}
