package day61_exceptions_collections;

public class InsufficientBalanceException extends RuntimeException{

    /**
     * Custom Exception type
     *that extends Runtime Exception
     */
    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
