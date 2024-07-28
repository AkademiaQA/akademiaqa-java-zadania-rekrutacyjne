package pl.akademiaqa.zadania.zadanie20.solutions;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtilsSolution2 {

    public static int[] removeTargetAndGreaterNumbers(int[] array, int target) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        List<Integer> result = new ArrayList<>();
        boolean foundTarget = false;

        for (int num : array) {
            if (num == target) {
                foundTarget = true;
                break;
            }
        }

        for (int num : array) {
            if (num == target) {
                foundTarget = true;
                continue;
            }
            if (!foundTarget || num <= target) {
                result.add(num);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
