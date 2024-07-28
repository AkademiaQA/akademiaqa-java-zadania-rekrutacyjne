package pl.akademiaqa.zadania.zadanie10.solutions;

import java.util.Arrays;

public class ArrayUtilsSolution2 {

    // Stream API
    public static int[] findMinAndMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null ani pusta");
        }

        int min = Arrays.stream(array).min().orElseThrow();
        int max = Arrays.stream(array).max().orElseThrow();

        return new int[]{min, max};
    }
}
