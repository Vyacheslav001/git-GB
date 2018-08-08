package ru.geekbrains.java1.dz.dz6.leonov.vyacheslav;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Cat", 200, 0, 2.0);
        cat.run(200);
        cat.swim(0);
        cat.jump(2.5);
        System.out.println();

        Dog dog1 = new Dog ("Dog1", 400, 10, 0.5);
        dog1.run(500);
        dog1.swim(10);
        dog1.jump(0.4);
        System.out.println();

        Dog dog2 = new Dog ("Dog2", 600, 30, 3);
        dog2.run(550);
        dog2.swim(25);
        dog2.jump(2.9);
        System.out.println();
    }
}