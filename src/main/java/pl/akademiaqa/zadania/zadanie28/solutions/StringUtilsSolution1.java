package pl.akademiaqa.zadania.zadanie28.solutions;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringUtilsSolution1 {

    public static String removeDuplicateCharacters(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Wyraz nie może być null");
        }

        Set<Character> uniqueCharacters = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (uniqueCharacters.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
