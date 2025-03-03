package Lab01;

public class Task5 {
    public static int sumDist(Node head, Integer[] distArr) {
        int sum = 0;

        for(int i = 0; i < distArr.length; ++ i) {
            int count = 0;
            Node current = head;
            while(current != null) {
                if(count == distArr[i]) {
                    sum += (int)current.elem;
                    break;
                }
                current = current.next;
                count ++;
            }
            // Adding 0 for invalid index/size of the Linked List
            if(count != distArr[i]) {  // this part can be ignored as I am totally excluding the invalid indexes while adding the elements
                sum += 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
        System.out.print("Given LinkedList: ");
        LinkedList.printLL(head1);
        System.out.print("Distance Array: ");
        Arr.print(dist);
        System.out.println("\nExpected Output: 4");
        int returnedValue = Task5.sumDist(head1, dist);
        System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}
