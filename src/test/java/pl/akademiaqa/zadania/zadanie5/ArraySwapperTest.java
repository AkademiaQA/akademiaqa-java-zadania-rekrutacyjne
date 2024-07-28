package pl.akademiaqa.zadania.zadanie5;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArraySwapperTest {

    @Test
    void test_swap_first_and_last() {
        int[] array = {1, 2, 3, 4};
        ArraySwapper.swapFirstAndLast(array);
        assertThat(array).containsExactly(4, 2, 3, 1);
    }

    @Test
    void test_swap_single_element_array() {
        int[] array = {1};
        assertThatThrownBy(() -> ArraySwapper.swapFirstAndLast(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica musi zawierać co najmniej dwa elementy");
    }

    @Test
    void test_swap_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArraySwapper.swapFirstAndLast(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica musi zawierać co najmniej dwa elementy");
    }

    @Test
    void test_swap_two_elements_array() {
        int[] array = {1, 2};
        ArraySwapper.swapFirstAndLast(array);
        assertThat(array).containsExactly(2, 1);
    }

    @Test
    void test_swap_large_array() {
        int[] array = {10, 20, 30, 40, 50};
        ArraySwapper.swapFirstAndLast(array);
        assertThat(array).containsExactly(50, 20, 30, 40, 10);
    }
}
