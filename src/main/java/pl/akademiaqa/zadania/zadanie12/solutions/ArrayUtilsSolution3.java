package pl.akademiaqa.zadania.zadanie12.solutions;

import java.util.HashSet;
import java.util.Set;

public class ArrayUtilsSolution3 {

    // Użycie dwóch zbiorów do przechowywania znaków
    public static Set<Character> findCommonElements(char[] array1, char[] array2) {
        if (array1 == null || array2 == null) {
            throw new IllegalArgumentException("Tablice nie mogą być null");
        }

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : array1) {
            set1.add(c);
        }

        for (char c : array2) {
            set2.add(c);
        }

        set1.retainAll(set2);

        return set1;
    }
}
