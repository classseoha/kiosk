package essential.level02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();

        MenuItem menuItem01 = new MenuItem("치즈버거", 4.9, "치즈가 왕창 들어간 맛있는 햄버거");
        MenuItem menuItem02 = new MenuItem("마늘버거", 5.9, "마늘이 한움큼 들어간 맛있는 햄버거");
        MenuItem menuItem03 = new MenuItem("햄햄버거", 8.9, "햄이 겹겹이 100장 들어간 맛있는 햄버거");
        MenuItem menuItem04 = new MenuItem("치킨버거", 7.9, "두께 10cm 치킨 패티가 들어간 맛있는 햄버거");

        menuItems.add(menuItem01);
        menuItems.add(menuItem02);
        menuItems.add(menuItem03);
        menuItems.add(menuItem04);

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("=========버거도날드에 오신 것을 환영합니다.=========");
            System.out.println();
            System.out.println("[ 버거도날드 메뉴 ]");
            System.out.println();

            int count = 1;

            for (MenuItem menu : menuItems) {
                System.out.println(count + ". " + menu);
                count++;
            }

            System.out.println("5. exit");
            System.out.println();
            System.out.print("번호를 선택해 주세요: ");

            int userNum = scan.nextInt();

            switch (userNum) {
                case 1:
                    System.out.println("선택하신 버거는 <" + menuItems.get(0).getName() + "> 입니다.");
                    break;

                case 2:
                    System.out.println("선택하신 버거는 <" + menuItems.get(1).getName() + "> 입니다.");
                    break;

                case 3:
                    System.out.println("선택하신 버거는 <" + menuItems.get(2).getName() + "> 입니다.");
                    break;

                case 4:
                    System.out.println("선택하신 버거는 <" + menuItems.get(3).getName() + "> 입니다.");
                    break;

                case 5:
                    System.out.println();
                    System.out.println("안녕히 가세요.");
                    System.exit(0);
                    break;
            }

        }


    }
}
