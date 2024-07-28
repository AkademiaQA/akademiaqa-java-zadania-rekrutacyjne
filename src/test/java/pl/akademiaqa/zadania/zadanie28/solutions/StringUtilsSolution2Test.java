package pl.akademiaqa.zadania.zadanie28.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringUtilsSolution2Test {

    @Test
    void test_remove_duplicate_characters_with_repeated_characters() {
        String word = "programowanie";
        String result = StringUtilsSolution2.removeDuplicateCharacters(word);
        assertThat(result).isEqualTo("progamwnie");
    }

    @Test
    void test_remove_duplicate_characters_with_no_repeated_characters() {
        String word = "abcdef";
        String result = StringUtilsSolution2.removeDuplicateCharacters(word);
        assertThat(result).isEqualTo("abcdef");
    }

    @Test
    void test_remove_duplicate_characters_with_empty_string() {
        String word = "";
        String result = StringUtilsSolution2.removeDuplicateCharacters(word);
        assertThat(result).isEqualTo("");
    }

    @Test
    void test_remove_duplicate_characters_with_single_character() {
        String word = "a";
        String result = StringUtilsSolution2.removeDuplicateCharacters(word);
        assertThat(result).isEqualTo("a");
    }

    @Test
    void test_remove_duplicate_characters_with_whitespace() {
        String word = "   ";
        String result = StringUtilsSolution2.removeDuplicateCharacters(word);
        assertThat(result).isEqualTo(" ");
    }

    @Test
    void test_remove_duplicate_characters_with_null_string() {
        String word = null;
        assertThatThrownBy(() -> StringUtilsSolution2.removeDuplicateCharacters(word))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Wyraz nie może być null");
    }

    @Test
    void test_remove_duplicate_characters_with_mixed_case_characters() {
        String word = "AaBbCc";
        String result = StringUtilsSolution2.removeDuplicateCharacters(word);
        assertThat(result).isEqualTo("AaBbCc");
    }
}
