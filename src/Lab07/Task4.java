package Lab07;

// Complete the sumOfLeaves method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        //TO DO
        if(root == null) return null;
        return helperMirrorSum(root.left, root.right, 0);
    }
    private static Integer helperMirrorSum(BSTNode left, BSTNode right, Integer sum) {
        if(left == null || right == null) return sum;
        sum += left.elem + right.elem;
        BSTNode ll = left.left, rr = right.right, lr = left.right, rl = right.left;
        sum = helperMirrorSum(ll, rr, sum) ;
        sum = helperMirrorSum(lr, rl, sum);
        return sum;
    }
    //===============================================================


}
