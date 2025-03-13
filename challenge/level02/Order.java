package challenge.level02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Order { // 장바구니에 담긴 음식 리스트 관리하는 클래스

    private double total = 0;
    List<MenuItem> orders = new ArrayList<>();

    public double getTotal(int discount) { // 할인율을 적용한 최종 금액 계산해주는 메서드
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

        return Math.round(this.total * 100) / 100.0; // 최종 금액을 소수점 세번째에서 반올림하게끔 설정
    }

    public void orderAdd(int num) { // 사용자가 주문 추가하면 orders 리스트에 담는 메서드
        Menu menu = new Menu();
        List<MenuItem> items = menu.getMenuItems();
        orders.add(menu.getMenuItems().get(num - 1));
    }

    public boolean orderPrint() { // 사용자가 장바구니 확인 시 장바구니 내 물품 내역 및 총 금액을 보여주는 메서드
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

    public void cancel() { // 사용자가 주문 전체 취소 시 orders 리스트를 비워주는 메서드
        orders.clear();
        System.out.println();
        System.out.println("모든 주문이 취소되었습니다.");
    }

    public void menuCancel(String cancelMenu) { // 사용자가 주문 취소 물품 입력 시 비교하여 해당 내역 리스트에서 삭제해주는 메서드
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
