package ex7;


public class Main {

    public static void main(String[] args) {
int sum = 0;
        Plate plate = new Plate(100);
        Cat cats[] = new Cat[6];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Pixel " + (i + 1));
            cats[i].eat(plate);
           // cats[i].catInfo();
            cats[i].fillCat();
            cats[i].getRandom();
            System.out.println();
            sum += cats[i].MAX_SATIETY;
          if (plate.foodVolume <= sum){
              plate.addFood();
              System.out.println();
          }
        }
        System.out.println();
        plate.plateInfo();
        System.out.println(plate);
        System.out.println();

    }
}

