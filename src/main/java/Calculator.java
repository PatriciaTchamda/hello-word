import java.util.stream.DoubleStream;

public class Calculator {
    private int a;
    private int b;

    public Calculator() {

    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static int somme(int a, int b){
        return a+b;
    }
    public static int Multi(int a,int b){
        return a*b;
    }
}
