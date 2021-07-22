package me.ujjawal.learning_testing.matrix_calculator;

public class Application {
    public static void main(String[] args) {
        Matrix2D<Integer> a = new Matrix2D<Integer>(Integer.class, new Integer[][] {
                {1,0,0},
                {0,1,0},
                {0,0,1},
        });
        Matrix2D<Integer> b = new Matrix2D<Integer>(Integer.class, new Integer[][] {
                {0,1,0},
                {0,1,0},
                {0,1,0},
        });
        System.out.println(a.add(b));
        System.out.println(a.sub(b));
        System.out.println(a.add(b).add(b).add(b));
    }
}
