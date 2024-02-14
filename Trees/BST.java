package Trees;

public class BST {
    private Node root;

    private class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value)
            node.left = insert(value, node.left);

        if (value > node.value)
            node.right = insert(value, node.right);

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null)
            return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void populate(int[] nums) {
        for (int num : nums) {
            insert(num);
        }
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null)
            return;
        System.out.println(details + node.value);
        display(node.left, "Left Child of " + node.value + ": ");
        display(node.right, "Right Child of " + node.value + ": ");
    }

    public static Node findNode(Node node, int x) {
        if (node == null)
            return null;
        if (node.value == x)
            return node;

        Node n = findNode(node.left, x);
        if (n != null)
            return n;
        return findNode(node.right, x);
    }

    public static void main(String[] args) {

    }
}
