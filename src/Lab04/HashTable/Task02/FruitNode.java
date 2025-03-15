package Lab04.HashTable.Task02;

public class FruitNode {
    
    //the fruit array is the data of this node class
    //the first index should contain name of the fruit
    //the second index should contain the price of the fruit
    Object[] fruit = new Object[2];
    FruitNode next;

    public FruitNode(String name, Integer price){
        // TO DO
        fruit[0] = name;    // key
        fruit[1] = price;   // value
        next = null;
    }

}
