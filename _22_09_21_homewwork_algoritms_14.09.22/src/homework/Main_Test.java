package homework;

public class Main_Test {
    public static void main(String[] args) {
        Avl_Tree tree = new Avl_Tree();

        int[] keys = {10, 20, 30, 40, 50, 25};
        factoryTree(tree, keys);

        Util.print(tree.getRoot());
    }

    private static void factoryTree(Avl_Tree tree, int[] keys) {
        for (int key : keys) {
            Node node = new Node(key);
            tree.insert(node, key);
        }
    }
}

