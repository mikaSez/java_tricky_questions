package question_bytes;

public class Bytes {

    public static void main (String []args){
        byte b = 1;
        action(b, b);
    }


    public static void action(byte... args){
        System.out.println("bytes...");
    }

    public static void action(long one, short two){
        System.out.println("long short");
    }

    public static void action(Byte one, Byte two){
        System.out.println("BYTES");
    }

}
