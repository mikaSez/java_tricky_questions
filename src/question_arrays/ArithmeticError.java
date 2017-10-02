package question_arrays;

public class ArithmeticError {

    public static void main(String[] args) {
        int[] arr = new int[1];
        int i = 2;
        arr[--i] = 1 / --i;

    }
}
