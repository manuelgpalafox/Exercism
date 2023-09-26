package tests;

public class Darts {

    public static void main(String[] args) {
        int mafak = score(0.5, -4);
        System.out.println("mafak = " + mafak);
    }

    static int score(double xOfDart, double yOfDart) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        double distance = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
        return distance <= 1  ? 10
             : distance <= 5  ? 5
             : distance <= 10 ? 1
             : 0;
    }
}
