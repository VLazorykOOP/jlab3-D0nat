public abstract class Integer {
    String value;

    Integer(String value) {
        this.value = value;
    }

    abstract Integer add(Integer other);
    abstract Integer subtract(Integer other);
    abstract Integer multiply(Integer other);

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Integer integer = (Integer) obj;
        return value.equals(integer.value);
    }
}