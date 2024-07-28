package pl.akademiaqa.zadania.zadanie9.solutions;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ArrayUtilsSolution1Test {

    @Test
    void test_remove_element_present_multiple_times() {
        int[] array = {1, 2, 3, 2, 4, 2, 5};
        int[] result = ArrayUtilsSolution1.removeElement(array, 2);
        assertThat(result).containsExactly(1, 3, 4, 5);
    }

    @Test
    void test_remove_element_present_once() {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = ArrayUtilsSolution1.removeElement(array, 3);
        assertThat(result).containsExactly(1, 2, 4, 5);
    }

    @Test
    void test_remove_element_not_present() {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = ArrayUtilsSolution1.removeElement(array, 6);
        assertThat(result).containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    void test_remove_element_from_empty_array() {
        int[] array = {};
        int[] result = ArrayUtilsSolution1.removeElement(array, 1);
        assertThat(result).isEmpty();
    }

    @Test
    void test_remove_element_from_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArrayUtilsSolution1.removeElement(array, 1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null");
    }

    @Test
    void test_remove_all_elements() {
        int[] array = {2, 2, 2, 2};
        int[] result = ArrayUtilsSolution1.removeElement(array, 2);
        assertThat(result).isEmpty();
    }

    @Test
    void test_remove_element_with_mixed_numbers() {
        int[] array = {-1, 2, -3, 2, 4, 2, -5};
        int[] result = ArrayUtilsSolution1.removeElement(array, 2);
        assertThat(result).containsExactly(-1, -3, 4, -5);
    }
}
