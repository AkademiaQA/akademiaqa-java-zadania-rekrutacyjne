package pl.akademiaqa.zadania.zadanie24.solutions;

public class StringUtilsSolution1 {

    public static String replaceWord(String sentence, String target, String replacement) {
        if (sentence == null || target == null || replacement == null) {
            throw new IllegalArgumentException("Argumenty nie mogą być null");
        }

        return sentence.replaceAll("\\b" + target + "\\b", replacement);
    }
}
