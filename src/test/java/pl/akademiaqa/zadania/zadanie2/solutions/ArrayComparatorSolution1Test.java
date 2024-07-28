package pl.akademiaqa.zadania.zadanie2.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArrayComparatorSolution1Test {

    @Test
    void test_first_and_last_elements_equal() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 4, 3};
        boolean result = ArrayComparatorSolution1.areFirstAndLastElementsEqual(array1, array2);
        assertThat(result).isTrue();
    }

    @Test
    void test_first_elements_not_equal() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {0, 4, 3};
        boolean result = ArrayComparatorSolution1.areFirstAndLastElementsEqual(array1, array2);
        assertThat(result).isFalse();
    }

    @Test
    void test_last_elements_not_equal() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 4, 4};
        boolean result = ArrayComparatorSolution1.areFirstAndLastElementsEqual(array1, array2);
        assertThat(result).isFalse();
    }

    @Test
    void test_both_elements_not_equal() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {0, 4, 4};
        boolean result = ArrayComparatorSolution1.areFirstAndLastElementsEqual(array1, array2);
        assertThat(result).isFalse();
    }

    @Test
    void test_empty_array1() {
        int[] array1 = {};
        int[] array2 = {1, 4, 3};
        assertThatThrownBy(() -> ArrayComparatorSolution1.areFirstAndLastElementsEqual(array1, array2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablice nie mogą być puste");
    }

    @Test
    void test_empty_array2() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {};
        assertThatThrownBy(() -> ArrayComparatorSolution1.areFirstAndLastElementsEqual(array1, array2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablice nie mogą być puste");
    }

    @Test
    void test_null_array1() {
        int[] array1 = null;
        int[] array2 = {1, 4, 3};
        assertThatThrownBy(() -> ArrayComparatorSolution1.areFirstAndLastElementsEqual(array1, array2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablice nie mogą być puste");
    }

    @Test
    void test_null_array2() {
        int[] array1 = {1, 2, 3};
        int[] array2 = null;
        assertThatThrownBy(() -> ArrayComparatorSolution1.areFirstAndLastElementsEqual(array1, array2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablice nie mogą być puste");
    }

    @Test
    void test_single_element_arrays_equal() {
        int[] array1 = {1};
        int[] array2 = {1};
        boolean result = ArrayComparatorSolution1.areFirstAndLastElementsEqual(array1, array2);
        assertThat(result).isTrue();
    }

    @Test
    void test_single_element_arrays_not_equal() {
        int[] array1 = {1};
        int[] array2 = {2};
        boolean result = ArrayComparatorSolution1.areFirstAndLastElementsEqual(array1, array2);
        assertThat(result).isFalse();
    }
}
