public class Goods extends Product {
    String description;

    Goods(String name, String description) {
        super(name);
        this.description = description;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Description: " + description);
    }
}