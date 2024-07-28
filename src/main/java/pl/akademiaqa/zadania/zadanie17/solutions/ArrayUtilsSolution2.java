package pl.akademiaqa.zadania.zadanie17.solutions;

import java.util.HashSet;
import java.util.Set;

public class ArrayUtilsSolution2 {

    // Użycie zbioru HashSet do przechowywania elementów
    public static boolean containsTwoElements(int[] array, int element1, int element2) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        Set<Integer> elements = new HashSet<>();
        for (int num : array) {
            elements.add(num);
        }

        return elements.contains(element1) && elements.contains(element2);
    }
}
