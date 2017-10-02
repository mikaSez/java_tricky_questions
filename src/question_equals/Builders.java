package question_equals;

public class Builders {

    public static void main(String[] args) {
        String string = "hello";
        StringBuilder builder = new StringBuilder("hello");
        StringBuilder builder2 = new StringBuilder("hello");

        //System.out.println(string == builder);
        System.out.println(builder.equals(builder2));
        System.out.println(string.equals(builder));

    }
}
