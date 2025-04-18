package Lab06;

// Complete the subtractSummation method
public class Task5 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra params as per need
    public static Integer subtractSummation( BTNode root ){
        //TO DO
        if(root == null) return 0;
        return leftSum(root.left) - rightSum(root.right);
    }
    // helper methods
    private static Integer leftSum(BTNode root) {
        if(root == null) return 0;
        return (Integer)root.elem + leftSum(root.left) + leftSum(root.right);
    }
    private static Integer rightSum(BTNode root) {
        if(root == null) return 0;
        return (Integer)root.elem + rightSum(root.left) + rightSum(root.right);
    }
    //============================================================================

}