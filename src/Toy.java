public class Toy extends Goods {
    String material;

    Toy(String name, String description, String material) {
        super(name, description);
        this.material = material;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Material: " + material);
    }
}