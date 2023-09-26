package tests;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        boolean answer = isArmstrongNumber(154);
        System.out.println("answer = " + answer);

    }

    static boolean isArmstrongNumber(int numberToCheck) {
        int totalSum = 0;

        for (char x : Integer.toString(numberToCheck).toCharArray()) {

            totalSum = (int) (totalSum + Math.pow(Character.getNumericValue(x), 
                    Integer.toString(numberToCheck).toCharArray().length));
        }

        return (numberToCheck == totalSum);

    }

}
