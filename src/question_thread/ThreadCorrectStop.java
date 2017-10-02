package question_thread;

public class ThreadCorrectStop {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> System.out.println("Thread end"));

        synchronized(thread){
            thread.start();
            thread.wait();
        }
        System.out.println("Main end");


    }
}
