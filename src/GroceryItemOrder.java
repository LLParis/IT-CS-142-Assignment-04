// This class stores information about a single grocery item being ordered.
public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double pricePerUnit;

    // Constructs a new GroceryItemOrder representing the thing to pick up at the store
    // Assuming parameter values are valid
    public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Changes the quantity of items for this GroceryItemOrder
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Returns this GroceryItemOrder's name
    public String getName() {
        return name;
    }

    // Returns this GroceryItemOrder's quantity
    public int getQuantity() {
        return this.quantity;
    }

    // Returns this GroceryItemOrder's total cost
    public double getCost() {
        return (quantity * pricePerUnit);
    }

    // Returns a string representation of this GroceryItemOrder specifying the item's name and quantity.
    // '4 of yogurt'
    public String toString() {
        return getQuantity() + " of " + getName();
    }
}
