package pl.akademiaqa.zadania.zadanie17.solutions;

import java.util.Arrays;

public class ArrayUtilsSolution3 {

    // Stream API
    public static boolean containsTwoElements(int[] array, int element1, int element2) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        boolean containsElement1 = Arrays.stream(array).anyMatch(num -> num == element1);
        boolean containsElement2 = Arrays.stream(array).anyMatch(num -> num == element2);

        return containsElement1 && containsElement2;
    }
}
