package pl.akademiaqa.zadania.zadanie27.solutions;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringUtilsSolution1 {

    public static String removeDuplicateWords(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Zdanie nie może być null");
        }

        String[] words = sentence.split("\\s+");
        Set<String> uniqueWords = new LinkedHashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        return String.join(" ", uniqueWords);
    }
}
