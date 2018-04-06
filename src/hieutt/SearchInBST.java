package hieutt;

public class SearchInBST {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    //Tạo root
    BinarySearchTree.Node root;

    public Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }
        if (root.key > key) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }

    public void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.printf("%d ", root.key);
        }
    }

    public void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.printf("%d ", root.key);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

}
