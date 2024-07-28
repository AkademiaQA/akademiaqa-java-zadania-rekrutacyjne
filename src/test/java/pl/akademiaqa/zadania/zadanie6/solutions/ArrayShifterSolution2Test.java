package pl.akademiaqa.zadania.zadanie6.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArrayShifterSolution2Test {

    @Test
    void test_shift_left() {
        int[] array = {1, 2, 3, 4};
        ArrayShifterSolution2.shiftLeft(array);
        assertThat(array).containsExactly(2, 3, 4, 1);
    }

    @Test
    void test_shift_left_single_element() {
        int[] array = {1};
        assertThatThrownBy(() -> ArrayShifterSolution2.shiftLeft(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica musi zawierać co najmniej dwa elementy");
    }

    @Test
    void test_shift_left_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArrayShifterSolution2.shiftLeft(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica musi zawierać co najmniej dwa elementy");
    }

    @Test
    void test_shift_left_two_elements() {
        int[] array = {1, 2};
        ArrayShifterSolution2.shiftLeft(array);
        assertThat(array).containsExactly(2, 1);
    }

    @Test
    void test_shift_left_large_array() {
        int[] array = {10, 20, 30, 40, 50};
        ArrayShifterSolution2.shiftLeft(array);
        assertThat(array).containsExactly(20, 30, 40, 50, 10);
    }
}
