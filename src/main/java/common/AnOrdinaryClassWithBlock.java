package common;

import shopping.OrderService;

import java.util.Calendar;

public class AnOrdinaryClassWithBlock {
    private int i;

    static int j;

    public static AnOrdinaryClass anOrdinaryClass;

    {
        i = 1;
        System.out.println("i is 1");
    }

    static {
        j = 2;
        System.out.println("j is 2");

        anOrdinaryClass = new AnOrdinaryClass();
        System.out.println("init AnOrdinaryClass()");

    }

    public AnOrdinaryClassWithBlock(int i) {
        this.i = i;
        System.out.println("constructor: i is "+i);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

}
