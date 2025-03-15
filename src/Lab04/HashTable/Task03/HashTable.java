package Lab04.HashTable.Task03;

/*You will have to complete the PairNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and remove()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the PairNode objects
    private PairNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new PairNode[size];
    }

    //This method is called to insert each pair from the 2D Array
	//DO NOT change this method
    public void createFromArray(Object[][] arr){
        for( Object[] x: arr )
            this.insert( x );
    }

    //The insert() method inserts the pair into proper Hashed Index
	//This method is already written including collision resolve using Forward Chaining
    //DO NOT change this method
    public void insert(Object[] keyValuePair){
        Integer key = (Integer)keyValuePair[0];
        String value = (String)keyValuePair[1];

        int idx = hashFunction(key); 
        if ( idx==-1 ) {
            //leaving it blank
        } else if ( ht[idx]==null ){
            ht[idx] = new PairNode(key, value);
        } else {
            PairNode pair = new PairNode(key, value);
            pair.next = ht[idx];
            ht[idx] = pair;
        }
    }

    //This method basically prints the HashTable
    //DO NOT change this method
    public void printHashTable(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+": " );
            PairNode pNode = ht[i];
            if( pNode==null ) System.out.println("null");
            while (pNode!=null){
                System.out.print("("+pNode.key+", '"+pNode.value+"') --> ");
                if (pNode.next==null) System.out.println("null");
                pNode = pNode.next;
            }
        }
    }

	//you need to COMPLETE this method
    //Complete this method first the write remove
    private int hashFunction( Integer key ){
        // TO DO
        int size = ht.length;
        int index = (key + 3) % size;
        return index;
        // return (key+3)%ht.length;  as simple as that; didn't use 1 single line, cz it was kinda short to me
    }


	//you need to COMPLETE this method
    //before writing remove you should complete hashFunction
    public void remove( Integer key ){
        // TO DO
        int i = hashFunction(key);
        PairNode curr = ht[i];
        if(curr.next == null &&  curr.key.equals(key)) {
            ht[i] = null; // if there was only one node
            return;
        }
        PairNode prev = null;
        while(curr != null) {
            if(curr.key.equals(key)) {
                if(prev == null) {
                    ht[i] = curr.next;
                    return;
                }
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

}