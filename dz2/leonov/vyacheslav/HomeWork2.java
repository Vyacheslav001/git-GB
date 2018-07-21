package ru.geekbrains.java1.dz.dz2.leonov.vyacheslav;

import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {

        int[] arr = {10, 11, 21};

        invertArray();
        fillArray();
        fillArray2();
        changeArray();
        fillDiagonal();
        arrayLeftRight(arr);
    }

    //Task 1.
    public static void invertArray() {
        int[] arr = {1, 1, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Task 2.
    //var.1
    public static void fillArray() {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    //var.2
    public static void fillArray2() {
        int counter = 0;
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = counter;
            counter += 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Task 3.
    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }
        }
        System.out.println(Arrays.toString(w));
    }

    //Task 4.
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i + j == 3) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Task 6.
    public static void arrayLeftRight(int[] arr) {
        boolean check = false;
        int a = arr.length / 2;
        int b = arr.length - a;
        int c = a + 1;

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        if (a == b) {
            for (int i = 0; i < a; i++) {
                sum1 = sum1 + arr[i];
            }
            for (int i = a; i < arr.length; i++) {
                sum2 = sum2 + arr[i];
            }
            if (sum1 == sum2) {
                check = true;
            }
        } else if (a != b){
            for (int i = 0; i < a; i++) {
                sum1 = sum1 + arr[i];
            }
            for (int i = a; i < arr.length; i++) {
                sum2 = sum2 + arr[i];
            }
            for (int i = 0; i < c; i++) {
                sum3 = sum3 + arr[i];
            }
            for (int i = c; i < arr.length; i++) {
                sum4 = sum4 + arr[i];
            }
            if (sum1 == sum2 || sum3 == sum4) {
                check = true;
            }
        }
        System.out.println(check);
    }
}
