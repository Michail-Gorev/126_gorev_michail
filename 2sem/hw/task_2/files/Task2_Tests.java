import org.junit.*;

public class Task2_Tests extends Assert{
    class TestComparator implements MyComparator<Integer>{
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void bubbleSort_ArrayContainsOnlySameNumbers_NoChanges(){
        try {
            BubbleSort<Integer> bubbleSort = new BubbleSort<>();
            Integer[] arr = {0, 0, 0};
            bubbleSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{0, 0, 0}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void bubbleSort_InvertedArrayWithTheSameLastBiggestItem_ArrayIsSorted(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] arr = {3, 2, 1, 4};
        bubbleSort.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 4}, arr);
    }

    @Test
    public void bubbleSort_InvertedArray_ArrayIsSorted(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] arr = {3, 2, 1};
        bubbleSort.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, arr);
    }

    @Test
    public void bubbleSort_UnsortedArray_ArrayIsSorted(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] arr = {15,23,5,0};
        bubbleSort.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{0, 5, 15, 23}, arr);
    }

    @Test
    public void selectionSort_InvertedArrayLengthTwo_ArrayIsSorted(){
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        Integer[] arr = {1, 0};
        selectionSort.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{0, 1}, arr);
    }

    @Test
    public void selectionSort_UnsortedArray_ArrayIsSorted(){
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        Integer[] arr = {1, 0, 5, 34};
        selectionSort.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{0, 1, 5, 34}, arr);
    }

    @Test
    public void insertionSort_ArrayContainsOnlySameNumbers_NoChanges(){
        try {
            InsertionSort<Integer> insertionSort = new InsertionSort<>();
            Integer[] arr = {10, 10};
            insertionSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{10, 10}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void insertionSort_SortedArray_NoChanges(){
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        Integer[] arr = {1,2};
        insertionSort.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{1,2}, arr);
    }
}