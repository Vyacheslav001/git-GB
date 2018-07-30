package ru.geekbrains.java1.dz.dz5.leonov.vyacheslav;

public class Person {

    private String fio;
    private String position;
    private String email;
    private String phone_number;
    private int salary;
    private int age;
    private int age_limit = 40;

    public Person(String fio, String position, String email, String phone_number, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        if (getAge() > age_limit) {
            System.out.println("Должность: " + position + "\n" + "ФИО:       " + fio + "\n" + "e-mail:    " + email + "\n" +
                    "Телефон:   " + phone_number + "\n" + "Зарплата:  " + salary + "\n" + "Возраст:   " + age);
            System.out.println();
        }
    }
}
