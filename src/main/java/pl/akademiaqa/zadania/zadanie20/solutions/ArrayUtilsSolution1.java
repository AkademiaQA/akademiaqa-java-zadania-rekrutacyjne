package pl.akademiaqa.zadania.zadanie20.solutions;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtilsSolution1 {

    public static int[] removeTargetAndGreaterNumbers(int[] array, int target) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        List<Integer> result = new ArrayList<>();
        boolean foundTarget = false;

        for (int num : array) {
            if (num == target) {
                foundTarget = true;
            } else if (!foundTarget || num <= target) {
                result.add(num);
            }
        }

        // Konwersja listy wynikowej z powrotem do tablicy
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
