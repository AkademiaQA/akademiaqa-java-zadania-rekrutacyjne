package pl.akademiaqa.zadania.zadanie3.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArrayCreatorSolution1Test {

    @Test
    void test_create_array_from_first_and_last() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] result = ArrayCreatorSolution1.createArrayFromFirstAndLast(array1, array2);
        assertThat(result).containsExactly(1, 6);
    }

    @Test
    void test_create_array_with_empty_array1() {
        int[] array1 = {};
        int[] array2 = {4, 5, 6};
        assertThatThrownBy(() -> ArrayCreatorSolution1.createArrayFromFirstAndLast(array1, array2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablice nie mogą być puste");
    }

    @Test
    void test_create_array_with_empty_array2() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {};
        assertThatThrownBy(() -> ArrayCreatorSolution1.createArrayFromFirstAndLast(array1, array2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablice nie mogą być puste");
    }

    @Test
    void test_create_array_with_null_array1() {
        int[] array1 = null;
        int[] array2 = {4, 5, 6};
        assertThatThrownBy(() -> ArrayCreatorSolution1.createArrayFromFirstAndLast(array1, array2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablice nie mogą być puste");
    }

    @Test
    void test_create_array_with_null_array2() {
        int[] array1 = {1, 2, 3};
        int[] array2 = null;
        assertThatThrownBy(() -> ArrayCreatorSolution1.createArrayFromFirstAndLast(array1, array2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablice nie mogą być puste");
    }

    @Test
    void test_create_array_with_single_element_arrays() {
        int[] array1 = {1};
        int[] array2 = {6};
        int[] result = ArrayCreatorSolution1.createArrayFromFirstAndLast(array1, array2);
        assertThat(result).containsExactly(1, 6);
    }
}
