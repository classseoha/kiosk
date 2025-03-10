package level0405;

import essential.level02.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String productName;

    List<MenuItem> menuItems = new ArrayList<>();

    MenuItem menuItem01 = new MenuItem("치즈버거", 4.9, "치즈가 왕창 들어간 맛있는 햄버거");
    MenuItem menuItem02 = new MenuItem("마늘버거", 5.9, "마늘이 한움큼 들어간 맛있는 햄버거");
    MenuItem menuItem03 = new MenuItem("햄햄버거", 8.9, "햄이 겹겹이 100장 들어간 맛있는 햄버거");
    MenuItem menuItem04 = new MenuItem("치킨버거", 7.9, "두께 10cm 치킨 패티가 들어간 맛있는 햄버거");

    public Menu() {
        menuItems.add(menuItem01);
        menuItems.add(menuItem02);
        menuItems.add(menuItem03);
        menuItems.add(menuItem04);
    }

    public Menu(String productName) {
        this.productName = productName;
    }

    public void menuPrint() {
        int count = 1;
        for (MenuItem menu : menuItems) {
            System.out.println(count + ". " + menu);
            count++;
        }
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

}
