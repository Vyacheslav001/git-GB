package ru.geekbrains.java1.dz.dz3.leonov.vyacheslav;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {

        int tablo = 15;
        String random_word;
        String random_X = "X";
        String guess_X = "X";

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        for (int i = 0; i < words.length; i++) {
        }
        int rand = new Random().nextInt(words.length);
        random_word = words[rand];

        int random_rest = tablo - random_word.length();
        for (int i = 1; i < random_rest; i++) {
            random_X = random_X + "X";
        }
        String random_tablo = random_word + random_X;

        while (true) {
            System.out.println("Угадайте слово, запишите его строчными буквами:");
            Scanner scan = new Scanner(System.in);
            String guess_word = scan.nextLine();

            int guess_rest = tablo - guess_word.length();
            for (int i = 1; i < guess_rest; i++) {
                guess_X = guess_X + "X";
            }
            String guess_tablo = guess_word + guess_X;
            if (random_tablo.equals(guess_tablo)) {
                System.out.println("Поздравляю! Вы угадали!");
                break;
            } else {
                for (int i = 0; i < random_tablo.length(); i++) {
                    if (random_tablo.charAt(i) == guess_tablo.charAt(i)) {
                        System.out.print(random_tablo.charAt(i));
                    } else {
                        System.out.print("X");
                    }
                }
                System.out.println("");
                System.out.println("Не угадали. Попробуйте снова.");
                guess_X = "X";
            }
        }
    }
}