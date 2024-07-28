package pl.akademiaqa.zadania.zadanie11;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArrayUtilsTest {

    @Test
    void test_find_duplicates_with_duplicates() {
        int[] array = {1, 2, 3, 1, 2, 4, 5};
        Set<Integer> result = ArrayUtils.findDuplicates(array);
        assertThat(result).containsExactlyInAnyOrder(1, 2);
    }

    @Test
    void test_find_duplicates_with_no_duplicates() {
        int[] array = {1, 2, 3, 4, 5};
        Set<Integer> result = ArrayUtils.findDuplicates(array);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_duplicates_with_all_duplicates() {
        int[] array = {1, 1, 1, 1};
        Set<Integer> result = ArrayUtils.findDuplicates(array);
        assertThat(result).containsExactly(1);
    }

    @Test
    void test_find_duplicates_with_empty_array() {
        int[] array = {};
        Set<Integer> result = ArrayUtils.findDuplicates(array);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_duplicates_with_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArrayUtils.findDuplicates(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null");
    }

    @Test
    void test_find_duplicates_with_single_element() {
        int[] array = {1};
        Set<Integer> result = ArrayUtils.findDuplicates(array);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_duplicates_with_mixed_numbers() {
        int[] array = {-1, 2, -1, 3, 2, 4, -1};
        Set<Integer> result = ArrayUtils.findDuplicates(array);
        assertThat(result).containsExactlyInAnyOrder(-1, 2);
    }
}
