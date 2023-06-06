public class DairyProduct extends Goods {
    String fatContent;

    DairyProduct(String name, String description, String fatContent) {
        super(name, description);
        this.fatContent = fatContent;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Fat content: " + fatContent);
    }
}