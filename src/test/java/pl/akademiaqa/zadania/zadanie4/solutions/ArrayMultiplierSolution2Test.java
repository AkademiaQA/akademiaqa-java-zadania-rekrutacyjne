package pl.akademiaqa.zadania.zadanie4.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArrayMultiplierSolution2Test {

    @Test
    void test_multiply_corresponding_elements() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] result = ArrayMultiplierSolution2.multiplyCorrespondingElements(array1, array2);
        assertThat(result).containsExactly(4, 10, 18);
    }

    @Test
    void test_multiply_with_null_array1() {
        int[] array1 = null;
        int[] array2 = {4, 5, 6};
        assertThatThrownBy(() -> ArrayMultiplierSolution2.multiplyCorrespondingElements(array1, array2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablice nie mogą być null");
    }

    @Test
    void test_multiply_with_null_array2() {
        int[] array1 = {1, 2, 3};
        int[] array2 = null;
        assertThatThrownBy(() -> ArrayMultiplierSolution2.multiplyCorrespondingElements(array1, array2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablice nie mogą być null");
    }

    @Test
    void test_multiply_with_different_length_arrays() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5};
        assertThatThrownBy(() -> ArrayMultiplierSolution2.multiplyCorrespondingElements(array1, array2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablice muszą mieć taką samą długość");
    }

    @Test
    void test_multiply_with_empty_arrays() {
        int[] array1 = {};
        int[] array2 = {};
        int[] result = ArrayMultiplierSolution2.multiplyCorrespondingElements(array1, array2);
        assertThat(result).isEmpty();
    }

    @Test
    void test_multiply_with_single_element_arrays() {
        int[] array1 = {2};
        int[] array2 = {3};
        int[] result = ArrayMultiplierSolution2.multiplyCorrespondingElements(array1, array2);
        assertThat(result).containsExactly(6);
    }
}
