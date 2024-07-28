package pl.akademiaqa.zadania.zadanie27;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringUtilsTest {

    @Test
    void test_remove_duplicate_words_with_repeated_words() {
        String sentence = "Szybki szybki szybki brązowy lis lis";
        String result = StringUtils.removeDuplicateWords(sentence);
        assertThat(result).isEqualTo("Szybki szybki brązowy lis");
    }

    @Test
    void test_remove_duplicate_words_with_no_repeated_words() {
        String sentence = "Szybki brązowy lis przeskakuje nad leniwym psem";
        String result = StringUtils.removeDuplicateWords(sentence);
        assertThat(result).isEqualTo("Szybki brązowy lis przeskakuje nad leniwym psem");
    }

    @Test
    void test_remove_duplicate_words_with_empty_sentence() {
        String sentence = "";
        String result = StringUtils.removeDuplicateWords(sentence);
        assertThat(result).isEqualTo("");
    }

    @Test
    void test_remove_duplicate_words_with_single_word() {
        String sentence = "lis";
        String result = StringUtils.removeDuplicateWords(sentence);
        assertThat(result).isEqualTo("lis");
    }

    @Test
    void test_remove_duplicate_words_with_whitespace() {
        String sentence = "   ";
        String result = StringUtils.removeDuplicateWords(sentence);
        assertThat(result).isEqualTo("");
    }

    @Test
    void test_remove_duplicate_words_with_null_sentence() {
        String sentence = null;
        assertThatThrownBy(() -> StringUtils.removeDuplicateWords(sentence))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Zdanie nie może być null");
    }

    @Test
    void test_remove_duplicate_words_with_mixed_case_words() {
        String sentence = "Lis lis LIS";
        String result = StringUtils.removeDuplicateWords(sentence);
        assertThat(result).isEqualTo("Lis lis LIS");
    }
}
