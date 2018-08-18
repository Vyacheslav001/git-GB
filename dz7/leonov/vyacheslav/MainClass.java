package ru.geekbrains.java1.dz.dz7.leonov.vyacheslav;

public class MainClass {

    private static int number = 5;

    static Cat[] cat = new Cat[number];

    public static void main(String[] args) {

        cat[0] = new Cat("Барсик", 10);
        cat[1] = new Cat("Васька", 20);
        cat[2] = new Cat("Рыжик", 15);
        cat[3] = new Cat("Петька", 10);
        cat[4] = new Cat("Кузя", 15);

        Plate plate = new Plate((int) (Math.random() * 70));
        plate.info();

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            cat[i].catInfo();
            plate.info();
        }
    }
}
