package essential.level01;

import java.util.Scanner;

public class Choice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("=========버거도날드에 오신 것을 환영합니다.=========");
            System.out.println();
            System.out.println("[ 버거도날드 메뉴 ]");
            System.out.println();
            System.out.println("1. 치즈버거 | $ 4.9 | 치즈가 왕창 들어간 맛있는 햄버거");
            System.out.println("2. 마늘버거 | $ 5.9 | 마늘이 한움큼 들어간 맛있는 햄버거");
            System.out.println("3. 햄햄버거 | $ 8.9 | 햄이 겹겹이 100장 들어간 맛있는 햄버거");
            System.out.println("4. 치킨버거 | $ 7.9 | 두께 10cm 치킨 패티가 들어간 맛있는 햄버거");
            System.out.println("5. exit");
            System.out.println();
            System.out.print("번호를 선택해 주세요: ");

            int userNum = scan.nextInt();

            switch (userNum) {
                case 1:
                    System.out.println("선택하신 버거는 <치즈버거> 입니다.");
                    break;

                case 2:
                    System.out.println("선택하신 버거는 <마늘버거> 입니다.");
                    break;

                case 3:
                    System.out.println("선택하신 버거는 <햄햄버거> 입니다.");
                    break;

                case 4:
                    System.out.println("선택하신 버거는 <치킨버거> 입니다.");
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
