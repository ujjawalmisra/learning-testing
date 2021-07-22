package me.ujjawal.learning_testing.matrix_calculator;

public class MatrixException extends RuntimeException {
    public MatrixException(String message) {
        super(message);
    }

    public MatrixException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
