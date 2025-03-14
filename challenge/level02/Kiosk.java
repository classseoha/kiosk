package challenge.level02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kiosk { // 전반적인 입출력을 담당하는 메서드

    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();
    Order order = new Order();

    public static int cartAdd(Scanner scan) { // 장바구니 추가 시 반복되는 코드 리팩토링
        System.out.println();
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println();
        System.out.println("1. 확인 \t2. 취소");
        System.out.println();
        System.out.print("번호를 선택해 주세요: ");

        int cartNum = 0;

        try {
            cartNum = scan.nextInt();

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
            scan.nextLine();

        } catch (Exception e) {
            System.out.println();
            System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
            scan.nextLine();
        }
        return cartNum;
    }

    public void start() { // main에 입력시 입출력 시작하게 하는 메서드

        int userNum01 = 0;
        while (true) {
            System.out.println();
            System.out.println("=========버거도날드에 오신 것을 환영합니다.=========");
            System.out.println();
            System.out.println("[ MAIN MENU ]");
            System.out.println("1. Burgers \n2. Drinks \n3. Desserts \n4. Orders \n5. Cancel \n6. exit");
            System.out.println();
            System.out.print("번호를 선택해 주세요: ");

            try { // 숫자 이외의 값 입력 시 발생하는 오류 예외처리
                userNum01 = scan.nextInt();

            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                scan.nextLine();
                continue;

            } catch (Exception e) {
                System.out.println();
                System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                scan.nextLine();
                continue;
            }

            switch (userNum01) {

                case 1:
                    int userNum02 = 0;
                    boolean flag = true; // 뒤로가기 실행을 위한 flag

                    while (flag) { // flag가 false로 변환되면 실행 멈춤

                        System.out.println();
                        System.out.println("[ BURGER MENU ]");
                        menu.menuPrint();
                        System.out.println("5. 이전화면");
                        System.out.println();
                        System.out.print("번호를 선택해 주세요: ");

                        try { // 숫자 이외의 값 입력 시 발생하는 오류 예외처리
                            userNum02 = scan.nextInt();

                        } catch (InputMismatchException e) {
                            System.out.println();
                            System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                            scan.nextLine();
                            continue;

                        } catch (Exception e) {
                            System.out.println();
                            System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                            scan.nextLine();
                            continue;
                        }

                        int cartNum = 0;
                        switch (userNum02) {

                            case 1:
                                menu.userChoicePrint(1); // 사용자가 선택한 메뉴 보여주는 메서드 호출

                                cartNum = this.cartAdd(scan);
                                switch (cartNum) {
                                    case 1:
                                        order.orderAdd(userNum02); // 장바구니 리스트에 메뉴 추가하는 메서드 호출
                                        System.out.println();
                                        System.out.println("선택하신 메뉴가 장바구니에 추가되었습니다.");
                                        System.out.println();
                                        System.out.println("추가하실 메뉴를 골라주세요.");
                                        continue;

                                    case 2:
                                        System.out.println();
                                        System.out.println("취소하셨습니다. 다른 메뉴를 골라주세요.");
                                        continue;

                                    default:
                                        System.out.println();
                                        System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                                }
                                break;

                            case 2:
                                menu.userChoicePrint(2);

                                cartNum = this.cartAdd(scan);
                                switch (cartNum) {
                                    case 1:
                                        order.orderAdd(userNum02);
                                        System.out.println();
                                        System.out.println("선택하신 메뉴가 장바구니에 추가되었습니다.");
                                        System.out.println();
                                        System.out.println("추가하실 메뉴를 골라주세요.");
                                        continue;

                                    case 2:
                                        System.out.println();
                                        System.out.println("취소하셨습니다. 다른 메뉴를 골라주세요.");
                                        continue;

                                    default:
                                        System.out.println();
                                        System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                                }
                                break;

                            case 3:
                                menu.userChoicePrint(3);

                                cartNum = this.cartAdd(scan);
                                switch (cartNum) {
                                    case 1:
                                        order.orderAdd(userNum02);
                                        System.out.println();
                                        System.out.println("선택하신 메뉴가 장바구니에 추가되었습니다.");
                                        System.out.println();
                                        System.out.println("추가하실 메뉴를 골라주세요.");
                                        continue;

                                    case 2:
                                        System.out.println();
                                        System.out.println("취소하셨습니다. 다른 메뉴를 골라주세요.");
                                        continue;

                                    default:
                                        System.out.println();
                                        System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                                }
                                break;

                            case 4:
                                menu.userChoicePrint(4);

                                cartNum = this.cartAdd(scan);
                                switch (cartNum) {
                                    case 1:
                                        order.orderAdd(userNum02);
                                        System.out.println();
                                        System.out.println("선택하신 메뉴가 장바구니에 추가되었습니다.");
                                        System.out.println();
                                        System.out.println("추가하실 메뉴를 골라주세요.");
                                        continue;

                                    case 2:
                                        System.out.println();
                                        System.out.println("취소하셨습니다. 다른 메뉴를 골라주세요.");
                                        continue;

                                    default:
                                        System.out.println();
                                        System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                                }
                                break;

                            case 5:
                                flag = false; // 루프 탈출을 위한 false 변환
                                break;

                            default:
                                System.out.println();
                                System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                        }

                    }
                    break;

                case 2: // 아직 추가 되지 않은 서비스에 대한 멘트 반환
                    System.out.println();
                    System.out.println("해당 서비스는 준비중 입니다. 다른 메뉴를 선택해 주세요.");
                    break;

                case 3:
                    System.out.println();
                    System.out.println("해당 서비스는 준비중 입니다. 다른 메뉴를 선택해 주세요.");
                    break;

                case 4:
                    if (order.orderPrint()) {
                        System.out.println();
                        System.out.println("1. 주문하기 \t2. 주문수정 \t3. 돌아가기");
                        System.out.println();
                        System.out.print("번호를 선택해 주세요: ");

                        int lastChoice = 0;

                        try { // 숫자 이외의 값 입력 시 발생하는 오류 예외처리
                            lastChoice = scan.nextInt();

                        } catch (InputMismatchException e) {
                            System.out.println();
                            System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                            scan.nextLine();
                            continue;

                        } catch (Exception e) {
                            System.out.println();
                            System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                            scan.nextLine();
                            continue;
                        }

                        switch (lastChoice) {

                            case 1:
                                System.out.println();
                                System.out.println("할인 정보를 입력해 주세요.");
                                System.out.println();
                                System.out.println("1. 국가유공자 \n2. 군인 \n3. 학생 \n4. 해당없음");
                                System.out.println();
                                System.out.print("번호를 선택해 주세요: ");

                                int discountChoice = 0;

                                try { // 숫자 이외의 값 입력 시 발생하는 오류 예외처리
                                    discountChoice = scan.nextInt();

                                } catch (InputMismatchException e) {
                                    System.out.println();
                                    System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                                    scan.nextLine();
                                    continue;

                                } catch (Exception e) {
                                    System.out.println();
                                    System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                                    scan.nextLine();
                                    continue;
                                }

                                System.out.println();
                                System.out.println("주문이 완료되었습니다. 금액은 $" + order.getTotal(discountChoice) + " 입니다."); // 할인 적용한 총액 반환하는 메서드 호출
                                System.exit(0);
                                break;

                            case 2:
                                System.out.println();
                                System.out.print("취소할 메뉴의 이름을 입력해 주세요: ");

                                String cancelMenu = "";
                                cancelMenu = scan.next();

                                order.menuCancel(cancelMenu);
                                break;

                            case 3:
                                flag = false; // 루프 탈출을 위한 false 반환
                                scan.nextLine();
                                break;

                            default:
                                System.out.println();
                                System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");
                                continue;

                        }

                    }
                    break;

                case 5:
                    order.cancel();
                    break;

                case 6:
                    System.out.println();
                    System.out.println("안녕히 가세요.");
                    System.exit(0);
                    break;

                default:
                    System.out.println();
                    System.out.println("잘못 입력하셨습니다. 제대로 된 번호를 입력해 주세요.");

            }

        }

    }

}

