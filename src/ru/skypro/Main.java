package ru.skypro;

import java.util.Arrays;

public class Main {
    public static void task1 (int year) {
        if ((year % 4 == 0) && ((year % 100 !=0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task2 (int OS, int clientDeviceYear) {
        if (OS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (OS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            }
        }
    }
    public static void task3 (int deliveryDistance) {
        if (deliveryDistance <=20 ) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
    public static void task4 (String text) {
        char [] letters = text.toCharArray();
        boolean isDuplicateExist = false;
        for (int i = 1; i < letters.length; i++) {
            if (letters [i] == letters [i - 1]) {
                System.out.println("Найден дубль по символу "  + letters [i]);
                isDuplicateExist = true;
                break;
            }
        }
        if (!isDuplicateExist) {
            System.out.println("Дублей не найдено");
        }
}
    public static void task5 (int [] arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex < rightIndex) {
            int temp = arr [leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr [rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }
    public static void main (String[] args) {
        // write your code here
        //Задание №1
        int year = 2022;
        task1(year);
        System.out.println();

        //Задание №2
        int OS = 0;
        int clientDeviceYear = 2016;
        task2(OS,clientDeviceYear);
        System.out.println();

        //Задание №3
        int deliveryDistance = 95;
        task3(deliveryDistance);
        System.out.println();

        //Задание №4
        String text = "aabccddefgghiijjkk";
        task4(text);
        System.out.println();

        //Задание №5
        int [] arr = {3, 2, 1, 6, 5};
        task5(arr);
        System.out.println (Arrays.toString(arr));
    }
}

