package pl.akademiaqa.zadania.zadanie21.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArrayUtilsSolution3Test {

    @Test
    void test_segregate_zeros_and_ones_with_mixed_values() {
        int[] array = {0, 1, 0, 1, 1, 0, 1, 0};
        ArrayUtilsSolution3.segregateZerosAndOnes(array);
        assertThat(array).containsExactly(0, 0, 0, 0, 1, 1, 1, 1);
    }

    @Test
    void test_segregate_zeros_and_ones_with_all_zeros() {
        int[] array = {0, 0, 0, 0};
        ArrayUtilsSolution3.segregateZerosAndOnes(array);
        assertThat(array).containsExactly(0, 0, 0, 0);
    }

    @Test
    void test_segregate_zeros_and_ones_with_all_ones() {
        int[] array = {1, 1, 1, 1};
        ArrayUtilsSolution3.segregateZerosAndOnes(array);
        assertThat(array).containsExactly(1, 1, 1, 1);
    }

    @Test
    void test_segregate_zeros_and_ones_with_empty_array() {
        int[] array = {};
        ArrayUtilsSolution3.segregateZerosAndOnes(array);
        assertThat(array).isEmpty();
    }

    @Test
    void test_segregate_zeros_and_ones_with_single_zero() {
        int[] array = {0};
        ArrayUtilsSolution3.segregateZerosAndOnes(array);
        assertThat(array).containsExactly(0);
    }

    @Test
    void test_segregate_zeros_and_ones_with_single_one() {
        int[] array = {1};
        ArrayUtilsSolution3.segregateZerosAndOnes(array);
        assertThat(array).containsExactly(1);
    }

    @Test
    void test_segregate_zeros_and_ones_with_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArrayUtilsSolution3.segregateZerosAndOnes(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null");
    }
}
