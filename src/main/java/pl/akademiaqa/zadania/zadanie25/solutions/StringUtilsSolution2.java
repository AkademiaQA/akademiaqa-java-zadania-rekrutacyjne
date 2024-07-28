package pl.akademiaqa.zadania.zadanie25.solutions;

public class StringUtilsSolution2 {

    // Stream API
    public static long countCharacterOccurrences(String sentence, char character) {
        if (sentence == null) {
            throw new IllegalArgumentException("Zdanie nie może być null");
        }

        return sentence.chars()
                .filter(ch -> ch == character)
                .count();
    }
}
