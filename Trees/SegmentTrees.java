package Trees;

public class SegmentTrees {
    Node root;
    public SegmentTrees(int[] arr) {
        //Create a tree using this arr
        this.root = constructTree(arr, 0, arr.length - 1);
    }
    private class Node {
        int data;
        int start;
        int end;
        Node left;
        Node right;
        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    private Node constructTree(int[] arr, int s, int e) {
        if (s == e) {
            //leaf node
            Node leaf = new Node(s, e);
            leaf.data = arr[s];
            return leaf;
        }
        Node node = new Node(s, e);
        int mid = s + ((e - s) / 2);
        node.left = this.constructTree(arr, s, mid);
        node.right = this.constructTree(arr, mid + 1, e);

        node.data = node.left.data + node.right.data;

        return node;
    }

    public void display() {
        display(this.root);
    }
    private void display(Node node) {
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.start + "-" + node.left.end + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.start + "-" + node.end + "] and data: " + node.data + " <= ";

        if(node.right != null) {
            str = str + "Interval=[" + node.right.start + "-" + node.right.end + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }
    public int query(int s, int e) {
        return this.query(this.root, s, e);
    }
    public int query(Node node, int s, int e) {
        if (node.start >= s && node.end <= e) {
            return node.data;
        }
        else if (node.start > e || node.end < s) {
            return 0;
        }
        else {
            return this.query(node.left, s, e) + this.query(node.right, s, e);
        }
    }
    //Update
    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }
    private int update(Node node, int index, int value) {
        if (index >= node.start && index <= node.end){
            if(index == node.start && index == node.end) {
                node.data = value;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
            }
            return node.data;
        }
        return node.data;
    }


    public static void main(String[] args) {
        int[] arr = {3, 8, 6 ,7 ,-2, -8, 4, 9};
        SegmentTrees tree = new SegmentTrees(arr);
//        tree.display();
        System.out.println(tree.query(2, 6));
        tree.update(5, 7);
    }

}
