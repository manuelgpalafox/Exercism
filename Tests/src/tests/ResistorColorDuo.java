package tests;

public class ResistorColorDuo {

    private enum colorsEnum {
        black,
        brown,
        red,
        orange,
        yellow,
        green,
        blue,
        violet,
        grey,
        white
    }

    public static void main(String[] args) {
        String[] colors = {"grey", "violet"};
        int mafak = value(colors);
        System.out.println("mafak = " + mafak);

    }

    static int value(String[] colors) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
////        String value1 = colors[0];
////        System.out.println("value1 = " + value1);
////        String value2 = colors[1];
////        System.out.println("value2 = " + value2);
        int mafak1 = colorsEnum.valueOf(colors[0]).ordinal();
        System.out.println("mafak1 = " + mafak1);
        int mafak2 = colorsEnum.valueOf(colors[1]).ordinal();
        System.out.println("mafak2 = " + mafak2);
        String pt1 = Integer.toString(mafak1);
        String pt2 = Integer.toString(mafak2);
        String sum = pt1 + pt2;
        System.out.println("sum = " + sum);
        int valor = Integer.parseInt(sum);
        System.out.println("valor = " + valor);

        return valor;
    }

}
