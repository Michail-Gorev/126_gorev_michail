import org.junit.*;

public class Task1_Tests extends Assert {

    private int getIntValue(ListNode<Integer> item) {
        return ((Node<Integer>) item).getData();
    }

    @Test
    public void crateList_CrateEmptyList_EmptyIsTrue() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void pushFront_PushFrontToEmptyList_EmptyIsFalse() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void pushFront_PushFrontToEmptyList_GetCrushGettingIndexOne() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(1);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    @Test
    public void pushItems_PushFrontThreeItems_FirstItemIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(0);
        list.pushFront(1);
        list.pushFront(2);
        assertEquals(0, getIntValue(list.get(0)));
    }

    @Test
    public void pushItems_PushFrontThreeItems_SecondItemIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(0);
        list.pushFront(1);
        list.pushFront(2);
        assertEquals(1, getIntValue(list.get(1)));
    }

    @Test
    public void pushItems_PushFrontThreeItems_ThirdItemIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(0);
        list.pushFront(1);
        list.pushFront(2);
        assertEquals(2, getIntValue(list.get(2)));
    }

    @Test
    public void pushItems_PushFrontThreeItems_HeadIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(0);
        list.pushFront(1);
        list.pushFront(2);
        assertEquals(0, getIntValue(list.getHead()));
    }

    @Test
    public void pushItems_PushFrontThreeItems_TailIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(0);
        list.pushFront(1);
        list.pushFront(2);
        assertEquals(2, getIntValue(list.getTail()));
    }

    @Test
    public void pushItems_PushBackThreeItems_FirstItemIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(2);
        list.pushBack(1);
        list.pushBack(0);
        assertEquals(0, getIntValue(list.get(0)));
    }

    @Test
    public void pushItems_PushBackThreeItems_SecondItemIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(2);
        list.pushBack(1);
        list.pushBack(0);
        assertEquals(1, getIntValue(list.get(1)));
    }

    @Test
    public void pushItems_PushBackThreeItems_ThirdItemIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(2);
        list.pushBack(1);
        list.pushBack(0);
        assertEquals(2, getIntValue(list.get(2)));
    }

    @Test
    public void removeItem_RemoveFirstItem_FirstItemIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(0);
        list.pushFront(1);
        list.pushFront(2);
        list.remove(list.get(0));
        assertEquals(1, getIntValue(list.get(0)));
    }

    @Test
    public void removeItem_RemoveFirstItem_HeadIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(0);
        list.pushFront(1);
        list.pushFront(2);
        list.remove(list.get(0));
        assertEquals(1, getIntValue(list.getHead()));
    }

    @Test
    public void removeItem_RemoveFirstItem_TailIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(0);
        list.pushFront(1);
        list.pushFront(2);
        list.remove(list.get(0));
        assertEquals(2, getIntValue(list.getTail()));
    }

    @Test
    public void removeItem_RemoveFirstItem_SizeIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(0);
        list.pushFront(1);
        list.pushFront(2);
        list.remove(list.get(0));
        assertEquals(2, list.getSize());
    }

    @Test
    public void insertList_insertListAfterFirstItem_SizeIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListAfter(list1.get(0), list2);
        assertEquals(7, list1.getSize());
    }

    @Test
    public void insertList_insertListAfterFirstItem_HeadIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListAfter(list1.get(0), list2);
        assertEquals(0, getIntValue(list1.getHead()));
    }

    @Test
    public void insertList_insertListAfterFirstItem_TailIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListAfter(list1.get(0), list2);
        assertEquals(2, getIntValue(list1.getTail()));
    }

    @Test
    public void insertList_insertListAfterFirstItem_AllItemsAreCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListAfter(list1.get(0), list2);

        assertEquals(0, getIntValue(list1.get(0)));
        assertEquals(10, getIntValue(list1.get(1)));
        assertEquals(11, getIntValue(list1.get(2)));
        assertEquals(12, getIntValue(list1.get(3)));
        assertEquals(13, getIntValue(list1.get(4)));
        assertEquals(1, getIntValue(list1.get(5)));
        assertEquals(2, getIntValue(list1.get(6)));
    }

    @Test
    public void insertList_insertListAfterSecondItem_AllItemsAreCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListAfter(list1.get(1), list2);

        assertEquals(0, getIntValue(list1.get(0)));
        assertEquals(1, getIntValue(list1.get(1)));
        assertEquals(10, getIntValue(list1.get(2)));
        assertEquals(11, getIntValue(list1.get(3)));
        assertEquals(12, getIntValue(list1.get(4)));
        assertEquals(13, getIntValue(list1.get(5)));
        assertEquals(2, getIntValue(list1.get(6)));
    }

    @Test
    public void insertList_insertListAfterThirdItem_AllItemsAreCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListAfter(list1.get(2), list2);

        assertEquals(0, getIntValue(list1.get(0)));
        assertEquals(1, getIntValue(list1.get(1)));
        assertEquals(2, getIntValue(list1.get(2)));
        assertEquals(10, getIntValue(list1.get(3)));
        assertEquals(11, getIntValue(list1.get(4)));
        assertEquals(12, getIntValue(list1.get(5)));
        assertEquals(13, getIntValue(list1.get(6)));
    }

    @Test
    public void insertList_insertListAfterThirdItem_HeadIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListAfter(list1.get(2), list2);

        assertEquals(0, getIntValue(list1.getHead()));
    }

    @Test
    public void insertList_insertListAfterThirdItem_TailIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListAfter(list1.get(2), list2);

        assertEquals(13, getIntValue(list1.getTail()));
    }

    @Test
    public void insertList_insertListBeforeFirstItem_SizeIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListBefore(list1.get(0), list2);

        assertEquals(7, list1.getSize());
    }

    @Test
    public void insertList_insertListBeforeFirstItem_AllItemsAreCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListBefore(list1.get(0), list2);

        assertEquals(10, getIntValue(list1.get(0)));
        assertEquals(11, getIntValue(list1.get(1)));
        assertEquals(12, getIntValue(list1.get(2)));
        assertEquals(13, getIntValue(list1.get(3)));
        assertEquals(0, getIntValue(list1.get(4)));
        assertEquals(1, getIntValue(list1.get(5)));
        assertEquals(2, getIntValue(list1.get(6)));
    }

    @Test
    public void insertList_insertListBeforeFirstItem_HeadIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListBefore(list1.get(0), list2);

        assertEquals(10, getIntValue(list1.getHead()));
    }

    @Test
    public void insertList_insertListBeforeFirstItem_TailIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListBefore(list1.get(0), list2);

        assertEquals(2, getIntValue(list1.getTail()));
    }


    @Test
    public void insertList_insertListBeforeSecondItem_AllItemsAreCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListBefore(list1.get(1), list2);

        assertEquals(0, getIntValue(list1.get(0)));
        assertEquals(10, getIntValue(list1.get(1)));
        assertEquals(11, getIntValue(list1.get(2)));
        assertEquals(12, getIntValue(list1.get(3)));
        assertEquals(13, getIntValue(list1.get(4)));
        assertEquals(1, getIntValue(list1.get(5)));
        assertEquals(2, getIntValue(list1.get(6)));
    }

    @Test
    public void insertList_insertListBeforeThirdItem_AllItemsAreCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListBefore(list1.get(2), list2);

        assertEquals(0, getIntValue(list1.get(0)));
        assertEquals(1, getIntValue(list1.get(1)));
        assertEquals(10, getIntValue(list1.get(2)));
        assertEquals(11, getIntValue(list1.get(3)));
        assertEquals(12, getIntValue(list1.get(4)));
        assertEquals(13, getIntValue(list1.get(5)));
        assertEquals(2, getIntValue(list1.get(6)));
    }

    @Test
    public void insertList_insertListBeforeThirdItem_HeadIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(13);

        list1.insertListBefore(list1.get(2), list2);

        assertEquals(0, getIntValue(list1.getHead()));
    }

    @Test
    public void insertList_insertListBeforeThirdItem_TailIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(0);
        list1.pushFront(1);
        list1.pushFront(2);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(10);
        list2.pushFront(11);
        list2.pushFront(12);
        list2.pushFront(12);

        list1.insertListBefore(list1.get(2), list2);

        assertEquals(2, getIntValue(list1.getTail()));
    }


    @Test
    public void createArray_CreateArrayWithSize_SizeIsCorrect() {
        DynamicArray<Integer> array = new DynamicArray<>(2048);

        assertEquals(2048, array.getSize());
    }

    @Test
    public void createArray_CreateArrayWithoutSize_SizeEqualsDefaultSize() {
        DynamicArray<Integer> array = new DynamicArray<>();

        assertEquals(1024, array.getSize());
    }

    @Test
    public void createArray_TryToGetValueOutOfRange_GetIndexOutOfBoundsException() {
        DynamicArray<Integer> array = new DynamicArray<>(2048);
        try {
            array.get(2048);
            fail();
        } catch (IndexOutOfBoundsException ex) {
            assertEquals("Index out of bounds", ex.getMessage());
        }
    }


    @Test
    public void setValues_SetThreeValues_ValuesAreCorrect() {
        DynamicArray<Integer> array = new DynamicArray<>(2048);
        array.set(0, 0);
        array.set(1, 1);
        array.set(2, 2);
        array.set(3, 3);

        assertEquals(0, array.get(0).intValue());
        assertEquals(1, array.get(1).intValue());
        assertEquals(2, array.get(2).intValue());
        assertEquals(3, array.get(3).intValue());
    }

    @Test
    public void changeSize_ChangeSizeArray_NewSizeIsCorrect() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>(10);
            array.resize(20);

            assertEquals(20, array.getSize());
        } catch (Exception ex) {
            fail();
        }
    }

    @Test
    public void insert_TryToInsertValueOutOfRange_GetIndexOutOfBoundsException() {
        DynamicArray<Integer> array = new DynamicArray<>(2048);
        try {
            array.insert(2048, 15);
            fail();
        } catch (IndexOutOfBoundsException ex) {
            assertEquals("Index out of bounds", ex.getMessage());
        }
    }

    @Test
    public void createArray_TryToSetValueOutOfRange_GetIndexOutOfBoundsException() {
        DynamicArray<Integer> array = new DynamicArray<>(2048);
        try {
            array.set(2048, 15);
            fail();
        } catch (IndexOutOfBoundsException ex) {
            assertEquals("Index out of bounds", ex.getMessage());
        }
    }

    @Test
    public void insert_InsertValue_ValuesAreCorrect() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        array.set(0, 0);
        array.set(1, 1);
        array.set(2, 2);
        array.set(3, 3);
        array.insert(1, 0);

        assertEquals(0, array.get(0).intValue());
        assertEquals(0, array.get(1).intValue());
        assertEquals(1, array.get(2).intValue());
        assertEquals(2, array.get(3).intValue());
    }

    @Test
    public void pushBack_pushBackValue_ValuesAreCorrect() {
        DynamicArray<Integer> array = new DynamicArray<>(2048);
        array.set(0, 0);
        array.set(1, 1);
        array.set(2, 2);
        array.pushBack(0);

        assertEquals(0, array.get(0).intValue());
        assertEquals(1, array.get(1).intValue());
        assertEquals(2, array.get(2).intValue());
        assertEquals(0, array.get(2048).intValue());
    }

    @Test
    public void popBack_popBackFromEmptyArray_GetUnsupportedOperationException() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>(0);
            array.popBack();
            fail();
        } catch (Exception e) {
            assertEquals("Array is empty", e.getMessage());
        }
    }

    @Test
    public void popBack_TryGetBackValue_GetException() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>(4);
            array.set(0, 0);
            array.set(1, 1);
            array.set(2, 2);
            array.set(3, 3);
            array.popBack();
            array.get(3);
            fail();
        } catch (Exception ex) {
            assertEquals("Index out of bounds", ex.getMessage());
        }
    }

    @Test
    public void remove_RemoveOneValue_ValuesAreCorrect() {
        DynamicArray<Integer> array = new DynamicArray<>(2048);
        array.set(0, 0);
        array.set(1, 1);
        array.set(2, 2);
        array.set(3, 3);
        array.remove(2);

        assertEquals(0, array.get(0).intValue());
        assertEquals(1, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());

    }


    @Test
    public void remove_TryRemoveIndexOutOfBounds_GetIndexOutOfBoundsException() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>(4);
            array.set(0, 0);
            array.set(1, 1);
            array.set(2, 2);
            array.set(3, 3);
            array.remove(4);
            fail();
        } catch (Exception ex) {
            assertEquals("Index out of bounds", ex.getMessage());
        }
    }
}
