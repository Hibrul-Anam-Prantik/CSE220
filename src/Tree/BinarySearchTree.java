package Tree;

public class BinarySearchTree
{
    Node root;

    // Insert an element
    public void insert(int elem) {
        root = insertRecursive(root, elem);
    }

    private Node insertRecursive(Node root, int elem) {
        if (root == null) return new Node(elem);
        if (elem < root.elem) root.left = insertRecursive(root.left, elem);
        else if (elem > root.elem) root.right = insertRecursive(root.right, elem);
        return root;
    }

    // Search for an element
    public boolean search(int elem) {
        return searchRecursive(root, elem);
    }

    private boolean searchRecursive(Node root, int elem) {
        if (root == null) return false;
        if (elem == root.elem) return true;
        if (elem < root.elem) return searchRecursive(root.left, elem);
        else return searchRecursive(root.right, elem);
    }

    // Delete using Inorder Successor
    public void deleteWithSuccessor(int elem) {
        root = deleteSuccessorRecursive(root, elem);
    }

    private Node deleteSuccessorRecursive(Node root, int elem) {
        if (root == null) return null;
        if (elem < root.elem) root.left = deleteSuccessorRecursive(root.left, elem);
        else if (elem > root.elem) root.right = deleteSuccessorRecursive(root.right, elem);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            Node successor = findMin(root.right);
            root.elem = successor.elem;
            root.right = deleteSuccessorRecursive(root.right, successor.elem);
        }
        return root;
    }

    // Delete using Inorder Predecessor
    public void deleteWithPredecessor(int elem) {
        root = deletePredecessorRecursive(root, elem);
    }

    private Node deletePredecessorRecursive(Node root, int elem) {
        if (root == null) return null;
        if (elem < root.elem) root.left = deletePredecessorRecursive(root.left, elem);
        else if (elem > root.elem) root.right = deletePredecessorRecursive(root.right, elem);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            Node predecessor = findMax(root.left);
            root.elem = predecessor.elem;
            root.left = deletePredecessorRecursive(root.left, predecessor.elem);
        }
        return root;
    }

    private Node findMin(Node root) {
        while (root.left != null) root = root.left;
        return root;
    }

    private Node findMax(Node root) {
        while (root.right != null) root = root.right;
        return root;
    }

    // Balance the BST
    public void balance() {
        int[] sorted = toSortedArray();
        root = buildBalancedBST(sorted, 0, sorted.length - 1);
    }

    private Node buildBalancedBST(int[] arr, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
        node.left = buildBalancedBST(arr, start, mid - 1);
        node.right = buildBalancedBST(arr, mid + 1, end);
        return node;
    }

    // Convert BST to sorted array using in-order traversal
    private int[] toSortedArray() {
        int size = countNodes(root);
        int[] result = new int[size];
        fillArray(root, result, new int[]{0});
        return result;
    }

    private void fillArray(Node node, int[] arr, int[] index) {
        if (node == null) return;
        fillArray(node.left, arr, index);
        arr[index[0]++] = node.elem;
        fillArray(node.right, arr, index);
    }

    private int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    // Print in-order traversal
    public void printInOrder() {
        printInOrderRecursive(root);
        System.out.println();
    }

    private void printInOrderRecursive(Node node) {
        if (node == null) return;
        printInOrderRecursive(node.left);
        System.out.print(node.elem + " ");
        printInOrderRecursive(node.right);
    }
}
class Node {
    int elem;
    Node left, right;

    Node(int data) {
        elem = data;
        left = right = null;
    }
}