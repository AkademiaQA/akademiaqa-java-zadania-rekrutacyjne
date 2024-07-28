package pl.akademiaqa.zadania.zadanie11.solutions;

import java.util.HashSet;
import java.util.Set;

public class ArrayUtilsSolution1 {

    public static Set<Integer> findDuplicates(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}
