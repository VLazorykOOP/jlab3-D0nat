import java.math.BigInteger;

public class Binary extends Integer {
    Binary(String value) {
        super(value);
    }

    @Override
    Binary add(Integer other) {
        BigInteger first = new BigInteger(value, 2);
        BigInteger second = new BigInteger(other.value, 2);
        return new Binary(first.add(second).toString(2));
    }

    @Override
    Binary subtract(Integer other) {
        BigInteger first = new BigInteger(value, 2);
        BigInteger second = new BigInteger(other.value, 2);
        return new Binary(first.subtract(second).toString(2));
    }

    @Override
    Binary multiply(Integer other) {
        BigInteger first = new BigInteger(value, 2);
        BigInteger second = new BigInteger(other.value, 2);
        return new Binary(first.multiply(second).toString(2));
    }

    @Override
    public String toString() {
        return "Binary: " + value;
    }
}
