package ru.geekbrains.java;

public class Cat extends Animals {

    private final double NOMINAL_RUN_VALUE = 200;
    private final double NOMINAL_JUMP_VALUE = 2;
    private final int NOMINAL_SWIM_VALUE = 0;
    private double runValue;
    private double jumpValue;
    private double swimValue;

    public Cat(String name ) {
        super(name);

//        this.name = name;
        runValue = randomValue(NOMINAL_RUN_VALUE);
        jumpValue = randomValue(NOMINAL_JUMP_VALUE);
        swimValue = randomValue(NOMINAL_SWIM_VALUE);
    }

    public double getRunValue() {
        return runValue;
    }

    public double getJumpValue() {
        return jumpValue;
    }

    public double getSwimValue() {
        return swimValue;
    }

    public double getNOMINAL_RUN_VALUE() {
        return NOMINAL_RUN_VALUE;
    }

    public double getNOMINAL_JUMP_VALUE() {
        return NOMINAL_JUMP_VALUE;
    }

    public double getNOMINAL_SWIM_VALUE() {
        return NOMINAL_SWIM_VALUE;
    }


    public void catInfo() {
//    System.out.println("Сat can run:" + this.name + (int)jumpValue);
        System.out.println(
                "Cat name: " + this.name + "\n" +
                        "Can run: " + (int) runValue + "\n" +
                        "Can Jump: " + (int) jumpValue + "\n" +
                        "Can Swim: " + (float) swimValue + "\n");

    }

    @Override
    protected void run(double NOMINAL_RUN_VALUE, double runValue) {
        super.run(NOMINAL_RUN_VALUE, runValue);
    }
}
