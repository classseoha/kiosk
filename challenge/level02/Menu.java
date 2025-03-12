package challenge.level02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Menu {

    private String productName;
    List<MenuItem> menuItems = new ArrayList<>();

    public Menu() {
        menuItems.add(new MenuItem("치즈버거", 4.9, "치즈가 왕창 들어간 맛있는 햄버거"));
        menuItems.add(new MenuItem("마늘버거", 5.9, "마늘이 한움큼 들어간 맛있는 햄버거"));
        menuItems.add(new MenuItem("햄햄버거", 8.9, "햄이 겹겹이 100장 들어간 맛있는 햄버거"));
        menuItems.add(new MenuItem("치킨버거", 7.9, "두께 10cm 치킨 패티가 들어간 맛있는 햄버거"));
    }

    public Menu(String productName) {
        this.productName = productName;
    }

    public void menuPrint() {
        IntStream.range(0, menuItems.size())
                .forEach(i -> System.out.println((i + 1) + ". " + menuItems.get(i)));
    }

    public void userChoicePrint(int num) {
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

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

}
