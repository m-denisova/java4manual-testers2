package etl;

public class TestFailException extends Throwable {
    public TestFailException() {
        super();
    }

    public TestFailException(String message) {
        super(message);
    }

    public TestFailException(String message, Throwable cause) {
        super(message, cause);
    }

    public TestFailException(Throwable cause) {
        super(cause);
    }

    protected TestFailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
