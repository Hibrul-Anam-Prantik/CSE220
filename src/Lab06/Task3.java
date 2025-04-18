package Lab06;

// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
            //TO DO
            if(root == null) throw new NullPointerException("Root is null");;
            return levelWiseSum(root, 0);  // as argument -> sending 0 to assigning the base level which is 0
        }
        //helper method
        private static Integer levelWiseSum(BTNode root, Integer lvl) {
            if(root == null) return 0;   // if null -> adding 0 -> making no changes at all
            int sum = 0;  // using sum to store and add the elements, following the conditions
            if(lvl != 0) sum = (Integer)root.elem % lvl; // assigning the value of sum
            if(lvl == 0) sum = (Integer)root.elem; // assigning the value of sum
            sum += levelWiseSum(root.left, lvl + 1); // recursively doing the same for the left nodes
            sum += levelWiseSum(root.right, lvl + 1); //  doing the same for the right nodes after the left nodes are covered
            return sum;
        }
        //============================================================================

}
