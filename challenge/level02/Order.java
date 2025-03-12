package challenge.level02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Order {

    private double total = 0;
    List<MenuItem> orders = new ArrayList<>();

    public double getTotal(int discount) {
        switch (discount) {
            case 1:
                this.total -= (this.total * Discount.meritoriousPersons.getDiscount());
                break;

            case 2:
                this.total -= (this.total * Discount.soldier.getDiscount());
                break;

            case 3:
                this.total -= (this.total * Discount.student.getDiscount());
                break;

            case 4:
                this.total = this.total;
                break;

            default:
                System.out.println();
                System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
        }

        return Math.round(this.total * 100) / 100.0;
    }

    public void orderAdd(int num) {
        Menu menu = new Menu();
        List<MenuItem> items = menu.getMenuItems();
        orders.add(menu.getMenuItems().get(num - 1));
    }

    public boolean orderPrint() {
        System.out.println();
        if (orders.isEmpty()) {
            System.out.println("장바구니가 비었습니다. 주문을 입력해 주세요.");

            return false;

        } else {
            this.total = 0;
            System.out.println("[ ORDERS ]");

            int index = 0;

            for (MenuItem i : orders) {
                System.out.println(i);
                this.total += orders.get(index).getPrice();
                index++;
            }

            System.out.println();
            System.out.println("[ TOTAL ]");
            System.out.println("$ " + Math.round(this.total * 100) / 100.0);

            return true;
        }
    }

    public void cancel() {
        orders.clear();
        System.out.println();
        System.out.println("모든 주문이 취소되었습니다.");
    }

    public void menuCancel(String cancelMenu) {
        if (cancelMenu.equals("치즈버거") || cancelMenu.equals("마늘버거") || cancelMenu.equals("햄햄버거") || cancelMenu.equals("치킨버거")) {
            orders = orders.stream()
                    .filter(menu -> !menu.getName().equals(cancelMenu))
                    .collect(Collectors.toList());

            System.out.println();
            System.out.println(cancelMenu + "가 취소되었습니다.");
        } else {
            System.out.println();
            System.out.println("잘못 입력하셨습니다.");
        }
    }

}
