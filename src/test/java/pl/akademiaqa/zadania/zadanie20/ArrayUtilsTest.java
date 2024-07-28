package pl.akademiaqa.zadania.zadanie20;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArrayUtilsTest {

    @Test
    void test_remove_target_and_greater_numbers_with_target_in_middle() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int target = 3;
        int[] result = ArrayUtils.removeTargetAndGreaterNumbers(array, target);
        assertThat(result).containsExactly(1, 2);
    }

    @Test
    void test_remove_target_and_greater_numbers_with_target_at_start() {
        int[] array = {3, 1, 2, 3, 4, 5, 6};
        int target = 3;
        int[] result = ArrayUtils.removeTargetAndGreaterNumbers(array, target);
        assertThat(result).containsExactly(1, 2);
    }

    @Test
    void test_remove_target_and_greater_numbers_with_target_at_end() {
        int[] array = {1, 2, 3};
        int target = 3;
        int[] result = ArrayUtils.removeTargetAndGreaterNumbers(array, target);
        assertThat(result).containsExactly(1, 2);
    }

    @Test
    void test_remove_target_and_greater_numbers_with_no_target() {
        int[] array = {1, 2, 4, 5, 6};
        int target = 3;
        int[] result = ArrayUtils.removeTargetAndGreaterNumbers(array, target);
        assertThat(result).containsExactly(1, 2, 4, 5, 6);
    }

    @Test
    void test_remove_target_and_greater_numbers_with_all_elements_same_as_target() {
        int[] array = {3, 3, 3};
        int target = 3;
        int[] result = ArrayUtils.removeTargetAndGreaterNumbers(array, target);
        assertThat(result).isEmpty();
    }

    @Test
    void test_remove_target_and_greater_numbers_with_null_array() {
        int[] array = null;
        assertThatThrownBy(() -> ArrayUtils.removeTargetAndGreaterNumbers(array, 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null");
    }

    @Test
    void test_remove_target_and_greater_numbers_with_empty_array() {
        int[] array = {};
        int[] result = ArrayUtils.removeTargetAndGreaterNumbers(array, 3);
        assertThat(result).isEmpty();
    }

    @Test
    void test_remove_target_and_greater_numbers_with_target_not_in_array() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 10;
        int[] result = ArrayUtils.removeTargetAndGreaterNumbers(array, target);
        assertThat(result).containsExactly(1, 2, 3, 4, 5);
    }
}
