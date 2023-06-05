import java.math.BigInteger;

public class Heximal extends Integer {
    Heximal(String value) {
        super(value);
    }

    @Override
    Heximal add(Integer other) {
        BigInteger first = new BigInteger(value, 16);
        BigInteger second = new BigInteger(other.value, 16);
        return new Heximal(first.add(second).toString(16));
    }

    @Override
    Heximal subtract(Integer other) {
        BigInteger first = new BigInteger(value, 16);
        BigInteger second = new BigInteger(other.value, 16);
        return new Heximal(first.subtract(second).toString(16));
    }

    @Override
    Heximal multiply(Integer other) {
        BigInteger first = new BigInteger(value, 16);
        BigInteger second = new BigInteger(other.value, 16);
        return new Heximal(first.multiply(second).toString(16));
    }

    @Override
    public String toString() {
        return "Heximal: " + value;
    }
}
