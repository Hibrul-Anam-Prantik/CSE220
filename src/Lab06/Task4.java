package Lab06;

// Complete the swapChild method
public class Task4 {

    //===================================TASK#4===================================
    // This method takes only 3 parameters
    // 1st one is root of the given tree
    // 2nd one is there to help you count the levels
    // 3rd one is the level TILL which you need to swap children
    // All the changes will happen in-place
    // This method doesn't return anything
    // You can use extra helper private static methods as per need
    public static void swapChild( BTNode root, int lvl, int M ){
        if(root != null && lvl != M) {
            BTNode left = root.left, right = root.right;
            root.left = right;
            root.right = left;
            swapChild(left, lvl + 1, M);
            swapChild(right, lvl + 1, M);
        }
    }
    //============================================================================
}
