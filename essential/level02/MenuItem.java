package essential.level02;

public class MenuItem {

    private String product;
    private double price;
    private String explanation;

    public MenuItem(String product, double price, String explanation) {
        this.product = product;
        this.price = price;
        this.explanation = explanation;
    }


    //    public void add() {
//        this.index = menuItems.size();
//        menuItems.add(new MenuItem(this.product, this.price, this.explanation));
//    }

//    public void printList() {
//        for (int i = 0; i < menuItems.size(); i++) {
//            System.out.print(menuItems.get(i));
//        }
//    }

}
