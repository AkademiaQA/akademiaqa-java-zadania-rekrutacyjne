package pl.akademiaqa.zadania.zadanie23.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StringUtilsSolution1Test {

    @Test
    void test_get_character_at_index_with_valid_index() {
        String str = "Hello, world!";
        int index = 7;
        char result = StringUtilsSolution1.getCharacterAtIndex(str, index);
        assertThat(result).isEqualTo('w');
    }

    @Test
    void test_get_character_at_index_with_first_index() {
        String str = "Hello, world!";
        int index = 0;
        char result = StringUtilsSolution1.getCharacterAtIndex(str, index);
        assertThat(result).isEqualTo('H');
    }

    @Test
    void test_get_character_at_index_with_last_index() {
        String str = "Hello, world!";
        int index = 12;
        char result = StringUtilsSolution1.getCharacterAtIndex(str, index);
        assertThat(result).isEqualTo('!');
    }

    @Test
    void test_get_character_at_index_with_negative_index() {
        String str = "Hello, world!";
        int index = -1;
        assertThatThrownBy(() -> StringUtilsSolution1.getCharacterAtIndex(str, index))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessage("Index jest poza zakresem");
    }

    @Test
    void test_get_character_at_index_with_index_out_of_bounds() {
        String str = "Hello, world!";
        int index = 20;
        assertThatThrownBy(() -> StringUtilsSolution1.getCharacterAtIndex(str, index))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessage("Index jest poza zakresem");
    }

    @Test
    void test_get_character_at_index_with_null_string() {
        String str = null;
        int index = 0;
        assertThatThrownBy(() -> StringUtilsSolution1.getCharacterAtIndex(str, index))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("String nie może być null");
    }
}
