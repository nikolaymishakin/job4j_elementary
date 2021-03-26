package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int i = 0; i < array.length - index - 1; i++) {
                if (array[i] == null) {
                    String notnull = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = notnull;
                }
            }

            System.out.print(array[index] + " ");
        }
        return array;
    }
}
