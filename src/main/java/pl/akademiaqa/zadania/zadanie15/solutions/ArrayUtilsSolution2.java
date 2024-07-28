package pl.akademiaqa.zadania.zadanie15.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ArrayUtilsSolution2 {

    // Stream API
    public static Map<String, Integer> countEvenAndOdd(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        Map<String, Integer> counts = new HashMap<>();
        counts.put("even", (int) IntStream.of(array).filter(num -> num % 2 == 0).count());
        counts.put("odd", (int) IntStream.of(array).filter(num -> num % 2 != 0).count());

        return counts;
    }
}
