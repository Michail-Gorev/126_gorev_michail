import org.junit.*;

public class Task3_Tests extends Assert {
    class TestComparator implements MyComparator<Integer>{
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void quickSort_UnsortedArrayWithLengthTwo_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{1,0};
            QuickSort quickSort = new QuickSort();
            quickSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{0, 1}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void quickSort_UnsortedArray1_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{1,2,3,4,5,4,3,2,1};
            QuickSort quickSort = new QuickSort();
            quickSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1,1,2,2,3,3,4,4,5}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void quickSort_UnsortedArray2_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{1,3,2,6,4,2,6,3,5,1,2,2,2,5,4,3,1};
            QuickSort quickSort = new QuickSort();
            quickSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1,1,1,2,2,2,2,2,3,3,3,4,4,5,5,6,6}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_UnsortedArrayWithLengthTwo_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{2,1};
            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1, 2}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_UnsortedOnlyFirstTwoElements_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{2,1,2,3};
            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1, 2,2,3}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_UnsortedArray1_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{2,1,3,1};
            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1, 1,2,3}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_UnsortedArray2_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{3,1,0,1};
            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{0, 1,1,3}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_UnsortedArray3_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{0,0,1,2,2,1,0,2};
            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{0,0,0,1,1,2,2,2}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_ArrayContainsOnlySameNumbers_NoChanges(){
        try {
            Integer[] arr = new Integer[]{0,0,0};
            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{0,0,0}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_SortedArrayLengthTwo_NoChanges(){
        try {
            Integer[] arr = new Integer[]{1,2};
            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1,2}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_SortedArrayLengthThree_NoChanges(){
        try {
            Integer[] arr = new Integer[]{1,2,3};
            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1,2,3}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_UnsortedArray1_NoChanges(){
        try {
            Integer[] arr = new Integer[]{6,0,3,2,0,6};
            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{0,0,2,3,6,6}, arr);
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_UnsortedArray2_NoChanges(){
        try {
            Integer[] arr = new Integer[]{5,4,1,2,1,2,6,3,4,1,8,6};
            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{1,1,1,2,2,3,4,4,5,6,6,8}, arr);
        }
        catch (Exception e){
            fail();
        }
    }
}