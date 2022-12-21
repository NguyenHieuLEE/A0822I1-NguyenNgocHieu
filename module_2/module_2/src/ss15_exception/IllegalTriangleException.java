package ss15_exception;
// exception do người dùng tự định nghĩa
public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
    }
    public IllegalTriangleException(String message) {
        super(message);
    }
}
