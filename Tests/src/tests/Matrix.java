package tests;

import java.util.*;

public class Matrix {

    static private int[][] matrix;

    public static void main(String[] args) {
        Matrix matrix2 = new Matrix("1 2\n3 4");
        int rowIndex = 1;

        int[] row = matrix2.getRow(rowIndex);
        for (int a : row) {
            System.out.println("a = " + a);
        }

        int[] column = matrix2.getColumn(rowIndex);
        for(int b : column){
            System.out.println("b = " + b);
        }
        
        for(int c : matrix[0]){
            System.out.println("c = " + c);
        }

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                System.out.print(" | " + matrix[x][y] + " | ");
            }
            System.out.println("\n----------------------------------------");

        }
    }

    Matrix(String matrixAsString) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        Matrix.matrix = Arrays.stream(matrixAsString.split("\n"))
                .map(row -> Arrays.stream(row.split("\\s"))
                .mapToInt(Integer::parseInt).toArray())
                .toArray(int[][]::new);

    }

    static int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];

    }

    static int[] getColumn(int columnNumber) {
        return Arrays.stream(matrix).mapToInt(row -> row[columnNumber - 1]).toArray();
    }
}
