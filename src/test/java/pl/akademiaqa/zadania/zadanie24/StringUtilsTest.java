package pl.akademiaqa.zadania.zadanie24;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringUtilsTest {

    @Test
    void test_replace_word_with_target_present() {
        String sentence = "Szybki brązowy lis przeskakuje nad leniwym psem.";
        String target = "lis";
        String replacement = "kot";
        String result = StringUtils.replaceWord(sentence, target, replacement);
        assertThat(result).isEqualTo("Szybki brązowy kot przeskakuje nad leniwym psem.");
    }

    @Test
    void test_replace_word_with_multiple_occurrences() {
        String sentence = "Lis spotkał innego lisa w lesie.";
        String target = "Lis";
        String replacement = "Kot";
        String result = StringUtils.replaceWord(sentence, target, replacement);
        assertThat(result).isEqualTo("Kot spotkał innego lisa w lesie.");
    }

    @Test
    void test_replace_word_with_multiple_occurrences_2() {
        String sentence = "Dwa zwierzaki, lis Janek i jego kolega lis Tomek wybrali się na spacer do lasu.";
        String target = "lis";
        String replacement = "kot";
        String result = StringUtils.replaceWord(sentence, target, replacement);
        assertThat(result).isEqualTo("Dwa zwierzaki, kot Janek i jego kolega kot Tomek wybrali się na spacer do lasu.");
    }

    @Test
    void test_replace_word_with_target_absent() {
        String sentence = "Szybki brązowy lis przeskakuje nad leniwym psem.";
        String target = "pies";
        String replacement = "kot";
        String result = StringUtils.replaceWord(sentence, target, replacement);
        assertThat(result).isEqualTo("Szybki brązowy lis przeskakuje nad leniwym psem.");
    }

    @Test
    void test_replace_word_with_empty_sentence() {
        String sentence = "";
        String target = "lis";
        String replacement = "kot";
        String result = StringUtils.replaceWord(sentence, target, replacement);
        assertThat(result).isEqualTo("");
    }

    @Test
    void test_replace_word_with_null_sentence() {
        String sentence = null;
        String target = "lis";
        String replacement = "kot";
        assertThatThrownBy(() -> StringUtils.replaceWord(sentence, target, replacement))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Argumenty nie mogą być null");
    }

    @Test
    void test_replace_word_with_null_target() {
        String sentence = "Szybki brązowy lis przeskakuje nad leniwym psem.";
        String target = null;
        String replacement = "kot";
        assertThatThrownBy(() -> StringUtils.replaceWord(sentence, target, replacement))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Argumenty nie mogą być null");
    }

    @Test
    void test_replace_word_with_null_replacement() {
        String sentence = "Szybki brązowy lis przeskakuje nad leniwym psem.";
        String target = "lis";
        String replacement = null;
        assertThatThrownBy(() -> StringUtils.replaceWord(sentence, target, replacement))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Argumenty nie mogą być null");
    }
}
