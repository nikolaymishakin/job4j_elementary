package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2){
        int z1 = x2 - x1;
        int z2 = y2 - y1;
        double pow1 = Math.pow(z1,2);
        double pow2 = Math.pow(z2,2);
        double sum = pow1 + pow2;
        double sqrt = Math.sqrt(sum);
        return sqrt;
    }

    public static void main(String[] args) {
        double number1 = Point.distance(3,4,5,6);
        double number2 = Point.distance(15,8,13,2);
        System.out.println(number1);
        System.out.println(number2);
    }
}
