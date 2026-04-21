package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public final int STACK_SIZE = 12;
    public final int EMPTY_STACK_VAL = -1;
    public final int TOTAL_INIT_VAL = -1;
    public final int FULL_STACK_VAL = STACK_SIZE - 1;

    private final int[] numbers = new int[STACK_SIZE];

    public int total =TOTAL_INIT_VAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_INIT_VAL;
    }

    public boolean isFull() {return total == FULL_STACK_VAL;}

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_VAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VAL;
        return numbers[total--];
    }

}
