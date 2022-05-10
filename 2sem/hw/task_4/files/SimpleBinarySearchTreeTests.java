import org.junit.*;

public class SimpleBinarySearchTreeTests extends Assert {
    class Comparator implements MyComparator<Integer> {
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }
    @Test
    public void creation_NewTree_SizeEqualsZero() {
        BinarySearchTree<Integer> tree = new AVLTree<>(new Comparator());
        assertEquals(0, tree.size());
    }
    @Test
    public void min_InsertAscendingThreeItems_ReturnMin() {
        BinarySearchTree<Integer> tree = new AVLTree<>(new Comparator());
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        assertEquals(2, tree.min().intValue());
    }
    @Test
    public void min_InsertDescendingThreeItems_ReturnMin() {
        BinarySearchTree<Integer> tree = new RBTree<>(new Comparator());
        tree.insert(6);
        tree.insert(4);
        tree.insert(2);
        assertEquals(2, tree.min().intValue());
    }
    @Test
    public void min_InsertUnorderedFourItems_ReturnMin() {
        BinarySearchTree<Integer> tree = new RBTree<>(new Comparator());
        tree.insert(4);
        tree.insert(6);
        tree.insert(2);
        tree.insert(8);
        assertEquals(2, tree.min().intValue());
    }
    @Test
    public void getOrderedItems_InsertUnorderedFourItems_ReturnCorrectOrder() {
        BinarySearchTree<Integer> tree = new RBTree<>(new Comparator());
        tree.insert(4);
        tree.insert(6);
        tree.insert(2);
        tree.insert(8);
        assertArrayEquals(new Integer[] {2, 4, 6, 8}, tree.getOrderedItems().toArray());
    }

    @Test
    public void delete_DeleteOnlyOneElement_TreeIsEmpty() {
        BinarySearchTree<Integer> tree = new AVLTree<>(new Comparator());
        tree.insert(4);
        tree.delete(4);
        assertArrayEquals(new Integer[] {}, tree.getOrderedItems().toArray());
        assertEquals(true, tree.isEmpty());
    }
    @Test
    public void delete_DeleteHalfElements_TreeStructureIsCorrect() {
        BinarySearchTree<Integer> tree = new RBTree<>(new Comparator());
        tree.insert(4);
        tree.insert(1);
        tree.insert(5);
        tree.insert(8);
        tree.insert(0);
        tree.insert(-1);

        tree.delete(4);
        tree.delete(8);
        tree.delete(0);

        assertArrayEquals(new Integer[] {-1, 1, 5}, tree.getOrderedItems().toArray());
        assertEquals(3, tree.size());
    }

    @Test
    public void insert_TreeStructureIsCorrect() {
        BinarySearchTree<Integer> tree = new RBTree<>(new Comparator());
        tree.insert(5);
        tree.insert(53);
        tree.insert(32);

        assertArrayEquals(new Integer[] {5, 32, 53}, tree.getOrderedItems().toArray());
        assertEquals(3, tree.size());
    }

    @Test
    public void S_1() {
        BinarySearchTree<Integer> tree = new SimpleBinarySearchTree<>(new Comparator());
        tree.insert(15);
        tree.insert(11);
        tree.insert(98);
        tree.insert(48);
        tree.insert(63);
        tree.insert(50);
        tree.insert(75);
        tree.insert(44);
        tree.insert(50);
        tree.insert(78);
        tree.insert(5);
        tree.insert(99);

        System.out.println(tree);
    }
    @Test
    public void S_2() {
        BinarySearchTree<Integer> tree = new SimpleBinarySearchTree<>(new Comparator());
        tree.insert(30);
        tree.insert(83);
        tree.insert(37);
        tree.insert(60);
        tree.insert(40);
        tree.insert(70);
        tree.insert(39);
        tree.insert(54);
        tree.insert(95);
        tree.insert(26);
        tree.insert(76);
        tree.insert(78);
        tree.insert(48);
        tree.insert(75);
        tree.insert(41);

        tree.delete(39);
        tree.delete(48);
        tree.delete(54);
        tree.delete(40);
        tree.delete(26);

        System.out.println(tree);
    }

    @Test
    public void S_3() {
        BinarySearchTree<Integer> tree = new SimpleBinarySearchTree<>(new Comparator());
        tree.insert(78);
        tree.insert(92);
        tree.insert(51);
        tree.insert(11);
        tree.insert(21);
        tree.insert(82);
        tree.insert(9);
        tree.insert(34);
        tree.insert(47);
        tree.insert(83);
        tree.insert(40);
        tree.insert(49);
        tree.delete(51);
        tree.delete(34);
        tree.delete(9);
        tree.insert(57);
        tree.insert(3);
        tree.insert(33);
        tree.delete(57);
        tree.delete(40);
        tree.insert(3);
        tree.insert(64);
        tree.insert(91);
        tree.delete(47);
        tree.delete(82);
        tree.delete(3);
        tree.delete(91);
        tree.delete(83);

        System.out.println(tree);
    }

    @Test
    public void AVL_1() {
        BinarySearchTree<Integer> tree = new AVLTree<>(new Comparator());
        tree.insert(57);
        tree.insert(33);
        tree.insert(6);
        tree.insert(49);
        tree.insert(94);
        tree.insert(16);
        tree.insert(70);
        tree.insert(2);
        tree.insert(14);
        tree.insert(66);
        tree.insert(35);
        tree.insert(97);

        System.out.println(tree);
    }

    @Test
    public void AVL_2() {
        BinarySearchTree<Integer> tree = new AVLTree<>(new Comparator());
        tree.insert(30);
        tree.insert(10);
        tree.insert(30);
        tree.insert(2);
        tree.insert(97);
        tree.insert(8);
        tree.insert(72);
        tree.insert(88);
        tree.insert(79);
        tree.insert(32);
        tree.insert(68);
        tree.insert(81);
        tree.insert(47);
        tree.insert(18);
        tree.insert(74);

        tree.delete(47);
        tree.delete(18);
        tree.delete(88);
        tree.delete(10);
        tree.delete(72);

        System.out.println(tree);
    }

    @Test
    public void AVL_3() {
        BinarySearchTree<Integer> tree = new AVLTree<>(new Comparator());
        tree.insert(62);
        tree.insert(4);
        tree.insert(47);
        tree.insert(42);
        tree.insert(10);
        tree.insert(76);
        tree.insert(99);
        tree.insert(37);
        tree.insert(22);
        tree.insert(40);
        tree.insert(98);
        tree.insert(80);
        tree.delete(80);
        tree.delete(40);
        tree.delete(10);
        tree.insert(20);
        tree.insert(98);
        tree.insert(4);
        tree.delete(22);
        tree.delete(4);
        tree.insert(84);
        tree.insert(43);
        tree.insert(37);
        tree.delete(20);
        tree.delete(37);
        tree.delete(42);
        tree.delete(76);
        tree.delete(43);

        System.out.println();
    }

    @Test
    public void RB_1() {
        BinarySearchTree<Integer> tree = new RBTree<>(new Comparator());
        tree.insert(28);
        tree.insert(59);
        tree.insert(75);
        tree.insert(38);
        tree.insert(32);
        tree.insert(91);
        tree.insert(7);
        tree.insert(5);
        tree.insert(41);
        tree.insert(77);
        tree.insert(22);
        tree.insert(43);

        System.out.println();
    }

    @Test
    public void RB_2() {
        BinarySearchTree<Integer> tree = new RBTree<>(new Comparator());
        tree.insert(16);
        tree.insert(59);
        tree.insert(46);
        tree.insert(56);
        tree.insert(84);
        tree.insert(27);
        tree.insert(20);
        tree.insert(1);
        tree.insert(41);
        tree.insert(83);
        tree.insert(84);
        tree.insert(43);
        tree.insert(55);
        tree.insert(75);
        tree.insert(95);
        tree.delete(83);
        tree.delete(56);
        tree.delete(55);
        tree.delete(43);
        tree.delete(84);

        System.out.println(tree);
    }

    @Test
    public void RB_3() {
        BinarySearchTree<Integer> tree = new RBTree<>(new Comparator());
        tree.insert(74);
        tree.insert(2);
        tree.insert(10);
        tree.insert(30);
        tree.insert(19);
        tree.insert(96);
        tree.insert(50);
        tree.insert(29);
        tree.insert(15);
        tree.insert(55);
        tree.insert(41);
        tree.insert(14);
        tree.delete(15);
        tree.delete(2);
        tree.delete(41);
        tree.insert(25);
        tree.insert(81);
        tree.insert(76);
        tree.delete(50);
        tree.delete(55);
        tree.insert(43);
        tree.insert(32);
        tree.insert(43);
        tree.delete(29);
        tree.delete(14);
        tree.delete(43);
        tree.delete(96);
        tree.delete(81);

        System.out.println(tree);
    }
}
