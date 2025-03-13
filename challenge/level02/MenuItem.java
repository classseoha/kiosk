package challenge.level02;

public class MenuItem { // 음식의 속성값을 관리하는 클래스

    private String product;
    private double price;
    private String description;

    public MenuItem(String product, double price, String description) { // 생성자
        this.product = product;
        this.price = price;
        this.description = description;
    }

    public double getPrice() { // price getter
        return this.price;
    }

    public String getName() { // name getter
        return this.product;
    }

    @Override
    public String toString() { // 리스트 출력시 String 타입으로 출력하게 하는 메서드
        return this.product + " | $" + this.price + " | " + this.description;
    }

}
