import java.util.*;
public class Rough
{
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();


        ll.addFirst(6);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(2);
        ll.addLast(1);

        ll.printLL();
//        ll.head = reverse(ll.head);
//        reverse(ll.head);  // why is it printing only the 1st Node's element ????????
        ll.printLL();
        System.out.println(isDescending(ll.head));
        ll.printLL();
    }
    public static Node reverse(Node head) {
        if(head == null || head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
//        System.out.print(head.data + " -> ");
        return newHead;
    }
    public static boolean isDescending(Node head) {
        if( head == null) throw new NullPointerException("Empty List");
        if(head.next == null) return true;
        if((int)head.next.data < (int)head.data) {
            isDescending(head.next);
            return true;
        }
        else {
            return false;
        }
    }
}
