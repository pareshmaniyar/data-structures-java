class BinaryTreeApplication {
    public static void main(String args[]) {
        System.out.println("Binary search tree Creation");
        BinaryTree tree1 = new BinaryTree();
        tree1.root.data = "Root";
        tree1.root.left.data = "l1";
        tree1.root.right.data = "r1";

        tree1.root.left.left.data = "ll1";
        tree1.root.left.right.data = "lr1";
        tree1.root.right.left.data = "rl1";
        tree1.root.right.right.data = "rr1";

        tree1.root.left.left.left.data = "lll1";
        tree1.root.left.left.right.data = "llr1";
        tree1.root.left.right.left.data = "lrl1";
        tree1.root.left.right.right.data = "lrr1";
        tree1.root.right.left.left.data = "rll1";
        tree1.root.right.left.right.data = "rlr1";
        tree1.root.right.right.left.data = "rrl1";
        tree1.root.right.right.right.data = "rrr1";
        tree1.printBreadthFirst1();
    }
}
class BinaryTree {
    Node root;
    void printBreadthFirst1() {
        System.out.println(root.data);

        System.out.println(root.left.data);
        System.out.println(root.right.data);

        System.out.println(root.left.left.data);
        System.out.println(root.left.right.data);
        System.out.println(root.right.left.data);
        System.out.println(root.right.right.data);

        System.out.println(root.left.left.left.data);
        System.out.println(root.left.left.right.data);
        System.out.println(root.left.right.left.data);
        System.out.println(root.left.right.right.data);
        System.out.println(root.right.left.left.data);
        System.out.println(root.right.left.right.data);
        System.out.println(root.right.right.left.data);
        System.out.println(root.right.right.right.data);
    }
    void printBreadthFirst() {
        // printLevel(root);
    }
}
class Node {
    String data;
    Node left, right;
    Node (String data) {
        this.data = data;
    }
}
