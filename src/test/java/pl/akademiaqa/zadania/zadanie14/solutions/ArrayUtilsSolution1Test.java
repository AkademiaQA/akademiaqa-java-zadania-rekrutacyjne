package pl.akademiaqa.zadania.zadanie14.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

class ArrayUtilsSolution1Test {

    @Test
    void test_find_pairs_with_sum_with_pairs() {
        int[] array = {1, 2, 3, 4, 5};
        int targetSum = 5;
        List<int[]> result = ArrayUtilsSolution1.findPairsWithSum(array, targetSum);
        assertThat(result).hasSize(2);
        assertThat(result).anyMatch(pair -> pair[0] == 1 && pair[1] == 4);
        assertThat(result).anyMatch(pair -> pair[0] == 2 && pair[1] == 3);
    }

    @Test
    void test_find_pairs_with_sum_with_no_pairs() {
        int[] array = {1, 2, 3};
        int targetSum = 7;
        List<int[]> result = ArrayUtilsSolution1.findPairsWithSum(array, targetSum);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_pairs_with_sum_with_duplicates() {
        int[] array = {1, 2, 2, 3, 3, 4};
        int targetSum = 5;
        List<int[]> result = ArrayUtilsSolution1.findPairsWithSum(array, targetSum);
        assertThat(result).hasSize(3);
        assertThat(result).anyMatch(pair -> pair[0] == 1 && pair[1] == 4);
        assertThat(result).anyMatch(pair -> pair[0] == 2 && pair[1] == 3);
    }

    @Test
    void test_find_pairs_with_sum_with_negative_numbers() {
        int[] array = {-1, -2, 3, 4, -3};
        int targetSum = 1;
        List<int[]> result = ArrayUtilsSolution1.findPairsWithSum(array, targetSum);
        assertThat(result).hasSize(2);
        assertThat(result).anyMatch(pair -> pair[0] == -2 && pair[1] == 3);
        assertThat(result).anyMatch(pair -> pair[0] == 4 && pair[1] == -3);
    }

    @Test
    void test_find_pairs_with_sum_with_single_element() {
        int[] array = {1};
        int targetSum = 2;
        List<int[]> result = ArrayUtilsSolution1.findPairsWithSum(array, targetSum);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_pairs_with_sum_with_empty_array() {
        int[] array = {};
        int targetSum = 1;
        List<int[]> result = ArrayUtilsSolution1.findPairsWithSum(array, targetSum);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_pairs_with_sum_with_null_array() {
        int[] array = null;
        int targetSum = 1;
        assertThatThrownBy(() -> ArrayUtilsSolution1.findPairsWithSum(array, targetSum))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablica nie może być null");
    }
}
