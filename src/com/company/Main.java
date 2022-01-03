package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int x = 1;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }


        for (x = 10; x >= 1; x--) {
            System.out.println(x);
        }
        // Задание 2

        int i = 5;
        while (i <= 31) {
            System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет");
            i = i + 7;
        }

        // Задание 3
        int year = 2022;
        int year1 = year - 200;
        int year2 = year + 100;
        for (year = year1; year < year2; year++);
            if (year % 79 ==0) {
                System.out.println(year);
        }

    }
}