import java.util.ArrayList;

public class Order {

    // MEMBER VARIABLES
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "guest";
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }
    
    // ORDER METHODS
    
    // Create a method called addItem  that takes an Item object as an argument and adds the item to the order's items array. No need to return anything
    public void addItem(Item item){
        this.items.add(item);
    }

    // Create a method called getStatusMessage that returns a String message. If the order is ready, return "Your order is ready.", if not, return "Thank you for waiting. Your order will be ready soon."
    public String getStatusMessage(){
        if(this.ready == true){
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    // Similar to the getOrderTotal method from the Cafe Business Logic assignment, create a method called getOrderTotal that sums together each of the item's prices, and returns the total amount
    public double getOrderTotal(){
     // set total to 0
        double total = 0;
        // loop thru ArrayList Item, 
        for(Item each: this.items){
            // at each i, we will get price from 'getter' and add
            total += each.getPrice();
        }
        return total;
    }
    
     //display
    public void display(){
        System.out.printf("Customer Name: %s \n", this.name);
        for(Item each: this.items){
            System.out.println(each.getName() + " - $" + each.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
    

     // GETTERS
    public String getName(){
        return this.name;
    }

    public boolean getReady() {
        return this.ready;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

}