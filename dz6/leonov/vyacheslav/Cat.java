package ru.geekbrains.java1.dz.dz6.leonov.vyacheslav;

public class Cat extends Animals {

    public Cat(String typeOfAnimal, int max_dist_run, int max_dist_swim, double max_high_jump) {
        super(typeOfAnimal, max_dist_run, max_dist_swim, max_high_jump);
    }

    @Override
    public void swim(int distance_swim) {
        System.out.println("Кот не умеет плавать!");
    }
}
