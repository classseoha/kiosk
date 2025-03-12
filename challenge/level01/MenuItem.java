package challenge.level01;

public class MenuItem {

    private String product;
    private double price;
    private String description;

    public MenuItem(String product, double price, String description) {
        this.product = product;
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return product + " | $" + price + " | " + description;
    }

    public String getName() {
        return product;
    }

}
