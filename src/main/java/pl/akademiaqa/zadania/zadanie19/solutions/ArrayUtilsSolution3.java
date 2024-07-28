package pl.akademiaqa.zadania.zadanie19.solutions;

import java.util.Arrays;

public class ArrayUtilsSolution3 {

    // Użycie sortowania i zliczania
    public static int findMostFrequentElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null lub pusta");
        }

        Arrays.sort(array);

        int mostFrequentElement = array[0];
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mostFrequentElement = array[i - 1];
                }
                currentCount = 1;
            }
        }

        if (currentCount > maxCount) {
            mostFrequentElement = array[array.length - 1];
        }

        return mostFrequentElement;
    }
}
