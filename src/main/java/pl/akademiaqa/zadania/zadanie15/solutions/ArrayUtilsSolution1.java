package pl.akademiaqa.zadania.zadanie15.solutions;

import java.util.HashMap;
import java.util.Map;

public class ArrayUtilsSolution1 {

    public static Map<String, Integer> countEvenAndOdd(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        Map<String, Integer> counts = new HashMap<>();
        counts.put("even", 0);
        counts.put("odd", 0);

        for (int num : array) {
            if (num % 2 == 0) {
                counts.put("even", counts.get("even") + 1);
            } else {
                counts.put("odd", counts.get("odd") + 1);
            }
        }

        return counts;
    }
}
