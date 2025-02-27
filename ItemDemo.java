class Item {
    // Static variable to keep track of the number of objects
    static int objectCount = 0;
    
    // Instance variable
    String itemName;

    // Constructor
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++;
    }

    // Method to display item name
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }

    // Static method to display total object count
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        // Creating Item objects
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Displaying individual item names
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Displaying the total number of objects created
        Item.displayObjectCount();
    }
}
