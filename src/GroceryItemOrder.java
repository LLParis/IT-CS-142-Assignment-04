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



}
