import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTest {
    @Test
    public void ordinaryTest() {
        int[] arr = {2, 1, 4, 3};
        int[] arrTest = {1, 2, 3, 4};
        Sort.sortArr(arr);
        Assertions.assertArrayEquals(arrTest, arr);
    }

    @Test
    public void orderedArrayTest() {
        int[] arr = {1, 2, 3, 4};
        int[] arrTest = {1, 2, 3, 4};
        Sort.sortArr(arr);
        Assertions.assertArrayEquals(arrTest, arr);
    }

    @Test
    public void oneSymbolTest() {
        int[] arr = {0};
        int[] arrTest = {0};
        Sort.sortArr(arr);
        Assertions.assertArrayEquals(arrTest, arr);
    }

    @Test
    public void emptyArrayTest() {
        int[] arr = {};
        int[] arrTest = {};
        Sort.sortArr(arr);
        Assertions.assertArrayEquals(arrTest, arr);
    }

    @Test
    public void intMaxTest() {
        int[] arr = {2147483647, -2147483648};
        int[] arrTest = {-2147483648, 2147483647};
        Sort.sortArr(arr);
        Assertions.assertArrayEquals(arrTest, arr);

    }

    @Test
    public void negativeValueTest() {
        int[] arr = {-3, 1, -1, 3, 2, -2, 0};
        int[] arrTest = {-3, -2, -1, 0, 1, 2, 3};
        Sort.sortArr(arr);
        Assertions.assertArrayEquals(arrTest, arr);
    }
    @Test
    public void reiterationSymbolTest() {
        int[] arr = {8, 8, 8};
        int[] arrTest = {8, 8, 8};
        Sort.sortArr(arr);
        Assertions.assertArrayEquals(arrTest, arr);
    }

}
