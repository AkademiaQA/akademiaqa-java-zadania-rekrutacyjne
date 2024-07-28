package pl.akademiaqa.zadania.zadanie1.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class ArrayCheckerSolution1Test {

    @Test
    void test_first_and_last_element_same() {
        int[] numbers = {1, 2, 3, 1};
        boolean result = ArrayCheckerSolution1.isFirstAndLastElementSame(numbers);
        assertThat(result).isTrue();
    }

    @Test
    void test_first_and_last_element_different() {
        int[] numbers = {1, 2, 3, 4};
        boolean result = ArrayCheckerSolution1.isFirstAndLastElementSame(numbers);
        assertThat(result).isFalse();
    }

    @Test
    void test_empty_array() {
        int[] numbers = {};
        assertThatThrownBy(() -> ArrayCheckerSolution1.isFirstAndLastElementSame(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być pusta");
    }

    @Test
    void test_null_array() {
        int[] numbers = null;
        assertThatThrownBy(() -> ArrayCheckerSolution1.isFirstAndLastElementSame(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być pusta");
    }

    @Test
    void test_single_element_array() {
        int[] numbers = {5};
        boolean result = ArrayCheckerSolution1.isFirstAndLastElementSame(numbers);
        assertThat(result).isTrue();
    }

    @Test
    void test_two_same_elements_array() {
        int[] numbers = {7, 7};
        boolean result = ArrayCheckerSolution1.isFirstAndLastElementSame(numbers);
        assertThat(result).isTrue();
    }

    @Test
    void test_two_different_elements_array() {
        int[] numbers = {7, 8};
        boolean result = ArrayCheckerSolution1.isFirstAndLastElementSame(numbers);
        assertThat(result).isFalse();
    }
}
