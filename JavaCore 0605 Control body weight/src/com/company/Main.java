package com.company;

import java.io.*;
import java.util.Scanner;

/*

0605 Контролируем массу тела

Программа должна считывать введенные пользователем
вес в килограммах и рост в метрах
и выводить на экран сообщение о индексе массы тела.
Реализуй статический метод класса Body.
Метод должен определить индекс массы тела, и вывести на экран сообщение:
«Недовес: меньше чем 18.5» — если индекс массы тела меньше 18.5,
«Нормальный: между 18.5 и 24.9» — если индекс массы тела между 18.5 и 24.9,
«Избыточный вес: между 25 и 29.9» — если индекс массы тела между 25 и 29.9,
«Ожирение: 30 или больше» — если индекс массы тела 30 или больше.

Подсказка:
Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)

Пример вывода для 68.4 и 1.77:
Нормальный: между 18.5 и 24.9

Требования:
1. Метод massIndex должен выводить текст на экран.
2. Метод massIndex должен выводить "Недовес: меньше чем 18.5" на экран, если индекс массы тела меньше 18.5.
3. Метод massIndex должен выводить "Нормальный: между 18.5 и 24.9" на экран, если индекс массы тела между 18.5 и 24.9.
4. Метод massIndex должен выводить "Избыточный вес: между 25 и 29.9" на экран, если индекс массы тела между 25 и 29.9.
5. Метод massIndex должен выводить "Ожирение: 30 или больше" на экран, если индекс массы тела 30 или больше.

*/

// public class Cat
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }
    public static class Body {
        public static void massIndex(double weight, double height) {
            double index = weight / (height*height);
            if (index < 18.5)
                System.out.println("Underweight: less than 18.5");
            else if (index<24.9)
                System.out.println("Normal: between 18.5 and 24.9");
            else if (index < 29.9)
                System.out.println("Overweight: between 25 and 29.9");
            else
                System.out.println("Obesity: 30 or more");
        }
    }
}









