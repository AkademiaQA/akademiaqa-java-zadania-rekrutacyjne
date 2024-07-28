package pl.akademiaqa.zadania.zadanie19.solutions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayUtilsSolution2 {

    // Stream API
    public static int findMostFrequentElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null lub pusta");
        }

        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }
}
