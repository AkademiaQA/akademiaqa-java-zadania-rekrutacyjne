package pl.akademiaqa.zadania.zadanie18.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

class ArrayUtilsSolution1Test {

    @Test
    void test_find_adjacent_duplicates_with_duplicates() {
        char[] array = {'a', 'b', 'b', 'c', 'c', 'c', 'd'};
        List<Character> result = ArrayUtilsSolution1.findAdjacentDuplicates(array);
        assertThat(result).containsExactly('b', 'c', 'c');
    }

    @Test
    void test_find_adjacent_duplicates_with_no_duplicates() {
        char[] array = {'a', 'b', 'c', 'd'};
        List<Character> result = ArrayUtilsSolution1.findAdjacentDuplicates(array);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_adjacent_duplicates_with_single_element() {
        char[] array = {'a'};
        List<Character> result = ArrayUtilsSolution1.findAdjacentDuplicates(array);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_adjacent_duplicates_with_empty_array() {
        char[] array = {};
        List<Character> result = ArrayUtilsSolution1.findAdjacentDuplicates(array);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_adjacent_duplicates_with_null_array() {
        char[] array = null;
        assertThatThrownBy(() -> ArrayUtilsSolution1.findAdjacentDuplicates(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null");
    }

    @Test
    void test_find_adjacent_duplicates_with_all_duplicates() {
        char[] array = {'a', 'a', 'a', 'a'};
        List<Character> result = ArrayUtilsSolution1.findAdjacentDuplicates(array);
        assertThat(result).containsExactly('a', 'a', 'a');
    }
}
