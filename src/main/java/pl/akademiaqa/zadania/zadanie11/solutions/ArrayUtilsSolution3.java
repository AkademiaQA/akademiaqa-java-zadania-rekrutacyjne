package pl.akademiaqa.zadania.zadanie11.solutions;

import java.util.*;

public class ArrayUtilsSolution3 {

    // Sortowanie
    public static Set<Integer> findDuplicates(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        Set<Integer> duplicates = new HashSet<>();
        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                duplicates.add(array[i]);
            }
        }

        return duplicates;
    }
}
