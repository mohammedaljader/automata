public class Variable {
    private String string;
    private Integer number;
    private Boolean bool;

    private TYPE type;

    public Variable() {

    }

    public String getString() {
        return string;
    }

    public Integer getNumber() {
        return number;
    }

    public Boolean getBool() {
        return bool;
    }

    public TYPE getType() {
        return type;
    }


    public Variable(Boolean bool) {
        this.bool = bool;
        this.type = TYPE.BOOL;
    }

    public Variable(Integer number) {
        this.number = number;
        this.type = TYPE.NUMBER;
    }

    public Variable(String string) {
        this.string = string;
        this.type = TYPE.STRING;
    }

    public Object getValue() {
        switch (type) {
            case STRING:
                return this.string;
            case BOOL:
                return this.bool;
            default:
                return this.number;
        }
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
        this.type = TYPE.BOOL;
    }

    public void setNumber(Integer number) {
        this.number = number;
        this.type = TYPE.NUMBER;
    }

    public void setString(String string) {
        this.string = string;
        this.type = TYPE.STRING;
    }

    public void concatVariables(Variable a, Variable b) throws TypeMismatchException {
        var aType = a.getType();
        var bType = b.getType();

        if (!((aType.equals(bType) && a.type == TYPE.NUMBER) || a.type == TYPE.STRING || b.type == TYPE.STRING)) {
            throw new TypeMismatchException("Type error: Type mismatch");
        }

        if (a.type == TYPE.STRING || b.type == TYPE.STRING) {
            var x1 = a.getValue().toString();
            var x2 = b.getValue().toString();

            this.string = x1 + x2;
            this.type = TYPE.STRING;
        } else {
            this.number = a.getNumber() + b.getNumber();
            this.type = TYPE.NUMBER;
        }
    }
}