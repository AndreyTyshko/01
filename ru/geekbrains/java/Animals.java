package ru.geekbrains.java;

import java.util.Random;

public class Animals {
    protected String name;
    protected double jump;
    protected double swim;
    protected double run;

    public Animals(String name, double jump, double swim, double run) {
        this.name = name;
        this.jump = jump;
        this.swim = swim;
        this.run = run;
    }

    public int percentCorrection = 15;
//    private double NOMINAL_RUN_VALUE = 200;
////    private double NOMINAL_JUMP_VALUE = 2;
////    private int NOMINAL_SWIM_VALUE = 10;
//// String name;

    public Animals(String name) {
        this.name = name;
    }
//    public void jump() {
//        System.out.println(name + "Jump");
//    }

    public double randomValue(double value) {
        double correction = value * percentCorrection / 100; // вычисляем
        return (value - correction) + ((value + correction) - (value - correction)) * new Random().nextDouble();
    }

    protected void run(double NOMINAL_RUN_VALUE, double runValue) {
        if (runValue < NOMINAL_RUN_VALUE) {
            System.out.println(name + "Can't run " + NOMINAL_RUN_VALUE + " meters");
        } else {
            System.out.println(name + "Can run " + NOMINAL_RUN_VALUE + " meters");
        }
    }

    protected void jump (double NOMINAL_JUMP_VALUE, double jumpValue) {
        if (jumpValue < NOMINAL_JUMP_VALUE) {
            System.out.println(name + "Can't run " + NOMINAL_JUMP_VALUE + " meters");
        } else {
            System.out.println(name + "Can run " + NOMINAL_JUMP_VALUE + " meters");
        }
    }

        protected void swim (double NOMINAL_SWIM_VALUE, double swimVaue) {
            if (swimVaue < NOMINAL_SWIM_VALUE) {
                System.out.println(name + "Can't swim " + NOMINAL_SWIM_VALUE + " meters");
            } else {
                System.out.println(name + "Can swim " + NOMINAL_SWIM_VALUE + " meters");
            }
        }

}

