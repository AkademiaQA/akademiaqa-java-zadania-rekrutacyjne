package pl.akademiaqa.zadania.zadanie13.solutions;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayUtilsSolution3 {

    // Stream API
    public static int findSecondLargest(int[] array) {

        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Tablica nie może być null i musi zawierać co najmniej dwa elementy");
        }

        OptionalInt max = Arrays.stream(array).max();
        if (!max.isPresent()) {
            throw new IllegalArgumentException("Tablica nie może być pusta");
        }

        int largest = max.getAsInt();
        OptionalInt secondLargest = Arrays.stream(array)
                .filter(num -> num != largest)
                .max();

        if (secondLargest.isPresent()) {
            return secondLargest.getAsInt();
        } else {
            throw new IllegalArgumentException("Tablica musi zawierać co najmniej dwa unikalne elementy");
        }
    }
}
