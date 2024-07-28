package pl.akademiaqa.zadania.zadanie26;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringUtilsTest {

    @Test
    void test_reverse_string_with_normal_string() {
        String str = "Szybki brązowy lis";
        String result = StringUtils.reverseString(str);
        assertThat(result).isEqualTo("sil ywoząrb ikbyzS");
    }

    @Test
    void test_reverse_string_with_empty_string() {
        String str = "";
        String result = StringUtils.reverseString(str);
        assertThat(result).isEqualTo("");
    }

    @Test
    void test_reverse_string_with_single_character() {
        String str = "a";
        String result = StringUtils.reverseString(str);
        assertThat(result).isEqualTo("a");
    }

    @Test
    void test_reverse_string_with_whitespace() {
        String str = "  ";
        String result = StringUtils.reverseString(str);
        assertThat(result).isEqualTo("  ");
    }

    @Test
    void test_reverse_string_with_null_string() {
        String str = null;
        assertThatThrownBy(() -> StringUtils.reverseString(str))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("String nie może być null");
    }

    @Test
    void test_reverse_string_with_palindrome() {
        String str = "kajak";
        String result = StringUtils.reverseString(str);
        assertThat(result).isEqualTo("kajak");
    }
}
