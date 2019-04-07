package ex7;

import static java.lang.Math.abs;

public class Plate {
    protected int foodVolume;
    protected final int MIN_FOOD_VOLUME=0;

    public Plate(int foodVolume) {
        this.foodVolume = abs (foodVolume);

    }

    public int getFoodVolume() {
        return foodVolume;
    }

    public void setFoodVolume(int foodVolume) {
        this.foodVolume = foodVolume;
    }

    public boolean decreaseFood(int n){
        foodVolume -=n;
//        if (foodVolume <= MIN_FOOD_VOLUME){
//            System.out.println("Plate is empty");
//        }
        return false;
    }

    public void plateInfo(){

        if (foodVolume <= abs(MIN_FOOD_VOLUME)){
            System.out.println("тарелка пустая");
        }else { System.out.println("Еды в тарелке осталось " + foodVolume);
        }

    }

    @Override
    public String toString() {
        return "Plate{" +
                "foodVolume=" + foodVolume +
                ", MIN_FOOD_VOLUME=" + MIN_FOOD_VOLUME +
                '}';
    }
}
