package pl.akademiaqa.zadania.zadanie7.solutions;

import java.util.Arrays;

public class ArraySorterSolution3 {

    // Rozwiązanie z Arrays.parallelSort()
    public static void sortArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        Arrays.parallelSort(array);
    }
}
