package tree;

public class Main {
    static void main() {
        AVLTree tree = new AVLTree();
        tree.add(10);
        tree.add(20);
        tree.add(30);
        tree.add(40);
        tree.add(50);
        tree.add(25);

        tree.printInOrder();
        tree.printDepth();
    }
}
