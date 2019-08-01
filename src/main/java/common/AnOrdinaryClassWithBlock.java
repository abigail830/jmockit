package common;

public class AnOrdinaryClassWithBlock {
    private int i;

    public static int j;

    {
        i = 1;
        System.out.println("i is 1");
    }

    static {
        j = 2;
        System.out.println("j is 2");
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
