package tests;
import java.util.regex.Pattern;

public class Acronym {

    private StringBuilder acronym = new StringBuilder();

    public static void main(String[] args) {
        Acronym acronym2 = new Acronym ("Manuel Alejandro Gonzalez _Pala'fox_");
        String acronym3 = acronym2.get();
        
        System.out.println("acronym3 = " + acronym3);
        

    }

    Acronym(String phrase) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        String[] words = phrase.split("[[ ]*|[-]*|[_]*]+");
        for (String word : words) {
            acronym.append(word.charAt(0));
            System.out.println("word = " + word);
        }
    }

    String get() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return acronym.toString().toUpperCase();
    }

}
