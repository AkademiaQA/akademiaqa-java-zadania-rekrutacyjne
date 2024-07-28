package pl.akademiaqa.zadania.zadanie13.solutions;

import java.util.Arrays;

public class ArrayUtilsSolution2 {

    // Sortowanie tablicy i znalezienie drugiego największego elementu
    public static int findSecondLargest(int[] array) {

        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Tablica nie może być null i musi zawierać co najmniej dwa elementy");
        }

        // Tworzenie kopii tablicy, aby nie modyfikować oryginalnej
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        // Szukanie drugiego największego elementu
        for (int i = sortedArray.length - 2; i >= 0; i--) {
            if (sortedArray[i] != sortedArray[sortedArray.length - 1]) {
                return sortedArray[i];
            }
        }

        throw new IllegalArgumentException("Tablica musi zawierać co najmniej dwa unikalne elementy");
    }
}
