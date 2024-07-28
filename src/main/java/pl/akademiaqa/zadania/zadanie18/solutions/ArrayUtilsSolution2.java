package pl.akademiaqa.zadania.zadanie18.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayUtilsSolution2 {

    // Stream API
    public static List<Character> findAdjacentDuplicates(char[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        List<Character> duplicates = new ArrayList<>();

        IntStream.range(1, array.length)
                .filter(i -> array[i] == array[i - 1])
                .forEach(i -> duplicates.add(array[i]));

        return duplicates;
    }
}
