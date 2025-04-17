package Lab05;

public class Task5 {

    // Task 5A: Return max value in linked list recursively
    public static int findMax_recursive(Node head) {
        // TODO: Implement this recursively
        if(head == null) throw new NullPointerException("Empty List");
        if(head.next == null) return head.elem;
        int max = findMax_recursive(head.next);
        if(head.elem > max) return head.elem;
        return max;
    }

    // Task 5B: Sort linked list recursively using selection sort logic
    public static Node sortLL_recursive(Node head) {
        // TODO: Implement this recursively
        if(head == null) throw new NullPointerException("Empty List!");
        if(head.next == null) return head;
        Node min = findMin(head);  // helper method
        // swap
        int temp = head.elem;
        head.elem = min.elem;
        min.elem = temp;
        Node iterate = sortLL_recursive(head.next);
        head.next = iterate;   // linking the iterate node to the head
        return head;
    }
    // helper
    public static Node findMin (Node head) {
        if(head == null) throw new NullPointerException("Empty List");
        if(head.next == null) return head;
        Node min = findMin(head.next);
        if(head.elem < min.elem) return head;
        return min;
    }

    // Task 5C: Find and print duplicate values with their positions
    public static void findDup_Recursive(Node head) {
        // TODO: Implement this recursively
        iterateWithMainHead(head, head, 0);
    }
    // helper
    public static void findIndex(Node head, Node current, int i, int iSelf) {
        if(head == null || current == null) return;
        if(current.elem == head.elem && i != iSelf) {
            System.out.print(i + ", ");
        }
        findIndex(head, current.next, i + 1, iSelf);
        if(i == iSelf) System.out.print("No Duplicate");
    }
    // helper
    public static void iterateWithMainHead(Node head, Node current, int iSelf) {
        if(head == null || current == null) return;
        System.out.print(current.elem + ": ");
        findIndex(head, current,0, iSelf);
        System.out.println();
        iterateWithMainHead(head, current.next, iSelf + 1);
    }

    public static void main(String[] args) {
        // Driver code for testing Task 5 methods        
        Node head = arr2LL( new int[]{23,5,3,11,27,6} );
        System.out.println("\n Task5A: findMax_Recursive ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: "+27);
        System.out.println("Your Output: "+findMax_recursive(head));

        System.out.println("\n------------------------------");

        System.out.println("\n Task5B: sortLL_Recursive ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output:");
        System.out.println("3 -> 5 -> 6 -> 11 -> 23 -> 27 -> null");
        System.out.println("Your Output: ");
        Node sortedHead = sortLL_recursive(head);
        showLL(sortedHead);
        
        System.out.println("\n------------------------------");

        System.out.println("\n Task5C: findDup_Recursive ");
        head = arr2LL(new int[]{ 10, 22, 13, 20, 22, 23, 10, 22 });
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: ");
        System.out.println("10: 6\n22: 4, 7\n13: No Duplicate\n20: No Duplicate\n22: 1, 7\n23: No Duplicate\n10: 0\n22: 1, 4\n");
        System.out.println("Your Output: ");
        findDup_Recursive(head);

    }

    // Helper method to show the list (for driver code)
    public static void showLL(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.elem + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static Node arr2LL(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node n = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            n.next = newNode;
            n = newNode;
        }
        return head;
    }
}
