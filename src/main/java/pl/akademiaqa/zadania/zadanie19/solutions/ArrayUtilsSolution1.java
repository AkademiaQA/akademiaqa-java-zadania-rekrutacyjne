package pl.akademiaqa.zadania.zadanie19.solutions;

import java.util.HashMap;
import java.util.Map;

public class ArrayUtilsSolution1 {

    public static int findMostFrequentElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null lub pusta");
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequentElement = array[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentElement = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequentElement;
    }
}
