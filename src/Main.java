public class Main {
    public static void main(String[] args) {
        System.out.println("\nTASK 1\n");
        Product[] products = new Product[4];
        products[0] = new Product("Product 1");
        products[1] = new Goods("Good 1", "good description");
        products[2] = new DairyProduct("Milk", "Dairy description", "1.5%");
        products[3] = new Toy("Teddy", "Toy description", "Cotton");

        for (Product product : products) {
            product.show();
        }

        System.out.println("\nTASK 2\n");
        Heximal2 heximal1 = new Heximal2("a");
        Heximal2 heximal2 = new Heximal2("f");

        System.out.println("Heximal numbers:");
        System.out.println(heximal1 + " + " + heximal2 + " = " + heximal1.add(heximal2));
        System.out.println(heximal1 + " - " + heximal2 + " = " + heximal1.subtract(heximal2));
        System.out.println(heximal1 + " * " + heximal2 + " = " + heximal1.multiply(heximal2));

        Binary2 binary1 = new Binary2("1010");
        Binary2 binary2 = new Binary2("1111");

        System.out.println("\nBinary numbers:");
        System.out.println(binary1 + " + " + binary2 + " = " + binary1.add(binary2));
        System.out.println(binary1 + " - " + binary2 + " = " + binary1.subtract(binary2));
        System.out.println(binary1 + " * " + binary2 + " = " + binary1.multiply(binary2));


        System.out.println("\nTASK 3\n");

        Heximal2 heximal11 = new Heximal2("a");
        Heximal2 heximal22 = new Heximal2("f");

        System.out.println("Heximal numbers:");
        System.out.println(heximal11 + " + " + heximal22 + " = " + heximal11.add(heximal22));
        System.out.println(heximal11 + " - " + heximal22 + " = " + heximal11.subtract(heximal22));
        System.out.println(heximal11 + " * " + heximal22 + " = " + heximal11.multiply(heximal22));

        Binary binary11 = new Binary("1010");
        Binary binary22 = new Binary("1111");

        System.out.println("\nBinary numbers:");
        System.out.println(binary11 + " + " + binary22 + " = " + binary11.add(binary22));
        System.out.println(binary11 + " - " + binary22 + " = " + binary11.subtract(binary22));
        System.out.println(binary11 + " * " + binary22 + " = " + binary11.multiply(binary22));
    }
}