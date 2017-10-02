package question_finally;

public class Infinite {

    private static void work(){
        try {
            work();
        } finally {
            work();
        }
    }

    public static void main(String[] args) {
        work();
    }
}
