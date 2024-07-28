package pl.akademiaqa.zadania.zadanie25.solutions;

public class StringUtilsSolution1 {

    public static int countCharacterOccurrences(String sentence, char character) {
        if (sentence == null) {
            throw new IllegalArgumentException("Zdanie nie może być null");
        }

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character) {
                count++;
            }
        }

        return count;
    }
}
