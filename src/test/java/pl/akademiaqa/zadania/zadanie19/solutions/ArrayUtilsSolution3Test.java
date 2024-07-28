package pl.akademiaqa.zadania.zadanie19.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArrayUtilsSolution3Test {

    @Test
    void test_find_most_frequent_element_with_multiple_elements() {
        int[] array = {1, 3, 2, 1, 4, 1, 3, 2, 1};
        int result = ArrayUtilsSolution3.findMostFrequentElement(array);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void test_find_most_frequent_element_with_all_same_elements() {
        int[] array = {2, 2, 2, 2};
        int result = ArrayUtilsSolution3.findMostFrequentElement(array);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void test_find_most_frequent_element_with_no_repetition() {
        int[] array = {1, 2, 3, 4, 5};
        int result = ArrayUtilsSolution3.findMostFrequentElement(array);
        assertThat(result).isEqualTo(1); // the first element in case of no repetition
    }

    @Test
    void test_find_most_frequent_element_with_empty_array() {
        int[] array = {};
        assertThatThrownBy(() -> ArrayUtilsSolution3.findMostFrequentElement(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null lub pusta");
    }

    @Test
    void test_find_most_frequent_element_with_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArrayUtilsSolution3.findMostFrequentElement(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null lub pusta");
    }

    @Test
    void test_find_most_frequent_element_with_negative_numbers() {
        int[] array = {-1, -2, -1, -3, -1, -4, -1};
        int result = ArrayUtilsSolution3.findMostFrequentElement(array);
        assertThat(result).isEqualTo(-1);
    }
}
