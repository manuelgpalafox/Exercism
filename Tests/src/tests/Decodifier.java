package tests;

import java.util.*;

public class Decodifier {

    public static void main(String[] args) {
        LinkedHashMap<String, String> codedWords = new LinkedHashMap<>();
        Random random = new Random();
        String inputText = "Este el el es es un texto de prueba esternocleidomastoideo esternocleidomastoideo";
        String textArray[] = inputText.split("\\s");

        for (String word : textArray) {
            StringBuilder builder = new StringBuilder();
            while (builder.length() < 4) {
                int digit = random.nextInt(10);
                if (digit == 0) {
                    digit = 1;
                }
                builder.append(digit);
            }

            codedWords.put(builder.toString(), word);
        }

        System.out.println(codedWords.toString());

        Set<String> keysSet = codedWords.keySet();
        Object[] keysArray = keysSet.toArray();
        System.out.println("keysArray = " + Arrays.toString(keysArray));
        StringBuilder codes = new StringBuilder();
        for (Object keysArray1 : keysArray) {
            codes.append(keysArray1);
            codes.append(" ");
        }
        
        String codedText = codes.toString().trim();
        System.out.println("inputText = " + inputText);
        System.out.println("codedText = " + codedText);
        
        String separatedCodes[] = codedText.split(" ");
        StringBuilder decodedBuilder = new StringBuilder();
        for (String code : separatedCodes) {
            decodedBuilder.append(codedWords.get(code));
            decodedBuilder.append(" ");
        }
        
        String decodedText = decodedBuilder.toString().trim();
        System.out.println("decodedText = " + decodedText);
    }
}
