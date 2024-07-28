package pl.akademiaqa.zadania.zadanie27.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StringUtilsSolution1Test {

    @Test
    void test_remove_duplicate_words_with_repeated_words() {
        String sentence = "Szybki szybki szybki brązowy lis lis";
        String result = StringUtilsSolution1.removeDuplicateWords(sentence);
        assertThat(result).isEqualTo("Szybki szybki brązowy lis");
    }

    @Test
    void test_remove_duplicate_words_with_no_repeated_words() {
        String sentence = "Szybki brązowy lis przeskakuje nad leniwym psem";
        String result = StringUtilsSolution1.removeDuplicateWords(sentence);
        assertThat(result).isEqualTo("Szybki brązowy lis przeskakuje nad leniwym psem");
    }

    @Test
    void test_remove_duplicate_words_with_empty_sentence() {
        String sentence = "";
        String result = StringUtilsSolution1.removeDuplicateWords(sentence);
        assertThat(result).isEqualTo("");
    }

    @Test
    void test_remove_duplicate_words_with_single_word() {
        String sentence = "lis";
        String result = StringUtilsSolution1.removeDuplicateWords(sentence);
        assertThat(result).isEqualTo("lis");
    }

    @Test
    void test_remove_duplicate_words_with_whitespace() {
        String sentence = "   ";
        String result = StringUtilsSolution1.removeDuplicateWords(sentence);
        assertThat(result).isEqualTo("");
    }

    @Test
    void test_remove_duplicate_words_with_null_sentence() {
        String sentence = null;
        assertThatThrownBy(() -> StringUtilsSolution1.removeDuplicateWords(sentence))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Zdanie nie może być null");
    }

    @Test
    void test_remove_duplicate_words_with_mixed_case_words() {
        String sentence = "Lis lis LIS";
        String result = StringUtilsSolution1.removeDuplicateWords(sentence);
        assertThat(result).isEqualTo("Lis lis LIS");
    }
}
