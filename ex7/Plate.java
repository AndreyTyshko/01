package ex7;


public class Plate {
    protected final int MIN_FOOD_VOLUME = 0;
    protected int foodVolume;

    int addF;
    private int maxFoodVolume;


    public Plate(int foodVolume) {
        this.foodVolume = foodVolume;
        this.maxFoodVolume = foodVolume;
    }


    public void plateInfo() {

        if (foodVolume <= MIN_FOOD_VOLUME) {
            System.out.println("тарелка пустая");
        } else {
            System.out.println("Еды в тарелке осталось " + foodVolume);
        }

    }

    public void addFood() {
        addF = maxFoodVolume - foodVolume;
        foodVolume = foodVolume + addF;
        System.out.println(foodVolume + " Еда добавлена в тарелку");
    }


    @Override
    public String toString() {
        return "Plate{" +
                "foodVolume=" + foodVolume +
                ", MIN_FOOD_VOLUME=" + MIN_FOOD_VOLUME +
                '}';
    }
}
