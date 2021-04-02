package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int left1) {
        return max(left, max(right, left1));
    }

    public static int max(int left, int right, int left1, int right1) {
        return max(left, max(right, left1, right1));
    }
}
