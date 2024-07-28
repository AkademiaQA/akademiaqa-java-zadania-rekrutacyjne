package pl.akademiaqa.zadania.zadanie23;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringUtilsTest {

    @Test
    void test_get_character_at_index_with_valid_index() {
        String str = "Hello, world!";
        int index = 7;
        char result = StringUtils.getCharacterAtIndex(str, index);
        assertThat(result).isEqualTo('w');
    }

    @Test
    void test_get_character_at_index_with_first_index() {
        String str = "Hello, world!";
        int index = 0;
        char result = StringUtils.getCharacterAtIndex(str, index);
        assertThat(result).isEqualTo('H');
    }

    @Test
    void test_get_character_at_index_with_last_index() {
        String str = "Hello, world!";
        int index = 12;
        char result = StringUtils.getCharacterAtIndex(str, index);
        assertThat(result).isEqualTo('!');
    }

    @Test
    void test_get_character_at_index_with_negative_index() {
        String str = "Hello, world!";
        int index = -1;
        assertThatThrownBy(() -> StringUtils.getCharacterAtIndex(str, index))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessage("Index jest poza zakresem");
    }

    @Test
    void test_get_character_at_index_with_index_out_of_bounds() {
        String str = "Hello, world!";
        int index = 20;
        assertThatThrownBy(() -> StringUtils.getCharacterAtIndex(str, index))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessage("Index jest poza zakresem");
    }

    @Test
    void test_get_character_at_index_with_null_string() {
        String str = null;
        int index = 0;
        assertThatThrownBy(() -> StringUtils.getCharacterAtIndex(str, index))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("String nie może być null");
    }
}
