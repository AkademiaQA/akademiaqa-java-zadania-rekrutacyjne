package pl.akademiaqa.zadania.zadanie12.solutions;

import java.util.HashSet;
import java.util.Set;

public class ArrayUtilsSolution1 {

    public static Set<Character> findCommonElements(char[] array1, char[] array2) {
        if (array1 == null || array2 == null) {
            throw new IllegalArgumentException("Tablice nie mogą być null");
        }

        Set<Character> set1 = new HashSet<>();
        Set<Character> commonElements = new HashSet<>();

        for (char c : array1) {
            set1.add(c);
        }

        for (char c : array2) {
            if (set1.contains(c)) {
                commonElements.add(c);
            }
        }

        return commonElements;
    }
}
