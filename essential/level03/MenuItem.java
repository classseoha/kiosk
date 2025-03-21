package essential.level03;

public class MenuItem {

    private String product;
    private double price;
    private String description;

    public MenuItem(String product, double price, String description) {
        this.product = product;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return product + " | $" + price + " | " + description;
    }

    public String getName() {
        return product;
    }

}
