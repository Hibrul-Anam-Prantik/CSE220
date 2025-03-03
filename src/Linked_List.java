public class Linked_List
{
    Node head;

    public Linked_List() {
        this.head = null;
    }

    // Add First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add Last
    public void addLast(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete Last
    public void deleteLast() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // Print List
    public void printLL() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.printLL();
        System.out.println("============================");
        list.addFirst("is ");
        list.printLL();
        System.out.println("============================");
        list.addLast("a ");
        list.printLL();
        System.out.println("============================");
        list.addFirst("This ");
        list.printLL();
        System.out.println("============================");
        list.addLast("Linked List.");
        list.printLL();
        System.out.println("============================");
    }
}
