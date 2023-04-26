import java.util.List;

public class Sandwich {
    private final String bread;
    private final List<String> toppings;
    private final List<String> sauces;
    private double price;

    public Sandwich(String bread, List<String> toppings, List<String> sauces) {
        this.bread = bread;
        this.toppings = toppings;
        this.sauces = sauces;
        this.price = 0.0; // initialize price to zero
    }

    public String getBread() {
        return bread;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
