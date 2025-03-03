package Lab02.SinglyLinkedList;

// Task04: Word Decoder
public class Task2 {

    public static Node wordDecoder( Node head ) {
        // Length calc
        int length = 0;
        Node current = head;
        while( current != null ){
            length++;
            current = current.next;
        }

        int step = 13 % length;

        Node dHead = new Node(null, null);
        Node temp = dHead;
        current = head;
        int index = 0;
        int count2 = 0;
        // Determining the Elements of the mentioned indexes
        while (current != null) {
            if (index % step == 0 && index != 0) {
                Node newNode = new Node(current.elem, null);
                temp.next = newNode;
                temp = newNode;
                count2 ++;
            }
            current = current.next;
            index++;
        }
        // reversing the List
        Node curr = dHead.next;
        Node prev = null;
        Node next;
        if(count2 <= 1) {
            return dHead;
        }
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        dHead.next = prev;
        return dHead;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
