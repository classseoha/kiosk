package challenge.level01;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private double total = 0;
    List<MenuItem> orders = new ArrayList<>();

    public double getTotal() {
        return this.total;
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
            System.out.println("$ " + this.total);
            return true;
        }
    }

    public void cancel() {
        orders.clear();
        System.out.println();
        System.out.println("모든 주문이 취소되었습니다.");
    }

}
