package Lab07;

// Complete the lowestCommonAncestor method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 3 parameter first one is root
    // and second & third parameter are as 2 integers
    // You'll need to find the lowest common ancestor of them and return it
    public static Integer lowestCommonAncestor( BSTNode root, Integer x, Integer y ){
        // TO DO
        if(root == null) return null;
        if(x < root.elem && y < root.elem) {
            return lowestCommonAncestor(root.left, x, y);
        }
        else if(x > root.elem && y > root.elem) {
            return lowestCommonAncestor(root.right, x, y);
        }
        else {
            return root.elem;
        }
    }
    //==================================================

}
