package in.exception;

/**
 * Исключение, представляющее ситуацию с разбитой тарелкой.
 */
public class PlateBrokenException extends Exception {
    public PlateBrokenException(String message) {
        super(message);
    }

}