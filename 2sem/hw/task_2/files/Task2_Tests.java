import org.junit.*;

public class Task2_Tests extends Assert{
    class TComparator implements MyComparator<Integer>{
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }
    @Test
    public void bubbleSort_ArrayContainsOnlySameNumbers_ArrayNotChanges(){
        try {
            BubbleSort<Integer> bubbleSort = new BubbleSort<>();
            Integer[] arr = {0, 0, 0, 0, 0};

            bubbleSort.sort(arr, new TComparator());

            assertArrayEquals(new Integer[]{0, 0, 0, 0, 0}, arr);
        }
        catch (Exception e){
            fail();
        }
    }
    @Test
    public void bubbleSort_InvertedArrayWithRightBiggestItem_ArrayIsSorted(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] arr = {10, 15, 89, 0, 98};

        bubbleSort.sort(arr, new TComparator());

        assertArrayEquals(new Integer[]{0, 10, 15, 89, 98}, arr);
    }
    @Test
    public void bubbleSort_InvertedArray_ArrayIsSorted(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] arr = {10, 5, 1};

        bubbleSort.sort(arr, new TComparator());

        assertArrayEquals(new Integer[]{1, 5, 10}, arr);
    }
    @Test
    public void bubbleSort_UnsortedArray_ArrayIsSorted(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] arr = {5,3,4,1};

        bubbleSort.sort(arr, new TComparator());

        assertArrayEquals(new Integer[]{1, 3, 4, 5}, arr);
    }
    @Test
    public void selectionSort_InvertedArrayThreeItems_ArrayIsSorted(){
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        Integer[] arr = {5, 4, 3};

        selectionSort.sort(arr, new TComparator());

        assertArrayEquals(new Integer[]{3, 4, 5}, arr);
    }
    @Test
    public void selectionSort_UnsortedArray_ArrayIsSorted(){
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        Integer[] arr = {5, 4, 10, 1};

        selectionSort.sort(arr, new TComparator());

        assertArrayEquals(new Integer[]{1, 4, 5, 10}, arr);
    }
    @Test
    public void insertionSort_ArrayContainsOnlySameNumbers_ArrayNotChanges(){
        try {
            InsertionSort<Integer> insertionSort = new InsertionSort<>();
            Integer[] arr = {0, 0, 0, 0};

            insertionSort.sort(arr, new TComparator());

            assertArrayEquals(new Integer[]{0, 0, 0, 0}, arr);
        }
        catch (Exception e){
            fail();
        }
    }
    @Test
    public void insertionSort_SortedArray_ArrayHasNotChanged(){
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        Integer[] arr = {0, 3, 5, 10};

        insertionSort.sort(arr, new TComparator());

        assertArrayEquals(new Integer[]{0, 3, 5, 10}, arr);
    }
}