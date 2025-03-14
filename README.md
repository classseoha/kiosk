# kiosk

<H2>커밋 컨벤션<H2/>
- **Feat**: 특정 애플리케이션에 추가하는 새로운 기능
- **Fix** : 버그 수정
- **Style** : 코드 포맷팅, 코드 오타, 함수명 수정 등 스타일 수정
- **Refactor** : 코드 리팩토링(똑같은 기능인데 코드만 개선)
- **Comment** : 주석 수정 및 삭제
- **Docs** : 문서와 관련된 모든 것


<H2>1. 요구사항 정의<H2/>

<H3><< 기능 요구사항 >><H3/>

**Essential Lv1**
>- 햄버거 메뉴 출력 및 선택하기
>>- 실행시 햄버거 메뉴가 표시되고, 이후 Scanner로 숫자를 입력받아 메뉴 선택
>>- 제시된 메뉴 중 입력받은 숫자에 따라 다른 로직을 실행하는 코드 작성
>>- 반복문을 이용해서 특정 번호가 입력되면 프로그램 종료

**Essential Lv2**
>- MenuItem 클래스 생성하기
>>- 설명 : 개별 음식 항목을 관리하는 클래스, 현재는 햄버거만 관리
>>- 클래스는 `이름`, `가격`, `설명` 필드 포함
>- main 함수에서 MenuItem 클래스를 활용하여 햄버거 메뉴 출력
>>- `MenuItem` 객체 생성을 통해 `이름`, `가격`, `설명`을 세팅
>>- `List`를 선언하여 여러 `MenuItem`을 추가
>>- 반복문을 활용해 `menuItems`를 탐색하면서 하나씩 접근

**Essential Lv3**
>- Kiosk 클래스 생성하기
>>- 설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스
>>- `MenuItem`을 관리하는 리스트가 필드로 존재해야 함
>>- `main` 함수에서 관리하던 입력과 반복문 로직은 `start` 함수를 만들어 관리
>>- `List<MenuItem> menuItems` 는 `Kiosk` 클래스 생성자를 통해 값을 할당
>- 요구사항에 부합하는지 검토
>>- 콘솔에 햄버거 메뉴 출력
>>- 사용자의 입력을 받아 메뉴를 선택하거나 프로그램을 종료
>>- 유효하지 않은 입력에 대해 오류 메시지 출력
>>- `0`을 입력하면 프로그램이 ‘뒤로가기’되거나 ‘종료’됨

**Essential Lv4**
>- Menu 클래스 생성하기
>>- 설명 : MenuItem 클래스를 관리하는 클래스
    ex) 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 MenuItem을 포함
>>- `List<MenuItem>` 은 `Kiosk` 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경
>>- 여러 버거들을 포함하는 상위 개념 ‘버거’ 같은 `카테고리 이름` 필드를 가짐
>>- 메뉴 카테고리 이름을 반환하는 메서드가 구현되어야 함

**Essential Lv5**
>- 캡슐화 적용하기
>>- `MenuItem`, `Menu` 그리고 `Kiosk` 클래스의 필드에 직접 접근하지 못하도록 설정
>>- Getter와 Setter 메서드를 사용해 데이터 관리



<H3><< 향상된 기능 요구사항 >><H3/>

**Challenge Lv1**
>- 장바구니 생성 및 관리 기능
>>- 사용자가 선택한 메뉴를 장바구니에 추가할 수 있는 기능 제공
>>- 장바구니는 메뉴명, 수량, 가격 정보를 저장하며, 항목을 동적으로 추가 및 조회할 수 있어야 함
>>- 사용자가 잘못된 선택을 했을 경우 예외 처리 (ex. 유효하지 않은 메뉴 번호 입력)
>- 장바구니 출력 및 금액 계산
>>- 사용자가 결제를 시도하기 전에, 장바구니에 담긴 모든 메뉴와 총 금액 출력
>- 장바구니 담기 기능
>>- 메뉴를 클릭하면 장바구니에 추가할 지 물어보고, 입력값에 따라 “추가”, “취소” 처리
>>- 장바구니에 담은 목록 출력
>- 주문 기능
>>- 장바구니에 담긴 모든 항목 출력
>>- 합산하여 총 금액을 계산하고, “주문하기”를 누르면 장바구니 초기화

**Challenge Lv2**
>- Enum을 활용한 사용자 유형별 할인율 관리하기
>>- 사용자 유형의 Enum 정의 및 각 사용자 유형에 따른 할인율 적용 (ex. 군인, 학생, 일반인)
>>- 주문 시, 사용자 유형에 맞는 할인율 적용해 총 금액 계산
>- 람다 & 스트림을 활용한 장바구니 조회 기능
>>- 기존에 생성한 Menu의 MenuItem을 조회 할 때 스트림을 사용하여 출력하도록 수정
>>- 기존 장바구니에서 특정 메뉴 빼기 기능을 통한 스트림 활용
    (ex. 장바구니에 SmokeShack 가 들어 있다면, stream.filter를 활용하여 특정 메뉴 이름을 가진 메뉴 장바구니에서 제거)

<H3><< 인터페이스 요구사항 >><H3/>
>- 콘솔 컨트롤

<H3><< 예외 처리 방법 >><H3/>
>- catch try문 사용하여 입력값으로 인해 발생할 수 있는 오류 처리(ex. NumberFormatException, InputMismatchException 등)


<h2>2. 설계<h2/>

**클래스 다이어그램 및 데이터 흐름 설계**
>- Discount enum : 할인율 정의 및 관리
>- Menu class : MenuItem을 관리하는 클래스
>- MenuItem class : 메뉴의 속성 및 반환 메서드를 관리하는 클래스
>- Order class : 장바구니에 들어간 메뉴를 관리하는 리스트 및 메서드 관리하는 클래스
>- Kiosk class : 사용자의 입출력을 관리하는 클래스
>- Main class : 실행 클래스
