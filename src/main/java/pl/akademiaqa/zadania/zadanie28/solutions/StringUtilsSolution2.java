package pl.akademiaqa.zadania.zadanie28.solutions;

import java.util.stream.Collectors;

public class StringUtilsSolution2 {

    // Alternatywne rozwiązanie z użyciem Stream API
    public static String removeDuplicateCharacters(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Wyraz nie może być null");
        }

        return word.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
