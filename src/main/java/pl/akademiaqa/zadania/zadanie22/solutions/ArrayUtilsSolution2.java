package pl.akademiaqa.zadania.zadanie22.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUtilsSolution2 {

    // Stream API
    public static List<Integer> findNumbersGreaterThanAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null lub pusta");
        }

        double average = Arrays.stream(array).average().orElse(Double.NaN);

        return Arrays.stream(array)
                .filter(num -> num > average)
                .boxed()
                .collect(Collectors.toList());
    }
}
