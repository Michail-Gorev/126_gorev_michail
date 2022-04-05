import org.junit.*;

public class Task3_Tests extends Assert {
    class TestComparator implements MyComparator<Integer>{
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void quickSort_UnsortedArrayWithThreeItems_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{3, 0, 1};

            QuickSort quickSort = new QuickSort();
            quickSort.sort(arr, new TestComparator());

            assertArrayEquals(new Integer[]{0, 1, 3}, arr);

        }
        catch (Exception e){
            fail();
        }
    }
    @Test
        public void quickSort_UnsortedArray1_GetSortedArray(){
            try {
                Integer[] arr = new Integer[]{1,2,3,4,5,4,3,2,1};
                QuickSort quickSort = new QuickSort();
                quickSort.sort(arr, new TestComparator());
                assertArrayEquals(new Integer[]{1,1,2,2,3,3,4,4,5}, arr);
            }catch (Exception e){
                fail();
            }
        }
    @Test
    public void quickSort_UnsortedArray_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{5, 4, 1, 3, 4};

            QuickSort quickSort = new QuickSort();
            quickSort.sort(arr, new TestComparator());

            assertArrayEquals(new Integer[]{1, 3, 4, 4, 5}, arr);

        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_UnsortedArrayWithThreeItems_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{2, 0, 1};

            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());

            assertArrayEquals(new Integer[]{0, 1, 2}, arr);

        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_UnsortedOnlyFirstThreeItems_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{2, 0, 1, 2, 3};

            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());

            assertArrayEquals(new Integer[]{0, 1, 2, 2, 3}, arr);

        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_UnsortedArray_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{2, 0, 3, 1, 2};

            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());

            assertArrayEquals(new Integer[]{0, 1, 2, 2, 3}, arr);

        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_AnotherUnsortedArray_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{4, 0, 3, 1, 0, 2};

            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());

            assertArrayEquals(new Integer[]{0, 0, 1, 2, 3, 4}, arr);

        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void mergeSort_FinalUnsortedArray_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{1,0,0,2,0,1,2,2};

            MergeSort mergeSort = new MergeSort();
            mergeSort.sort(arr, new TestComparator());

            assertArrayEquals(new Integer[]{0,0,0,1,1,2,2,2}, arr);

        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_ArrayContainsOnlySameNumbers_ArrayNotChanges(){
        try {
            Integer[] arr = new Integer[]{0, 0, 0};

            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());

            assertArrayEquals(new Integer[]{0, 0, 0}, arr);

        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_SortedArrayThreeItems_ArrayNotChanges(){
        try {
            Integer[] arr = new Integer[]{0, 1, 2};

            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());
            assertArrayEquals(new Integer[]{0, 1, 2}, arr);

        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_SortedArrayFiveItems_ArrayNotChanges(){
        try {
            Integer[] arr = new Integer[]{0, 1, 2, 3, 4};

            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());

            assertArrayEquals(new Integer[]{0, 1, 2, 3, 4}, arr);

        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_UnsortedArray_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{3,0,2,3,0,1};

            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());

            assertArrayEquals(new Integer[]{0,0,1,2,3,3}, arr);

        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void heapSort_AnotherUnsortedArray_ArrayIsSorted(){
        try {
            Integer[] arr = new Integer[]{10, 1, 1, 4, 7, 11, 6, 11, 4, 10};

            HeapSort heapSort = new HeapSort();
            heapSort.sort(arr, new TestComparator());

            assertArrayEquals(new Integer[]{1, 1, 4, 4, 6, 7, 10, 10, 11, 11}, arr);

        }
        catch (Exception e){
            fail();
        }
    }
}