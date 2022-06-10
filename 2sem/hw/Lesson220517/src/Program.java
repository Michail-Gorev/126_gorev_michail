public class Program {

    public static void main(String[] args) {
        //B1();
        B2();
       // B3();
    }



    private static void B2() {
        BTree tree = new BTree(3);
        tree.insert(76);
        tree.insert(37);
        tree.insert(97);
        tree.insert(43);
        tree.insert(42);
        tree.insert(86);
        tree.insert(14);
        tree.insert(51);
        tree.insert(44);
        tree.insert(44);
        tree.insert(22);
        tree.insert(60);
        tree.insert(58);
        tree.insert(39);
        tree.insert(33);
        tree.remove(37);
        tree.remove(43);
        tree.remove(22);
        tree.remove(14);
        tree.remove(42);
        tree.print();
    }

}