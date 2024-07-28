package pl.akademiaqa.zadania.zadanie21.solutions;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtilsSolution3 {

    // Użycie dwóch wskaźników i dynamicznej listy
    public static void segregateZerosAndOnes(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        List<Integer> result = new ArrayList<>();

        // Dodajemy wszystkie zera do listy wynikowej
        for (int num : array) {
            if (num == 0) {
                result.add(0);
            }
        }

        // Dodajemy wszystkie jedynki do listy wynikowej
        for (int num : array) {
            if (num == 1) {
                result.add(1);
            }
        }

        // Konwersja listy wynikowej z powrotem do tablicy
        for (int i = 0; i < array.length; i++) {
            array[i] = result.get(i);
        }
    }
}
