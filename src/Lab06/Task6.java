package Lab06;

// Complete the levelSum method
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra params as per need
    public static Integer levelSum( BTNode root ){
        //TO DO
        if(root == null) throw new NullPointerException("Root is null");
        return oddLevelSumMinusEvenLevelSum(root, 0);
    }
    // helper methods
    private static Integer oddLevelSumMinusEvenLevelSum(BTNode root, int lvl) {
        if(root == null) return 0;
        Integer result = 0;
        if(lvl % 2 == 0) result = -(Integer)root.elem;  // these values are to be subtracted, that's why I am using (-) sign
        else result = (Integer)root.elem;
        result += oddLevelSumMinusEvenLevelSum(root.left, lvl + 1);
        result += oddLevelSumMinusEvenLevelSum(root.right, lvl + 1);
        return result;
    }

    //============================================================================

}