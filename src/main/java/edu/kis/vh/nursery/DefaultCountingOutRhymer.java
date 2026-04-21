package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer reprezentuje podstawowy mechanizm stosu służący do przechowywania i wyliczania
 */
public class DefaultCountingOutRhymer {

    public final int STACK_SIZE = 12;
    public final int EMPTY_STACK_VAL = -1;
    public final int TOTAL_INIT_VAL = -1;
    public final int FULL_STACK_VAL = STACK_SIZE - 1;

    private final int[] numbers = new int[STACK_SIZE];

    public int total =TOTAL_INIT_VAL;


    /**
     * dodaje nowa liczbe do stosu, jest nie jest pelny
     * @param in liczba calkowita, ktora ma zostac dodana do stosu
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


    /**
     * sprawdza czy stos jest pusty
     * @return true, jeśli stos jest pusty; false w przeciwnym razie
     */
    public boolean callCheck() {
        return total == TOTAL_INIT_VAL;
    }


    /**
     * sprawdza czy stos jest pelny
     * @return true jesli stos jest pelny
     */
    public boolean isFull() {return total == FULL_STACK_VAL;}


    /**
     * zwraca ostatnio dodana wartosc
     * @return Ostatnia wartość na stosie lub -1 jesli jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_VAL;
        return numbers[total];
    }


    /**
     * usuwa i zwraca ostatnia wartosc ze stosu
     * @return ostatna wartosc ze stosu albo -1 jesli pusty
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VAL;
        return numbers[total--];
    }

}
