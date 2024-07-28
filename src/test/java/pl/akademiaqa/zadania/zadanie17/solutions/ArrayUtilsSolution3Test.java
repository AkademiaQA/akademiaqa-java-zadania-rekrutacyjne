package pl.akademiaqa.zadania.zadanie17.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArrayUtilsSolution3Test {

    @Test
    void test_contains_two_elements_with_both_elements_present() {
        int[] array = {1, 2, 3, 4, 5};
        boolean result = ArrayUtilsSolution3.containsTwoElements(array, 2, 4);
        assertThat(result).isTrue();
    }

    @Test
    void test_contains_two_elements_with_one_element_missing() {
        int[] array = {1, 2, 3, 4, 5};
        boolean result = ArrayUtilsSolution3.containsTwoElements(array, 2, 6);
        assertThat(result).isFalse();
    }

    @Test
    void test_contains_two_elements_with_both_elements_missing() {
        int[] array = {1, 2, 3, 4, 5};
        boolean result = ArrayUtilsSolution3.containsTwoElements(array, 6, 7);
        assertThat(result).isFalse();
    }

    @Test
    void test_contains_two_elements_with_empty_array() {
        int[] array = {};
        boolean result = ArrayUtilsSolution3.containsTwoElements(array, 1, 2);
        assertThat(result).isFalse();
    }

    @Test
    void test_contains_two_elements_with_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArrayUtilsSolution3.containsTwoElements(array, 1, 2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null");
    }

    @Test
    void test_contains_two_elements_with_duplicates() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        boolean result = ArrayUtilsSolution3.containsTwoElements(array, 2, 4);
        assertThat(result).isTrue();
    }
}
