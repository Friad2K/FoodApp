import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubwaySandwichProgram {
public static void main(String[] args) {
    SandwichMaker sandwichMaker = new SandwichMaker();
    Customer customer = new Customer();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello and Welcome to Subway Sandwich, Can i take your order please.");
    System.out.println("Types of bread:");
    System.out.println("1. Italian Herbs & Cheese");
    System.out.println("2. Wheat Bread");
    System.out.println("3. White Bread");
    System.out.println("4. Multigrain Wrap");
    System.out.print("Choose your bread (Enter a number): ");
    int breadNumber = Integer.parseInt(scanner.nextLine());

    String bread;
    switch(breadNumber) {
        case 1:
            bread = "Italian Herbs & Cheese";
            break;
        case 2:
            bread = "Wheat Bread";
            break;
        case 3:
            bread = "White Bread";
            break;
        default:
            bread = "Muligrain Wrap";
            break;
    }
    System.out.println("You chose " + bread + " bread.");
    SandwichBuilder builder = new SandwichBuilder().setBread("Italian Herbs & Cheese", 1.5);

    System.out.println("\nTypes of toppings:");
    System.out.println("1. Lettuce");
    System.out.println("2. Tomatoes");
    System.out.println("3. Onions");
    System.out.println("4. Pickles");
    System.out.println("5. Cheese");
    System.out.println("6. Turkey");
    System.out.println("7. Salami");
    System.out.println("8. Pepperoni");
    System.out.println("9. Cucumbers");
    System.out.println("10. Jalapenos");

    List<String> toppings = new ArrayList<>();
    System.out.println("Choose your toppings (Enter each number followed by space):");
    for (String topping : scanner.nextLine().split(" ")) {
        switch(topping) {
            case "1":
                toppings.add("Lettuce");
                break;
            case "2":
                toppings.add("Tomatoes");
                break;
            case "3":
                toppings.add("Onions");
                break;
            case "4":
                toppings.add("Pickles");
                break;
            case "5":
                toppings.add("Cheese");
                break;
            case "6":
                toppings.add("Turkey");
                break;
            case "7":
                toppings.add("Salami");
                break;
            case "8":
                toppings.add("Pepperoni");
                break;
            case "9":
                toppings.add("Cucumbers");
                break;
            case "10":
                toppings.add("Jalapenos");
                break;
        
        }
    }
    builder.addTopping(toppings, breadNumber);

    System.out.println("\nTypes of sauces:");
    System.out.println("1. Mayo");
    System.out.println("2. Hot Chili");
    System.out.println("3. Mustard");
    System.out.println("4. Ketchup");
    System.out.println("5. BBQ Sauce");

    List<String> sauces = new ArrayList<>();
    System.out.println("Choose your sauces (Enter each number followed by space):");
    for (String sauce : scanner.nextLine().split(" ")) {
        switch(sauce) {
            case "1":
                sauces.add("Mayo");
                break;
            case "2":
                sauces.add("Hot Chili");
                break;
            case "3":
                sauces.add("Mustard");
                break;
            case "4":
                sauces.add("Ketchup");
                break;
            case "5":
                sauces.add("BBQ Sauce");
                break;
        }
    }
    builder.addSauce(sauces, breadNumber);

    customer.orderSandwich(sandwichMaker, builder);

    scanner.close();
}
}