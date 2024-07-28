package pl.akademiaqa.zadania.zadanie8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArraySumTest {

    @Test
    void test_sum_array() {
        int[] array = {1, 2, 3, 4};
        int result = ArraySum.sumArray(array);
        assertThat(result).isEqualTo(10);
    }

    @Test
    void test_sum_empty_array() {
        int[] array = {};
        int result = ArraySum.sumArray(array);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void test_sum_single_element_array() {
        int[] array = {5};
        int result = ArraySum.sumArray(array);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void test_sum_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArraySum.sumArray(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null");
    }

    @Test
    void test_sum_array_with_negative_numbers() {
        int[] array = {-1, -2, -3, -4};
        int result = ArraySum.sumArray(array);
        assertThat(result).isEqualTo(-10);
    }

    @Test
    void test_sum_array_with_mixed_numbers() {
        int[] array = {-1, 2, -3, 4};
        int result = ArraySum.sumArray(array);
        assertThat(result).isEqualTo(2);
    }
}
