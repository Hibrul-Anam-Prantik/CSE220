package Lab04.Stack;

public class StackTasksTester {
    
    // Task 4
    // You have to write this method
    public static int diamondCount(Stack stack, String str) {
        // Consider '>' = 1, '<' = 2 and '.' = 3
        int count = 0;
        for(int i = 0; i  < str.length(); ++i) {
            char ch = str.charAt(i);
            int chNum;
            if(ch == '>') chNum = 1;
            else if(ch == '<') chNum = 2;
            else if(ch == '.') chNum = 3;
            else chNum = -1; // for invalid string inpuits
            if(chNum == 2) stack.push(chNum);
            else if(chNum == 1) {
                if(!stack.isEmpty() && stack.pop() == 2) {   // if '<' pairs with '>' , then count increasing
                    count ++;
                }  // else do nothing
            } // for chNum == 3, do nothing
        }
        return count;
    }

    // Task 5
    // You have to write this method
    public static void removeBlock(Stack stack, int n) {
        // To Do
        Stack temp = new Stack();  // to store the top most blocks, which aren't the n-th block
        for(int i = 0; i < n; ++i) { // removing the blocks and storing them in the temp, until I reach at n-th block
            if(i == n - 1) {  // permanently removing the n-th block
                stack.pop();
            }
            temp.push(stack.pop());
        }
        // re-inserting the removed blocks
        for(int i = 0; i < n; ++i) {
            stack.push(temp.pop());
        }
    }

    // Task 6
    // You have to write this method
    public static Stack conditionalReverse(Stack stack) {
        // To Do
        Stack newStack = new Stack();
        while(!stack.isEmpty()) {
            int top = stack.pop();
            if(!stack.isEmpty() && stack.peek() != top) newStack.push(top); // for the consecutive one’s.
            else {
                newStack.push(stack.pop());
            }
        }
        return newStack;
    }

    //DO NOT CHANGE THIS METHOD
    // This method is for printing the element of the stack. No need to modify anything.
    public static void printStack(Stack stack) {
        if (stack==null || stack.isEmpty()) {
            System.out.println("null");
            return; //remove this line once your're done
        }
        int elem = stack.pop();
        System.out.println("| " + elem + " |");
        printStack(stack);
        stack.push(elem);
    }

    //DO NOT CHANGE THIS METHOD
    public static void assertTest(int actual, int expected) {
        if (actual == expected) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed! Expected: " + expected + ", but got: " + actual);
        }
    }


    //DO NOT CHANGE ANYTHING IN THE DRIVER CODE
    public static void main(String[] args) {
        // This part is for checking how the Stack class and printing working
        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(5);
        s.push(1);
        s.push(9);

        printStack(s);
        System.out.println("------");
        s.pop();
        printStack(s);
        System.out.println("------");
        // Checking End Here

        System.out.println("======Task 4 Test Starts Here=======");

        System.out.println("Test 01");
        Stack stack1 = new Stack();
        String string1 = "<..><.<..>> ";
        int result1 = diamondCount(stack1, string1);
        System.out.println("Number of Diamonds: " + result1); // This should print 3
        assertTest(result1, 3);
        System.out.println("-----------------------------------------");

        System.out.println("Test 02");
        Stack stack2 = new Stack();
        String string2 = "<<<..<......<<<<....>";
        int result2 = diamondCount(stack2, string2);
        System.out.println("Number of Diamonds: " + result2); // This should print 1
        assertTest(result2, 1);
        System.out.println("-----------------------------------------");

        System.out.println("Test 03");
        Stack stack3 = new Stack();
        String string3 = ">>><...<<..>>...>...>>>";
        int result3 = diamondCount(stack3, string3);
        System.out.println("Number of Diamonds: " + result3); // This should print 3
        assertTest(result3, 3);
        System.out.println("-----------------------------------------");

        System.out.println("======Task 4 Test Ends Here=======\n");

        System.out.println("======Task 5 Test Starts Here=======");

        System.out.println("Test 01");
        Stack st1 = new Stack();
        st1.push(4);
        st1.push(19);
        st1.push(23);
        st1.push(17);
        st1.push(5);

        System.out.println("Stack:");
        printStack(st1);
        System.out.println("------");

        removeBlock(st1, 2);
        System.out.println("After Removal");
        printStack(st1);
        System.out.println("------");

        System.out.println("======================================");
        System.out.println();

        System.out.println("Test 02");
        Stack st2 = new Stack();
        st2.push(73);
        st2.push(85);
        st2.push(15);
        st2.push(41);

        System.out.println("Stack:");
        printStack(st2);
        System.out.println("------");

        removeBlock(st2, 3);
        System.out.println("After Removal");
        printStack(st2);
        System.out.println("------");

        System.out.println("======Task 5 Test Ends Here=======\n");

        System.out.println("======Task 6 Test Starts Here=======");
        System.out.println("Test 01");
        Stack st = new Stack();
        st.push(10);
        st.push(10);
        st.push(20);
        st.push(20);
        st.push(30);
        st.push(10);
        st.push(50);

        System.out.println("Stack:");
        printStack(st);
        System.out.println("------");

        Stack reversedStack = conditionalReverse(st);

        System.out.println("Conditional Reversed Stack:");
        printStack(reversedStack); // Expected: 50, 10, 30, 20, 10
        System.out.println("------");

        System.out.println("======Task 6 Test Ends Here=======");
    }
}
