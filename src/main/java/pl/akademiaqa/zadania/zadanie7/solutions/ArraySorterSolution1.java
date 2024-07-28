package pl.akademiaqa.zadania.zadanie7.solutions;

import java.util.Arrays;

public class ArraySorterSolution1 {

    // Rozwiązanie z Arrays.sort()
    public static void sortArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        Arrays.sort(array);
    }
}
