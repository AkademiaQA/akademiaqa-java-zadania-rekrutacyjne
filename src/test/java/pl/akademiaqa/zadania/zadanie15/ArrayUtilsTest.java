package pl.akademiaqa.zadania.zadanie15;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArrayUtilsTest {

    @Test
    void test_count_even_and_odd_with_mixed_numbers() {
        int[] array = {1, 2, 3, 4, 5, 6};
        Map<String, Integer> result = ArrayUtils.countEvenAndOdd(array);
        assertThat(result).containsEntry("even", 3);
        assertThat(result).containsEntry("odd", 3);
    }

    @Test
    void test_count_even_and_odd_with_only_even_numbers() {
        int[] array = {2, 4, 6, 8, 10};
        Map<String, Integer> result = ArrayUtils.countEvenAndOdd(array);
        assertThat(result).containsEntry("even", 5);
        assertThat(result).containsEntry("odd", 0);
    }

    @Test
    void test_count_even_and_odd_with_only_odd_numbers() {
        int[] array = {1, 3, 5, 7, 9};
        Map<String, Integer> result = ArrayUtils.countEvenAndOdd(array);
        assertThat(result).containsEntry("even", 0);
        assertThat(result).containsEntry("odd", 5);
    }

    @Test
    void test_count_even_and_odd_with_empty_array() {
        int[] array = {};
        Map<String, Integer> result = ArrayUtils.countEvenAndOdd(array);
        assertThat(result).containsEntry("even", 0);
        assertThat(result).containsEntry("odd", 0);
    }

    @Test
    void test_count_even_and_odd_with_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArrayUtils.countEvenAndOdd(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null");
    }

    @Test
    void test_count_even_and_odd_with_negative_numbers() {
        int[] array = {-1, -2, -3, -4, -5};
        Map<String, Integer> result = ArrayUtils.countEvenAndOdd(array);
        assertThat(result).containsEntry("even", 2);
        assertThat(result).containsEntry("odd", 3);
    }
}
