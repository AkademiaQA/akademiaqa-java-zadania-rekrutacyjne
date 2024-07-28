package pl.akademiaqa.zadania.zadanie18;

import org.junit.jupiter.api.Test;
import pl.akademiaqa.zadania.zadanie18.solutions.ArrayUtilsSolution2;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArrayUtilsTest {

    @Test
    void test_find_adjacent_duplicates_with_duplicates() {
        char[] array = {'a', 'b', 'b', 'c', 'c', 'c', 'd'};
        List<Character> result = ArrayUtilsSolution2.findAdjacentDuplicates(array);
        assertThat(result).containsExactly('b', 'c', 'c');
    }

    @Test
    void test_find_adjacent_duplicates_with_no_duplicates() {
        char[] array = {'a', 'b', 'c', 'd'};
        List<Character> result = ArrayUtilsSolution2.findAdjacentDuplicates(array);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_adjacent_duplicates_with_single_element() {
        char[] array = {'a'};
        List<Character> result = ArrayUtilsSolution2.findAdjacentDuplicates(array);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_adjacent_duplicates_with_empty_array() {
        char[] array = {};
        List<Character> result = ArrayUtilsSolution2.findAdjacentDuplicates(array);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_adjacent_duplicates_with_null_array() {
        char[] array = null;
        assertThatThrownBy(() -> ArrayUtilsSolution2.findAdjacentDuplicates(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null");
    }

    @Test
    void test_find_adjacent_duplicates_with_all_duplicates() {
        char[] array = {'a', 'a', 'a', 'a'};
        List<Character> result = ArrayUtilsSolution2.findAdjacentDuplicates(array);
        assertThat(result).containsExactly('a', 'a', 'a');
    }

}
