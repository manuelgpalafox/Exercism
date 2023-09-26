package tests;

public class DifferenceOfSquaresCalculator {

    public static void main(String[] args) {
        //computeSquareOfSumTo(100);
        //computeSumOfSquaresTo(100);
        int mdfk =  computeDifferenceOfSquares(100);
        System.out.println("mdfk = " + mdfk);

    }

    static int computeSquareOfSumTo(int input) {
        int sum = 0;
        while (input > 0) {
            sum = sum += input;
            --input;
        }
        return sum * sum;
    }

    static int computeSumOfSquaresTo(int input) {
        int sum = 0;
        int square = 0;
        while (input > 0) {
            square = input * input;
            sum = sum += square;
            --input;
        }
        System.out.println("Sum Of Squares = " + sum);
        return sum;

    }

    static int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
