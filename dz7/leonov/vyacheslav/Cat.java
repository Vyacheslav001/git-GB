package ru.geekbrains.java1.dz.dz7.leonov.vyacheslav;

public class Cat {

    private String name;
    private int appetite;
    private boolean full = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
        full = true;
    }

    public void catInfo() {
        System.out.println(name + " съел " + appetite + " еды и наелся. (" + full + ")");
    }
}
