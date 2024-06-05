public class NegativeNumberException extends Exception {
    private int limit;

    public NegativeNumberException(String errorMessage, int limit) {
        super(errorMessage);
        this.limit = limit;
    }
}