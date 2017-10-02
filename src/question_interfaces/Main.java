package question_interfaces;


import java.io.IOException;

interface I1{
    void copy() throws IOException, IllegalArgumentException;
}
interface I2 {
    void copy() throws InterruptedException;
}
 class A implements I1, I2{
    public void copy() {}
}

class B implements I1, I2 {
    public void copy() throws IllegalArgumentException, RuntimeException{}
}

abstract class C implements I1, I2 {
    //public void copy() throws IOException
    //public void copy() throws InterruptedException
}

public class Main {
}
