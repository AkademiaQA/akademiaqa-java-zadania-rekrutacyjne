package pl.akademiaqa.zadania.zadanie26.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StringUtilsSolution1Test {

    @Test
    void test_reverse_string_with_normal_string() {
        String str = "Szybki brązowy lis";
        String result = StringUtilsSolution1.reverseString(str);
        assertThat(result).isEqualTo("sil ywoząrb ikbyzS");
    }

    @Test
    void test_reverse_string_with_empty_string() {
        String str = "";
        String result = StringUtilsSolution1.reverseString(str);
        assertThat(result).isEqualTo("");
    }

    @Test
    void test_reverse_string_with_single_character() {
        String str = "a";
        String result = StringUtilsSolution1.reverseString(str);
        assertThat(result).isEqualTo("a");
    }

    @Test
    void test_reverse_string_with_whitespace() {
        String str = "  ";
        String result = StringUtilsSolution1.reverseString(str);
        assertThat(result).isEqualTo("  ");
    }

    @Test
    void test_reverse_string_with_null_string() {
        String str = null;
        assertThatThrownBy(() -> StringUtilsSolution1.reverseString(str))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("String nie może być null");
    }

    @Test
    void test_reverse_string_with_palindrome() {
        String str = "kajak";
        String result = StringUtilsSolution1.reverseString(str);
        assertThat(result).isEqualTo("kajak");
    }
}
