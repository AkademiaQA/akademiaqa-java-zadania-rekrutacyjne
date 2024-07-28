package pl.akademiaqa.zadania.zadanie14.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayUtilsSolution1 {

    public static List<int[]> findPairsWithSum(int[] array, int targetSum) {

        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        List<int[]> pairs = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            int complement = targetSum - num;
            if (map.containsKey(complement)) {
                pairs.add(new int[]{complement, num});
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return pairs;
    }
}
