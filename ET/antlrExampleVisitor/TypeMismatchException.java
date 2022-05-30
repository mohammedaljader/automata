public class TypeMismatchException extends Exception {
    public TypeMismatchException(String errorMessage) {
        super(errorMessage);
    }
}


class ArgumentMismatchException extends Exception {
    public ArgumentMismatchException(String errorMessage) {
        super(errorMessage);
    }
}