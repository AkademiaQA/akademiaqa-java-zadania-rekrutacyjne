package pl.akademiaqa.zadania.zadanie28;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringUtilsTest {

    @Test
    void test_remove_duplicate_characters_with_repeated_characters() {
        String word = "programowanie";
        String result = StringUtils.removeDuplicateCharacters(word);
        assertThat(result).isEqualTo("progamwnie");
    }

    @Test
    void test_remove_duplicate_characters_with_no_repeated_characters() {
        String word = "abcdef";
        String result = StringUtils.removeDuplicateCharacters(word);
        assertThat(result).isEqualTo("abcdef");
    }

    @Test
    void test_remove_duplicate_characters_with_empty_string() {
        String word = "";
        String result = StringUtils.removeDuplicateCharacters(word);
        assertThat(result).isEqualTo("");
    }

    @Test
    void test_remove_duplicate_characters_with_single_character() {
        String word = "a";
        String result = StringUtils.removeDuplicateCharacters(word);
        assertThat(result).isEqualTo("a");
    }

    @Test
    void test_remove_duplicate_characters_with_whitespace() {
        String word = "   ";
        String result = StringUtils.removeDuplicateCharacters(word);
        assertThat(result).isEqualTo(" ");
    }

    @Test
    void test_remove_duplicate_characters_with_null_string() {
        String word = null;
        assertThatThrownBy(() -> StringUtils.removeDuplicateCharacters(word))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Wyraz nie może być null");
    }

    @Test
    void test_remove_duplicate_characters_with_mixed_case_characters() {
        String word = "AaBbCc";
        String result = StringUtils.removeDuplicateCharacters(word);
        assertThat(result).isEqualTo("AaBbCc");
    }
}
