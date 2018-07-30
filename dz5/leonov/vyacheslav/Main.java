package ru.geekbrains.java1.dz.dz5.leonov.vyacheslav;

public class Main {

    private static int size = 5;

    static Person[] persArray = new Person[size];

    public static void main(String[] args) {

        persArray[0] = new Person("Семенов Сергей", "Директор", "semser@mail.com", "8922135654", 500000, 35);
        persArray[1] = new Person("Михайлов Николай", "Бухгалтер", "mihnek@mail.com", "8926767637", 90000, 38);
        persArray[2] = new Person("Макаров Максим", "Менеджер", "makmax@mail.com", "89276556654", 60000, 25);
        persArray[3] = new Person("Говорунов Никита", "Охранник", "govnik@mail.com", "89886655555", 35000, 56);
        persArray[4] = new Person("Романова Екатерина", "Уборщица", "romnik@mail.com", "89227545444", 30000, 41);

        for (int i = 0; i < persArray.length; i++) {
            persArray[i].printInfo();
        }
    }
}
