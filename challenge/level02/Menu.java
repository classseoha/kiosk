package challenge.level02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Menu { // MenuItem을 관리하는 클래스

    private String burger;
    List<MenuItem> menuItems = new ArrayList<>(); // MenuItem을 담는 리스트

    public Menu() { // Menu 클래스 생성함과 동시에 MenuItem을 생성하고 리스트에 담는 생성자 메소드
        menuItems.add(new MenuItem("치즈버거", 4.9, "치즈가 왕창 들어간 맛있는 햄버거"));
        menuItems.add(new MenuItem("마늘버거", 5.9, "마늘이 한움큼 들어간 맛있는 햄버거"));
        menuItems.add(new MenuItem("햄햄버거", 8.9, "햄이 겹겹이 100장 들어간 맛있는 햄버거"));
        menuItems.add(new MenuItem("치킨버거", 7.9, "두께 10cm 치킨 패티가 들어간 맛있는 햄버거"));
    }

    public Menu(String burger) { // 생성자
        this.burger = burger;
    }

    public void menuPrint() { // MenuItems 리스트를 프린트하는 메서드
        IntStream.range(0, menuItems.size())
                .forEach(i -> System.out.println((i + 1) + ". " + menuItems.get(i)));
    }

    public void userChoicePrint(int num) { // 사용자가 선택한 메뉴를 반환해주는 메서드
        if (num == 1) {
            System.out.println("선택한 메뉴: " + menuItems.get(0));
        } else if (num == 2) {
            System.out.println("선택한 메뉴: " + menuItems.get(1));
        } else if (num == 3) {
            System.out.println("선택한 메뉴: " + menuItems.get(2));
        } else if (num == 4) {
            System.out.println("선택한 메뉴: " + menuItems.get(3));
        }
    }

    public List<MenuItem> getMenuItems() { // MenuItems 리스트 getter
        return menuItems;
    }

}
