package pl.akademiaqa.zadania.zadanie13;

import org.junit.jupiter.api.Test;
import pl.akademiaqa.zadania.zadanie13.solutions.ArrayUtilsSolution1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArrayUtilsTest {

    @Test
    void test_find_second_largest_with_distinct_elements() {
        int[] array = {1, 2, 3, 4, 5};
        int result = ArrayUtils.findSecondLargest(array);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void test_find_second_largest_with_duplicates() {
        int[] array = {5, 5, 4, 4, 3, 3};
        int result = ArrayUtils.findSecondLargest(array);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void test_find_second_largest_with_negative_numbers() {
        int[] array = {-10, -20, -30, -40, -50};
        int result = ArrayUtils.findSecondLargest(array);
        assertThat(result).isEqualTo(-20);
    }

    @Test
    void test_find_second_largest_with_mixed_numbers() {
        int[] array = {-1, 3, 5, -2, 0};
        int result = ArrayUtils.findSecondLargest(array);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void test_find_second_largest_with_two_elements() {
        int[] array = {1, 2};
        int result = ArrayUtils.findSecondLargest(array);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void test_find_second_largest_with_identical_elements() {
        int[] array = {1, 1, 1, 1};
        assertThatThrownBy(() -> ArrayUtils.findSecondLargest(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica musi zawierać co najmniej dwa unikalne elementy");
    }

    @Test
    void test_find_second_largest_with_single_element() {
        int[] array = {1};
        assertThatThrownBy(() -> ArrayUtils.findSecondLargest(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null i musi zawierać co najmniej dwa elementy");
    }

    @Test
    void test_find_second_largest_with_empty_array() {
        int[] array = {};
        assertThatThrownBy(() -> ArrayUtils.findSecondLargest(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null i musi zawierać co najmniej dwa elementy");
    }

    @Test
    void test_find_second_largest_with_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArrayUtils.findSecondLargest(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null i musi zawierać co najmniej dwa elementy");
    }
}
