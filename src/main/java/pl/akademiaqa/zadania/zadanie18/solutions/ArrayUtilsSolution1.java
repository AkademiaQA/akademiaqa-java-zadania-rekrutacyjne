package pl.akademiaqa.zadania.zadanie18.solutions;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtilsSolution1 {

    public static List<Character> findAdjacentDuplicates(char[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        List<Character> duplicates = new ArrayList<>();

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                duplicates.add(array[i]);
            }
        }

        return duplicates;
    }
}
