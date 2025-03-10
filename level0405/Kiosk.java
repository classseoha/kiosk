package level0405;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kiosk {

    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();


    public void start() {

        int userNum01 = 0;
        while (true) {
            System.out.println();
            System.out.println("=========버거도날드에 오신 것을 환영합니다.=========");
            System.out.println();
            System.out.println("1. Burgers \n2. Drinks \n3. Desserts \n4. exit");
            System.out.println();
            System.out.print("번호를 선택해 주세요: ");

            try {
                userNum01 = scan.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                scan.nextLine();
                continue;

            } catch (Exception e) {
                System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                scan.nextLine();
                continue;
            }

            switch (userNum01) {

                case 1:

                    int userNum02 = 0;

                    boolean flag = true;
                    while (flag) {

                        System.out.println();
                        System.out.println("[ 버거도날드 메뉴 ]");
                        System.out.println();
                        menu.menuPrint();
                        System.out.println("5. 이전화면");
                        System.out.println();
                        System.out.print("번호를 선택해 주세요: ");

                        try {
                            userNum02 = scan.nextInt();

                        } catch (InputMismatchException e) {
                            System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                            scan.nextLine();
                            continue;

                        } catch (Exception e) {
                            System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                            scan.nextLine();
                            continue;
                        }

                        switch (userNum02) {

                            case 1:
                                menu.userChoicePrint(1);
                                break;

                            case 2:
                                menu.userChoicePrint(2);
                                break;

                            case 3:
                                menu.userChoicePrint(3);
                                break;

                            case 4:
                                menu.userChoicePrint(4);
                                break;

                            case 5:
                                flag = false;
                                break;

                            default:
                                System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                        }

                    }

                case 2:
                    System.out.println("해당 서비스는 준비중 입니다. 다른 메뉴를 선택해 주세요.");
                    break;

                case 3:
                    System.out.println("해당 서비스는 준비중 입니다. 다른 메뉴를 선택해 주세요.");
                    break;

                case 4:
                    System.out.println();
                    System.out.println("안녕히 가세요.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");

            }

        }

    }

}
