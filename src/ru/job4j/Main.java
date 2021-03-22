package ru.job4j;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    static class WeeklySalary {
        public static int calculate(int[] hours) {
            int sum = 0, sum1 = 0, sum3 = 0, sum4 = 0;
            for (int i = 0; i <= hours.length; i++) {
                for (int j = 0; j <= i; j++) {
                    sum += j;
                        }
                    }
            return sum;

        }

        public static void main(String[] args) {
            int[] a = {10, 10, 10, 0, 8, 0, 0};
            System.out.println(calculate(a));
        }
    }
}
