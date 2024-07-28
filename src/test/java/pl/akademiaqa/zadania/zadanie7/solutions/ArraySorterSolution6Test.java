package pl.akademiaqa.zadania.zadanie7.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArraySorterSolution6Test {

    @Test
    void test_sort_array() {
        int[] array = {4, 3, 2, 1};
        ArraySorterSolution6.sortArray(array);
        assertThat(array).containsExactly(1, 2, 3, 4);
    }

    @Test
    void test_sort_already_sorted_array() {
        int[] array = {1, 2, 3, 4};
        ArraySorterSolution6.sortArray(array);
        assertThat(array).containsExactly(1, 2, 3, 4);
    }

    @Test
    void test_sort_empty_array() {
        int[] array = {};
        ArraySorterSolution6.sortArray(array);
        assertThat(array).isEmpty();
    }

    @Test
    void test_sort_single_element_array() {
        int[] array = {1};
        ArraySorterSolution6.sortArray(array);
        assertThat(array).containsExactly(1);
    }

    @Test
    void test_sort_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArraySorterSolution6.sortArray(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null");
    }

    @Test
    void test_sort_array_with_duplicates() {
        int[] array = {4, 2, 2, 3, 1};
        ArraySorterSolution6.sortArray(array);
        assertThat(array).containsExactly(1, 2, 2, 3, 4);
    }

    @Test
    void test_sort_large_array() {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        ArraySorterSolution6.sortArray(array);
        assertThat(array).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
