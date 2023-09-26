package tests;

import java.util.*;

public class HandshakeCalculator {

    public static void main(String[] args) {
        Collection that = calculateHandshake(9);
        System.out.println("that = " + that);

    }

    static List<Signal> calculateHandshake(int i) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        final List<Signal> signals = new LinkedList<>();
        if ((i & 1) == 1)
            signals.add(Signal.WINK);
        if ((i & 2) == 2)
            signals.add(Signal.DOUBLE_BLINK);
        if ((i & 4) == 4)
            signals.add(Signal.CLOSE_YOUR_EYES);
        if ((i & 8) == 8)
            signals.add(Signal.JUMP);
        if ((i & 16) == 16)
            Collections.reverse(signals);
        return signals;
    }
}

enum Signal {
    WINK,
    DOUBLE_BLINK,
    CLOSE_YOUR_EYES,
    JUMP
}
