package pl.akademiaqa.zadania.zadanie8.solutions;

import java.util.Arrays;

public class ArraySumSolution3 {

    // Stream API
    public static int sumArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        return Arrays.stream(array).sum();
    }
}
