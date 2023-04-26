import java.util.ArrayList;
import java.util.List;

public class SandwichBuilder {
    private String bread;
    private List<String> toppings = new ArrayList<>();
    private List<String> sauces = new ArrayList<>();
    private double breadPrice;
    private double toppingPrice;
    private double saucePrice;

    public SandwichBuilder setBread(String bread, double price) {
        this.bread = bread;
        this.breadPrice = price;
        return this;
    }

    public SandwichBuilder addTopping(List<String> list, double price) {
        toppings.addAll(list);
        this.toppingPrice = price;
        return this;
    }

    public SandwichBuilder addSauce(List<String> list, double price) {
        sauces.addAll(list);
        this.saucePrice = price;
        return this;
    }

    public Sandwich build() {
        double totalPrice = breadPrice + (toppings.size() * toppingPrice) + (sauces.size() * saucePrice);
        Sandwich sandwich = new Sandwich(bread, toppings, sauces);
        sandwich.setPrice(totalPrice);
        return sandwich;
    }
}
