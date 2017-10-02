package question_initialization;
class Test {
static {
        if(true) throw new NullPointerException();
        }
        static void run(){}
}

class Main{
    public static void main(String[] args) {
        try{
            Test.run();
        } catch (Throwable e){
            Test.run();
        }
    }
}




public class ClassDefNotFound {

}
