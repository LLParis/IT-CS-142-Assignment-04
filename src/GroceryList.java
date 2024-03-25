import java.util.*;
// This class keeps track of a grocery list of items
public class GroceryList {
    private GroceryItemOrder[] items; // Array to store grocery items
    private int numItems; // Number of items currently in the list
    private final int LIST_CAPACITY = 5;

    // Constructs a new GroceryList with no item and initializes the array
    public GroceryList() {
        this.items = new GroceryItemOrder[LIST_CAPACITY]; // Assuming a max of 5 items
        this.numItems = 0;
    }

    // Adds a GroceryItemOrder to the next available space in the array if possible
    public boolean add(GroceryItemOrder item) {
        if (numItems < items.length) { // Check if there's space left in the array
            items[numItems] = item; // Add item at the next available location
            numItems++; // Increment the number items within the array
            return true;
        } else {
            return false;
        }
    }

    // Returns the total cost of all the items in the list.
    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < numItems; i++) {
            totalCost += items[i].getCost();
        }
        return totalCost;
    }

    // Returns a single string listing all the items in the GroceryList
    // '1 of Apple'
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < numItems; i++) {
            result += items[i].toString();
            if (i < numItems - 1) {
                result += "\n";
            }
        }
        return result;
    }
}
