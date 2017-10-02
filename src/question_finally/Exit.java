package question_finally;

public class Exit {
    private static void work(){
        try {
            System.exit(1);
        } finally {
            work();
        }
    }

    public static void main(String[] args) {
        work();
    }
}
