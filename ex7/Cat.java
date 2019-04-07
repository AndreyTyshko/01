package ex7;

import java.util.Random;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;
    public int MAX_SATIETY;
    Random random = new Random();


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
        MAX_SATIETY = random.nextInt(25);
    }

//    public void eat(Plate p) {
//        p.decreaseFood(appetite);
//    }

    public void eat(Plate plate) {
        plate.foodVolume -= MAX_SATIETY;
     if (plate.foodVolume <= MAX_SATIETY)
    System.out.println("Кот "+ name + " --->>> НЕ НАЕЛСЯ<<<---");
   }

    public int fillCat() {
        int foodNeed = MAX_SATIETY - satiety;
        satiety = MAX_SATIETY;
        return foodNeed;
    }

    public int getSatiety() {
        if (satiety == MAX_SATIETY) {
            System.out.println("Кот " + name + " наелся " + "сытость " + satiety);
        }if (satiety < MAX_SATIETY){
            System.out.println("Кот " + name + "НЕ наелся " + "сытость " + satiety);
        }

        return satiety;
    }

    public Random getRandom() {
        System.out.println("Кот хотел съесть " + MAX_SATIETY);
        return random;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void catInfo() {
        System.out.println("Cat: " + name + ", Appetite: " + appetite);
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", Сытость= " + satiety +
                '}';
    }

    public int getMAX_SATIETY() {
        return MAX_SATIETY;
    }

    public void setMAX_SATIETY(int MAX_SATIETY) {
        this.MAX_SATIETY = MAX_SATIETY;
    }


}
