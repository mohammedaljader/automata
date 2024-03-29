public class Value {
    public static Value VOID = new Value(new Object());

    final Object value;


    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean) value;
    }

    public Integer asInteger() {
        return (Integer) value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    @Override
    public int hashCode() {

        if (value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    public Object getValue() {
        return value;
    }


    @Override
    public boolean equals(Object o) {

        if (value == o) {
            return true;
        }

        if (value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value) o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
