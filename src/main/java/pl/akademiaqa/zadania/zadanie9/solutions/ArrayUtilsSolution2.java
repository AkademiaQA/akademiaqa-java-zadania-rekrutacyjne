package pl.akademiaqa.zadania.zadanie9.solutions;

import java.util.Arrays;

public class ArrayUtilsSolution2 {

    // Stream API
    public static int[] removeElement(int[] array, int element) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        return Arrays.stream(array)
                .filter(num -> num != element)
                .toArray();
    }
}
