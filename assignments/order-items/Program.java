public class Program {
    
    public static void main(String[] args) {
        
        // Menu items   
        Item item1 = new Item("mocha", 3.25);
        Item item2 = new Item("Latte", 5.64);
        Item item3 = new Item("Drip Coffe", 4.25);
        Item item4 = new Item("Capucincino", 6.35);
        

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";
        
        // Application Simulations
        order1.items.add(item1);
        order1.total += item1.price;
        order1.ready = true;

        order2.items.add(item1);
        order2.total += item1.price;
        order2.ready = true;

        order3.items.add(item4);
        order3.total += item4.price;
        order3.ready = true;

        order4.items.add(item2);
        order4.total += item2.price * 2;
        order4.ready = true;


        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
} 

