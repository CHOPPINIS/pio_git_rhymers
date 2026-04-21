package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public final int STACK_SIZE = 12;
    public final int EMPTY_STACK_VAL = -1;
    public final int FULL_STACK_VAL = 11;

    private int[] numbers = new int[STACK_SIZE];

    public int total = EMPTY_STACK_VAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_VAL;
    }

    public boolean isFull() {
        return total == FULL_STACK_VAL;
    private int[] NUMBERS = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_VAL;
        return numbers[total];
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VAL;
        return numbers[total--];
            return -1;
        return NUMBERS[total--];
    }

}
