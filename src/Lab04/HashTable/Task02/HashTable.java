package Lab04.HashTable.Task02;

/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
    //DO NOT change this Constructor
    public HashTable(int size) {
        this.ht = new FruitNode[size];
    }

    //This method basically prints the HashTable
    //DO NOT change this method
    public void show() {
        for (int i = 0; i < ht.length; i++) {
            System.out.print(i + " ");
            FruitNode n = ht[i];
            while (n != null) {
                System.out.print("('" + n.fruit[0] + "', " + n.fruit[1] + ") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    //you need to COMPLETE this method
    private int hashFunction(String key) {
        // TO DO
        int sum = 0;
        int i = 0; // if length is even
        if (key.length() % 2 != 0) i = 1;  // if length odd
        while (i < key.length()) {
            sum += (int)key.charAt(i);
            i += 2;
        }
        return sum % ht.length;
    }

    //you need to COMPLETE this method
    //The insert() method will create a FruitNode using name(Key) & price(value)
    //then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value) {
        // TO DO
        FruitNode fn = new FruitNode(key, value);
        int i = hashFunction(key); // this will gimme a proper index for the new FruitNode that I created
        FruitNode curr = ht[i];
        if (curr == null) {    // if the index is empty, directly inserting the FruitNode and return
            ht[i] = fn;
            return;
        }
        // updating value for similar existing key
        while (curr != null) {
            if (curr.fruit[0].equals(key)) {
                curr.fruit[1] = value;
                return;
            }
            curr = curr.next;
        }
        // descending order sorting
        curr = ht[i];
        FruitNode prev = null;
        while (curr != null && (Integer) curr.fruit[1] > value) {
            prev = curr;
            curr = curr.next;
        }
        fn.next = curr;
        if (prev != null) {
            prev.next = fn;
            return;
        }
        ht[i] = fn;
    }

}
