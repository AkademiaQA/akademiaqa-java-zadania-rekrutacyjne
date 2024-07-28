package pl.akademiaqa.zadania.zadanie16.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArrayUtilsSolution2Test {

    @Test
    void test_sum_of_every_third_element_equal_to_ten_with_sum_equal_to_ten() {
        int[] array = {1, 2, 7, 4, 5, 3, 1};
        boolean result = ArrayUtilsSolution2.isSumOfEveryThirdElementEqualToTen(array);
        assertThat(result).isTrue();
    }

    @Test
    void test_sum_of_every_third_element_equal_to_ten_with_sum_not_equal_to_ten() {
        int[] array = {1, 2, 6, 4, 5, 2, 1};
        boolean result = ArrayUtilsSolution2.isSumOfEveryThirdElementEqualToTen(array);
        assertThat(result).isFalse();
    }

    @Test
    void test_sum_of_every_third_element_equal_to_ten_with_no_third_element() {
        int[] array = {1, 2};
        boolean result = ArrayUtilsSolution2.isSumOfEveryThirdElementEqualToTen(array);
        assertThat(result).isFalse();
    }

    @Test
    void test_sum_of_every_third_element_equal_to_ten_with_empty_array() {
        int[] array = {};
        boolean result = ArrayUtilsSolution2.isSumOfEveryThirdElementEqualToTen(array);
        assertThat(result).isFalse();
    }

    @Test
    void test_sum_of_every_third_element_equal_to_ten_with_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArrayUtilsSolution2.isSumOfEveryThirdElementEqualToTen(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null");
    }

    @Test
    void test_sum_of_every_third_element_equal_to_ten_with_negative_numbers() {
        int[] array = {1, -1, 6, 4, 5, -1, 5, 5, 5};
        boolean result = ArrayUtilsSolution2.isSumOfEveryThirdElementEqualToTen(array);
        assertThat(result).isTrue();
    }
}
