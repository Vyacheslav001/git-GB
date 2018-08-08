package ru.geekbrains.java1.dz.dz6.leonov.vyacheslav;

public abstract class Animals extends Object {

    private String typeOfAnimal;
    private int max_dist_run;
    private int max_dist_swim;
    private double max_high_jump;

    public Animals(String typeOfAnimal, int max_dist_run, int max_dist_swim, double max_high_jump) {
        this.typeOfAnimal = typeOfAnimal;
        this.max_dist_run = max_dist_run;
        this.max_dist_swim = max_dist_swim;
        this.max_high_jump = max_high_jump;
    }

    public void run(int distance_run) {
        System.out.println(typeOfAnimal + ".run(" + distance_run + ");->результат: " + checkRunDistance(distance_run));
    }

    public boolean checkRunDistance(int distance_run) {
        if (distance_run > 0 & distance_run <= max_dist_run) {
            return true;
        } else {
            return false;
        }
    }

    public void swim(int distance_swim) {
        System.out.println(typeOfAnimal + ".swim(" + distance_swim + ");->результат: " + checkSwimDistance(distance_swim));
    }

    public boolean checkSwimDistance(int distance_swim) {
        if (distance_swim > 0 & distance_swim <= max_dist_swim) {
            return true;
        } else {
            return false;
        }
    }

    public void jump(double high_jump) {
        System.out.println(typeOfAnimal + ".jump(" + high_jump + ");->результат: " + checkJumpHigh(high_jump));
    }

    public boolean checkJumpHigh(double high_jump) {
        if (high_jump > 0 & high_jump <= max_high_jump) {
            return true;
        } else {
            return false;
        }
    }
}
