package tests;

import java.util.*;

public class SaddlePoints {

    static Set<MatrixCoordinate> saddlePoints = new HashSet<>();

    public static void main(String[] args) {
        //Crear y poblar array de ints de 5x5
        Random random = new Random();
        int array[][] = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int value = random.nextInt(1, 10);
                array[i][j] = value;
            }
        }

        //Recorrer array
        int counter = 0;

        for (int[] x : array) {
            for (int z : x) {
                if (counter <= 3) {
                    System.out.print(z + ", ");
                    ++counter;
                } else {
                    counter = 0;
                    System.out.print(z + ", " + "\n");
                }
            }
        }

        //Obtener los valor más grandes de cada renglon
        int maxValuesArray[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int maxValueOfARow = getMaximumValueOfTheRow(i, array);
            maxValuesArray[i] = maxValueOfARow;
        }

        for (int maxValueOfTheRow : maxValuesArray) {
            System.out.println("maxValueOfTheRow = " + maxValueOfTheRow);
        }

        //Obtener cuantas veces se repite un valor en determinado renglon
        int[] timesAValueRepeatsOnEachRow = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int timesAValueRepeatsInTheRow = howManyTimesAValueAppearsPerRow(i, getMaximumValueOfTheRow(i, array),
                    array);
            timesAValueRepeatsOnEachRow[i] = timesAValueRepeatsInTheRow;
        }

        for (int timesTheValueApears : timesAValueRepeatsOnEachRow) {
            System.out.println("timesTheValueApears = " + timesTheValueApears);
        }

        //Obtener el valor más grande de toda la matriz
        int valorMasGrandeDeLaMatriz = obtenerElValorMasGrandeDelArreglo(maxValuesArray);
        System.out.println("valorMasGrandeDeLaMatriz = " + valorMasGrandeDeLaMatriz);

        //Obtener los indices donde se encuentra el valor más grande de la matriz
        int[] indicesDelValorMasGrande = obtenerLosIndicesHorizontalesDondeApareceElValorMasGrande(valorMasGrandeDeLaMatriz, maxValuesArray);
        for (int x : indicesDelValorMasGrande) {
            System.out.println("x = " + x);
        }

    }

    public static int getMaximumValueOfTheRow(int rowIndex, int[][] array) {
        int maxValue = 0;
        for (int i = 0; i < array[rowIndex].length; i++) {
            if (array[rowIndex][i] > maxValue) {
                maxValue = array[rowIndex][i];
            }
        }
        return maxValue;
    }

    public static int howManyTimesAValueAppearsPerRow(int rowIndex, int maxValue, int[][] array) {
        int counter = 0;
        for (int i = 0; i < array[rowIndex].length; i++) {
            if (array[rowIndex][i] == maxValue) {
                counter++;
            }
        }
        return counter;
    }

    public static int obtenerElValorMasGrandeDelArreglo(int[] array) {
        int valorMasGrandeDeLaMatriz = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > valorMasGrandeDeLaMatriz) {
                valorMasGrandeDeLaMatriz = array[i];
            }

        }
        return valorMasGrandeDeLaMatriz;
    }

    public static int[] obtenerLosIndicesHorizontalesDondeApareceElValorMasGrande(int valorMasGrandeDeLaMatriz, int[] maxValuesOfTheRow) {
        List<Integer> indexDelValorMasGrande = new ArrayList<>();
        int[] arr;
        for (int i = 0; i < maxValuesOfTheRow.length; i++) {
            if (maxValuesOfTheRow[i] == valorMasGrandeDeLaMatriz) {
                indexDelValorMasGrande.add(i);
            }
        }
        return arr = indexDelValorMasGrande.stream().mapToInt(i -> i).toArray();
    }

    public static int[] obtenerLosIndicesVerticalesDondeApareceElValorMasGrande(int valorMasGrandeDeLaMatriz, int[] indicesDelValorMasGrande, int array[][]) {
        
        return null;
    }

    SaddlePoints(List<List<Integer>> values) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int x = 0;
        int y = 0;
        saddlePoints.add(new MatrixCoordinate(x, y));
    }

    Set<MatrixCoordinate> getSaddlePoints() {

        return null;
    }

}

class MatrixCoordinate implements Comparable<MatrixCoordinate> {

    private final int row;
    private final int col;

    MatrixCoordinate(final int row, final int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "Row: " + row + ", Column: " + col;
    }

    // Generated equals and hashcode.
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final MatrixCoordinate that = (MatrixCoordinate) o;

        return row == that.row && col == that.col;
    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + col;
        return result;
    }

    @Override
    public int compareTo(MatrixCoordinate o) {
        int rowComparison = Integer.compare(row, o.row);
        return (rowComparison == 0) ? Integer.compare(col, o.col) : rowComparison;
    }
}
