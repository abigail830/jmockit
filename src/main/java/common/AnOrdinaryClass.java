package common;

public class AnOrdinaryClass {

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
        return 4;
    }

    public int callPrivateMethod() {
        return privateMethod();
    }
}