package tests;

import java.util.*;

public class NaturalNumber {

    public static void main(String[] args) {

    }

    static public Classification getClassification() {
        return Classification.ABUNDANT;
    }

}

enum Classification {

    DEFICIENT, PERFECT, ABUNDANT

}
