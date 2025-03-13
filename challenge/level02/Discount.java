package challenge.level02;

public enum Discount { // 사용자 유형별 할인율 관리하는 클래스

    meritoriousPersons(0.1), soldier(0.05), student(0.03);

    double discount;

    Discount (double discount) { // 생성자
        this.discount = discount;
    }

    public double getDiscount() { // discount getter
        return discount;
    }
}
