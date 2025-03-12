package challenge.level02;

public enum Discount {

    meritoriousPersons(0.1), soldier(0.05), student(0.03);

    double discount;

    Discount (double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
