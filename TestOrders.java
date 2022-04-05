import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("Mocha", 3.5);
        // item1.name = "Mocha";
        // item1.price = 3.5;

        Item item2 = new Item("Latte", 3.75);
        // item2.name = "Latte";
        // item2.price = 3.75;

        Item item3 = new Item("Drip Coffee",2.5);
        // item3.name = "Drip coffee";
        // item3.price = 2.5;

        Item item4 = new Item("Capuccino", 4.75);
        // item4.name = "Capuccino";
        // item4.price = 4.75;


        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        // order1.name = "Cindhuri";

        Order order2 = new Order("Jimmy");
        // order2.name = "Jimmy";

        Order order3 = new Order("Noah");
        // order3.name = "Noah";

        Order order4 = new Order("Sam");
        // order4.name = "Sam";

    
        // Application Simulations
        order1.addItem(item1);
        order1.addItem(item4);
        System.out.println(order1.getStatusMessage());
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());
        System.out.println("--------------");
        order3.addItem(item2);
        order3.addItem(item2);
        order3.addItem(item3);
        order3.display();
        System.out.println("--------------");






    // **************From Previous Assignment**************
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);

        // test order2 updates
        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);

        // test order3 updates
        // System.out.printf("Name: %s\n", order3.name);
        // System.out.printf("Total: %s\n", order3.total);
        // System.out.printf("Ready: %s\n", order3.ready);

        // test order4 updates
        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order4.ready);

        
    }
}
