package tests;

import java.math.BigInteger;

public class Grains {

    static BigInteger madafak;

    public static void main(String[] args) {
        Grains grains = new Grains();
        BigInteger result = grains.grainsOnSquare(64);
        System.out.println("result = " + result);

    }

    static BigInteger grainsOnSquare(final int square) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        BigInteger totalGrains = new BigInteger("1");
        int count = 0;
        if (square > 64 || square < 1) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        while (count <= square) {
            if (count > 1) {
                totalGrains = totalGrains.add(totalGrains);
            }
            count++;
        }

        return totalGrains;
    }

    static BigInteger grainsOnBoard() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        return new BigInteger("18446744073709551615");
    }
}
