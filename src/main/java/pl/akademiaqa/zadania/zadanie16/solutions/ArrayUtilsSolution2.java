package pl.akademiaqa.zadania.zadanie16.solutions;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtilsSolution2 {

    // Użycie kolekcji List do zarządzania pozycjami
    public static boolean isSumOfEveryThirdElementEqualToTen(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        List<Integer> everyThirdElement = new ArrayList<>();
        for (int i = 2; i < array.length; i += 3) {
            everyThirdElement.add(array[i]);
        }

        int sum = everyThirdElement.stream().mapToInt(Integer::intValue).sum();

        return sum == 10;
    }
}
