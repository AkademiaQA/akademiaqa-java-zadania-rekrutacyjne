package pl.akademiaqa.zadania.zadanie12.solutions;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayUtilsSolution2 {

    // Stream API
    public static Set<Character> findCommonElements(char[] array1, char[] array2) {
        if (array1 == null || array2 == null) {
            throw new IllegalArgumentException("Tablice nie mogą być null");
        }

        Set<Character> set1 = new HashSet<>();
        for (char c : array1) {
            set1.add(c);
        }

        return new HashSet<>(set1.stream()
                .filter(c -> {
                    for (char ch : array2) {
                        if (c == ch) {
                            return true;
                        }
                    }
                    return false;
                })
                .collect(Collectors.toSet()));
    }
}
