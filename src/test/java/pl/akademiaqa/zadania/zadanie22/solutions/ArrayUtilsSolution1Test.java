package pl.akademiaqa.zadania.zadanie22.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

class ArrayUtilsSolution1Test {

    @Test
    void test_find_numbers_greater_than_average_with_mixed_values() {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> result = ArrayUtilsSolution1.findNumbersGreaterThanAverage(array);
        assertThat(result).containsExactly(4, 5);
    }

    @Test
    void test_find_numbers_greater_than_average_with_all_values_same() {
        int[] array = {3, 3, 3, 3};
        List<Integer> result = ArrayUtilsSolution1.findNumbersGreaterThanAverage(array);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_numbers_greater_than_average_with_single_value() {
        int[] array = {3};
        List<Integer> result = ArrayUtilsSolution1.findNumbersGreaterThanAverage(array);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_numbers_greater_than_average_with_empty_array() {
        int[] array = {};
        assertThatThrownBy(() -> ArrayUtilsSolution1.findNumbersGreaterThanAverage(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null lub pusta");
    }

    @Test
    void test_find_numbers_greater_than_average_with_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArrayUtilsSolution1.findNumbersGreaterThanAverage(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null lub pusta");
    }

    @Test
    void test_find_numbers_greater_than_average_with_negative_numbers() {
        int[] array = {-1, -2, -3, -4, -5};
        List<Integer> result = ArrayUtilsSolution1.findNumbersGreaterThanAverage(array);
        assertThat(result).containsExactly(-1, -2);
    }
}
