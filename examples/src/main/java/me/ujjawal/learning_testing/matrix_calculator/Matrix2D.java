package me.ujjawal.learning_testing.matrix_calculator;

public class Matrix2D<T extends Number> {

    private final Class<T> type;
    private final int rows;
    private final int cols;

    private T[][] matrix;

    public Matrix2D(Class<T> type, T[][]matrix) {
        if(null == matrix) {
            throw new MatrixException("Null matrix not supported");
        }
        if(0 == matrix.length) {
            throw new MatrixException("Illegal dimension rows " + matrix.length);
        }
        if(0 == matrix[0].length) {
            throw new MatrixException("Illegal dimension cols " + matrix[0].length);
        }

        this.type = type;
        this.matrix = matrix;

        this.rows = matrix.length;
        this.cols = matrix[0].length;
    }

    private void validate(Matrix2D<T> other) {
        if(null == other) {
            throw new MatrixException("other matrix is null");
        }
        if(this.type != other.type) {
            throw new MatrixException(String.format("Mismatch in types, expected %s, found %s",
                    this.type.getSimpleName(), other.type.getSimpleName()));
        }
        if(this.rows != other.rows || this.cols != other.cols) {
            throw new MatrixException(String.format("Mismatch in dimensions, expected [%d,%d], found [%d,%d]",
                    this.rows, this.cols, other.rows, other.cols));
        }
    }

    public Matrix2D<T> add(Matrix2D<T> other) {
        validate(other);
        T[][] result = (T[][])new Number[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                result[i][j] = add(this.matrix[i][j], other.matrix[i][j]);
            }
        }
        return new Matrix2D<T>(type, result);
    }

    public Matrix2D<T> sub(Matrix2D<T> other) {
        validate(other);
        T[][] result = (T[][])new Number[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                result[i][j] = sub(this.matrix[i][j], other.matrix[i][j]);
            }
        }
        return new Matrix2D<T>(type, result);
    }

    private T add(T x, T y) {
        if(Integer.class.isAssignableFrom(type)) {
            return (T)Integer.valueOf((Integer)x + (Integer) y);
        } else if(Float.class.isAssignableFrom(type)) {
            return (T)Float.valueOf((Float)x + (Float) y);
        } else {
            throw new MatrixException(String.format("Unsupported operation add for type %s", type.getSimpleName()));
        }
    }

    private T sub(T x, T y) {
        if(Integer.class.isAssignableFrom(type)) {
            return (T)Integer.valueOf((Integer)x - (Integer) y);
        } else if(Float.class.isAssignableFrom(type)) {
            return (T)Float.valueOf((Float)x - (Float) y);
        } else {
            throw new MatrixException(String.format("Unsupported operation sub for type %s", type.getSimpleName()));
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[\n");
        for(int i = 0; i < rows; i++) {
            sb.append("\t[");
            for(int j = 0; j < cols; j++) {
                sb.append(String.format("%s", matrix[i][j]));
                if(cols > j + 1) {
                    sb.append("\t");
                }
            }
            sb.append("]\n");
        }
        sb.append("]");
        return sb.toString();
    }

}
