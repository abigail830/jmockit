package common;

public class AnOrdinaryClass {

    private static int i;

    static {
        i = 4;
    }

    public static int staticMethod() {
        return 1;
    }

    public int commonPublicMethod() {
        return 2;
    }

    public final int finalMethod() {
        return 3;
    }

    private int privateMethod() {
        return i;
    }

    public int callPrivateMethod() {
        return privateMethod();
    }
}