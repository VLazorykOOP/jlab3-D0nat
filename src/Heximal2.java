import java.math.BigInteger;

public class Heximal2 implements IntegerInterface {
    String value;

    Heximal2(String value) {
        this.value = value;
    }

    @Override
    public Heximal2 add(IntegerInterface other) {
        BigInteger first = new BigInteger(value, 16);
        BigInteger second = new BigInteger(((Heximal2) other).value, 16);
        return new Heximal2(first.add(second).toString(16));
    }

    @Override
    public Heximal2 subtract(IntegerInterface other) {
        BigInteger first = new BigInteger(value, 16);
        BigInteger second = new BigInteger(((Heximal2) other).value, 16);
        return new Heximal2(first.subtract(second).toString(16));
    }

    @Override
    public Heximal2 multiply(IntegerInterface other) {
        BigInteger first = new BigInteger(value, 16);
        BigInteger second = new BigInteger(((Heximal2) other).value, 16);
        return new Heximal2(first.multiply(second).toString(16));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Heximal2 heximal = (Heximal2) obj;
        return value.equals(heximal.value);
    }

    @Override
    public String toString() {
        return "Heximal: " + value;
    }
}
