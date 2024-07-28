package pl.akademiaqa.zadania.zadanie24.solutions;

public class StringUtilsSolution2 {

    // Rozwiązanie z użyciem StringBuilder
    public static String replaceWord(String sentence, String target, String replacement) {
        if (sentence == null || target == null || replacement == null) {
            throw new IllegalArgumentException("Argumenty nie mogą być null");
        }

        StringBuilder result = new StringBuilder();
        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                result.append(replacement);
            } else {
                result.append(words[i]);
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
