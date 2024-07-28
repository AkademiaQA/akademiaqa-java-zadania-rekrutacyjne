package pl.akademiaqa.zadania.zadanie27.solutions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringUtilsSolution2 {

    // Stream API
    public static String removeDuplicateWords(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Zdanie nie może być null");
        }

        return Arrays.stream(sentence.split("\\s+"))
                .distinct()
                .collect(Collectors.joining(" "));
    }
}
