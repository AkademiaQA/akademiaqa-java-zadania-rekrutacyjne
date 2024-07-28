package pl.akademiaqa.zadania.zadanie25;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringUtilsTest {

    @Test
    void test_count_character_occurrences_with_multiple_occurrences() {
        String sentence = "Szybki brązowy lis przeskakuje na leniwym psem.";
        char character = 'l';
        int result = StringUtils.countCharacterOccurrences(sentence, character);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void test_count_character_occurrences_with_no_occurrences() {
        String sentence = "Szybki brązowy lis przeskakuje na leniwym psem.";
        char character = 'x';
        int result = StringUtils.countCharacterOccurrences(sentence, character);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void test_count_character_occurrences_with_special_characters() {
        String sentence = "Hello, world!";
        char character = '!';
        int result = StringUtils.countCharacterOccurrences(sentence, character);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void test_count_character_occurrences_with_empty_sentence() {
        String sentence = "";
        char character = 'a';
        int result = StringUtils.countCharacterOccurrences(sentence, character);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void test_count_character_occurrences_with_null_sentence() {
        String sentence = null;
        char character = 'a';
        assertThatThrownBy(() -> StringUtils.countCharacterOccurrences(sentence, character))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Zdanie nie może być null");
    }

    @Test
    void test_count_character_occurrences_with_unicode_characters() {
        String sentence = "Zażółć gęślą jaźń.";
        char character = 'ż';
        int result = StringUtils.countCharacterOccurrences(sentence, character);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void test_count_character_occurrences_with_case_sensitivity() {
        String sentence = "Hello, Hello, Hello!";
        char character = 'H';
        int result = StringUtils.countCharacterOccurrences(sentence, character);
        assertThat(result).isEqualTo(3);
    }
}
