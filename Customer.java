import java.util.List;

// Define the Customer class and have it implement the Observer interface
public class Customer implements Observer {
    
    // Define a method for the Customer to order a sandwich
    public void orderSandwich(SandwichMaker sandwichMaker, SandwichBuilder builder) {
        // Register the Customer instance as an observer of the SandwichMaker
        sandwichMaker.registerObserver(this);
        // Make the sandwich using the specified builder
        sandwichMaker.makeSandwich(builder);
        // Remove the Customer instance as an observer of the SandwichMaker
        sandwichMaker.removeObserver(this);
    }

    // Implement the update method from the Observer interface
    @Override
    public void update(Sandwich sandwich) {
        // Print out the details of the sandwich that was just made
        System.out.println("You ordered a sandwich with the following ingredients:");
        System.out.println("Bread: " + sandwich.getBread());
        System.out.print("Toppings: ");
        List<String> toppings = sandwich.getToppings();
        for (String topping : toppings) {
            System.out.print(topping + " ");
        }
        System.out.println();
        System.out.print("Sauces: ");
        List<String> sauces = sandwich.getSauces();
        for (String sauce : sauces) {
            System.out.print(sauce + " ");
        }
        System.out.println();
    }
}
