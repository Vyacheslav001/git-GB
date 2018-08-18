package ru.geekbrains.java1.dz.dz7.leonov.vyacheslav;

import java.util.Scanner;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        } else {
            while (food < n) {
                fullUpPlate();
            }
            food -= n;
        }
    }

    public void fullUpPlate() {
        System.out.println("Добавьте еды в тарелку.");
        Scanner scan = new Scanner(System.in);
        int addFood = scan.nextInt();
        food += addFood;
    }

    public void info() {
        if (food == 0) {
            System.out.println("В тарелке пусто.");
        } else {
            System.out.println("В тарелкe " + food + " еды.");
        }
    }
}