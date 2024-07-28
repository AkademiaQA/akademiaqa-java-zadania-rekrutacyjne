package pl.akademiaqa.zadania.zadanie11.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayUtilsSolution2 {

    // Mapa
    public static Set<Integer> findDuplicates(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }
}
