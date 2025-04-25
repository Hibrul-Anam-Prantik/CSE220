package Lab07;

// Complete the sumOfLeaves method
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath( BSTNode root, Integer key ){
        // TO DO
        if(root == null) return null;
        boolean found = searchKey(root, key);
        if(found) {
            return findPath(root, key, "");
        }
        return "No Path Found";
    }
    private static Boolean searchKey(BSTNode root, Integer key) {
        if(root == null) return false; // key doesn't exist
        if(key < root.elem) {
            return searchKey(root.left, key);
        } else if(key > root.elem) {
            return searchKey(root.right, key);
        }
        return true; // found the key
    }
    private static String findPath(BSTNode root, Integer key, String path) {
        if(root == null) return null;
        path += root.elem + " "; // as i know, the key exists, so i can add the path
        if(key < root.elem) {
            return findPath(root.left, key, path);
        }
        if(key > root.elem) {
            return findPath(root.right, key,  path);
        }
        return path;
    }
    //============================================================================

}
