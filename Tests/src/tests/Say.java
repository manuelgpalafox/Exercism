package tests;

import java.util.Arrays;

public class Say {
    static String units[] = {
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        };

    static String tens[] = {"","","twenty",
        "thirty",
        "forty",
        "fifty",
        "sixty",
        "seventy",
        "eighty",
        "ninety"
    };

    static String hundreds[] = {
        "hundred",
        "thousand",
        "million",
        "billion"
    };

    public static void main(String[] args) {
        String numberInLetters = say(-1);
        System.out.println("Number in letters: = " + numberInLetters);

    }

    static public String say(long number) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        if (number >= 0 && number <= 1_000_000_000_000L) {
            if (number == 0) {
                return units[(int) number];
            }
            if (number < 20) {
                return units[(int) number];
            }
            if (number < 100) {
                return tens[((int) number / 10) ] + (((int) number % 10 == 0) ? "" : "-" + units[(int) number % 10]);
            }
            if (number < 1000) {
                return units[((int) number / 100)] + " " + hundreds[0] + ((number % 100) == 0 ? "" : " " + say(number % 100));
            }
            if (number < 1_000_000) {
                return say(number / 1000) + " thousand" + (number % 1000 == 0 ? "" : " " + say(number % 1000));
            }
            if (number < 1_000_000_000) {
                return say(number / 1_000_000) + " million" + (number % 1_000_000 == 0 ? "" : " " + say(number % 1_000_000));
            }

        }
        return say(number / 1_000_000_000L) + " billion" + (number % 1_000_000_000L == 0 ? "" : " " + say(number % 1_000_000_000));
    }

}
