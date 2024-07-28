package pl.akademiaqa.zadania.zadanie10;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArrayUtilsTest {

    @Test
    void test_find_min_and_max_with_normal_array() {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = ArrayUtils.findMinAndMax(array);
        assertThat(result).containsExactly(1, 5);
    }

    @Test
    void test_find_min_and_max_with_negative_numbers() {
        int[] array = {-1, -2, -3, -4, -5};
        int[] result = ArrayUtils.findMinAndMax(array);
        assertThat(result).containsExactly(-5, -1);
    }

    @Test
    void test_find_min_and_max_with_mixed_numbers() {
        int[] array = {-1, 2, -3, 4, -5};
        int[] result = ArrayUtils.findMinAndMax(array);
        assertThat(result).containsExactly(-5, 4);
    }

    @Test
    void test_find_min_and_max_with_single_element() {
        int[] array = {42};
        int[] result = ArrayUtils.findMinAndMax(array);
        assertThat(result).containsExactly(42, 42);
    }

    @Test
    void test_find_min_and_max_with_empty_array() {
        int[] array = {};
        assertThatThrownBy(() -> ArrayUtils.findMinAndMax(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null ani pusta");
    }

    @Test
    void test_find_min_and_max_with_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArrayUtils.findMinAndMax(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null ani pusta");
    }

    @Test
    void test_find_min_and_max_with_identical_elements() {
        int[] array = {7, 7, 7, 7, 7};
        int[] result = ArrayUtils.findMinAndMax(array);
        assertThat(result).containsExactly(7, 7);
    }
}
