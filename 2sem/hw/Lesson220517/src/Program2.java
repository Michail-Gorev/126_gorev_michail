public class Program2 {

    public static void main(String[] args) {
        B1();
        //B2();
        //B3();
    }

    private static void B1() {
        BTree tree = new BTree(2);
        tree.insert(51);
        tree.insert(12);
        tree.insert(45);
        tree.insert(36);
        tree.insert(89);
        tree.insert(82);
        tree.insert(46);
        tree.insert(20);
        tree.insert(28);
        tree.insert(37);
        tree.insert(17);
        tree.insert(32);
        tree.print();
    }

}