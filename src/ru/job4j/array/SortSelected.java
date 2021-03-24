package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length - 1);
            int index = FindLoop.indexOf(data, min, 0, data.length);
            for (int j = i; j > 0 && data[j - 1] > data[j]; j--) {
                int tmp = data[j - 1];
                data[j - 1] = data[j];
                data[j] = tmp;
            }
        }
        return data;
    }
}
