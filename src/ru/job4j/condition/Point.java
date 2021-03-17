package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
         return Math.sqrt(Math.pow(y2 - y1,2) + Math.pow(x2 - x1,2));
    }

    public static void main(String[] args) {
        double number1 = Point.distance(3,4,5,6);
        double number2 = Point.distance(15,8,13,2);
        System.out.println(number1);
        System.out.println(number2);
    }
}
