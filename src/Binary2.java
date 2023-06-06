import java.math.BigInteger;

public class Binary2 implements IntegerInterface {
    String value;

    Binary2(String value) {
        this.value = value;
    }

    @Override
    public Binary2 add(IntegerInterface other) {
        BigInteger first = new BigInteger(value, 2);
        BigInteger second = new BigInteger(((Binary2) other).value, 2);
        return new Binary2(first.add(second).toString(2));
    }

    @Override
    public Binary2 subtract(IntegerInterface other) {
        BigInteger first = new BigInteger(value, 2);
        BigInteger second = new BigInteger(((Binary2) other).value, 2);
        return new Binary2(first.subtract(second).toString(2));
    }

    @Override
    public Binary2 multiply(IntegerInterface other) {
        BigInteger first = new BigInteger(value, 2);
        BigInteger second = new BigInteger(((Binary2) other).value, 2);
        return new Binary2(first.multiply(second).toString(2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Binary2 binary = (Binary2) obj;
        return value.equals(binary.value);
    }

    @Override
    public String toString() {
        return "Binary: " + value;
    }
}
