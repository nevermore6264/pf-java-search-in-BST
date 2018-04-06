public class BinarySearchTree {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    //Tạo root
    Node root;

    // Tạo Constructor
    BinarySearchTree() {
        root = null;
    }

    // gọi insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    // thêm 1 key in BST
    Node insertRec(Node root, int key) {
        /* nếu tree trống tạo thêm  a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    //gọi InorderRec()
    void inorder() {
        inorderRec(root);
    }

    // inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    // Test
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /*
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();
    }
}

