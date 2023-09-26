package tests;

import java.util.*;
import java.util.stream.Collectors;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    static private double sidesArray[] = new double[3];

    public static void main(String[] args) {
        Triangle triange = new Triangle(4, 4, 4);
        int contador = countTimesASideRepeats(sidesArray);

        System.out.println("Counter " + contador);
        
        boolean mafak = isIsosceles();
        System.out.println("mafak = " + mafak);

    }

    static public int countTimesASideRepeats(double[] sidesArray) {
        int contador = 0;

        for (int i = 0; i < sidesArray.length - 1; i++) {
            for (int j = i + 1; j < sidesArray.length; j++) {
                if (sidesArray[i] == sidesArray[j]) {
                    contador++;
                }
            }
        }

        return contador;
    }

    static public boolean twoSidesAreBiggerThanOne(double[] sidesArray) {
        Arrays.sort(sidesArray);

        for (int i = 0; i < sidesArray.length - 1; i++) {
            for (int j = i + 1; j < sidesArray.length; j++) {
                if (sidesArray[i] + sidesArray[j] > sidesArray[sidesArray.length - 1]) {
                    return true;
                }
            }
        }

        return false;
    }

    public Triangle(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Un lado es 0");
        }
        this.side1 = side1;
        this.side1 = side2;
        this.side1 = side3;

        this.sidesArray[0] = side1;
        this.sidesArray[1] = side2;
        this.sidesArray[2] = side3;

    }

    static boolean isEquilateral() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return countTimesASideRepeats(Triangle.sidesArray) == 3;
    }

    static boolean isIsosceles() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return countTimesASideRepeats(Triangle.sidesArray) == 1;
    }

    static boolean isScalene() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return countTimesASideRepeats(Triangle.sidesArray) == 0;
    }
}
