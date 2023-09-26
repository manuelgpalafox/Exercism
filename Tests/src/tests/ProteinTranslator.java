package tests;

import java.util.*;

public class ProteinTranslator {

    public static void main(String[] args) {
        var lista = translate("UGGUGUUAUUAAUGGUUU");
        for(String text : lista){
            System.out.println("text = " + text);
        }

    }

    static List<String> translate(String rnaSequence) {
        List<String> list = new ArrayList<>();

        HashMap<String, String> hash = new HashMap<>();
        hash.put("AUG", "Methionine");
        hash.put("UUU", "Phenylalanine");
        hash.put("UUC", "Phenylalanine");
        hash.put("UUA", "Leucine");
        hash.put("UUG", "Leucine");
        hash.put("UCU", "Serine");
        hash.put("UCC", "Serine");
        hash.put("UCA", "Serine");
        hash.put("UCG", "Serine");
        hash.put("UAU", "Tyrosine");
        hash.put("UAC", "Tyrosine");
        hash.put("UGU", "Cysteine");
        hash.put("UGC", "Cysteine");
        hash.put("UGG", "Tryptophan");
        hash.put("UAA", "STOP");
        hash.put("UAG", "STOP");
        hash.put("UGA", "STOP");

        for (int i = 0; i < rnaSequence.length(); i += 3) {
            //System.out.println("hash = " + hash.get(protein.substring(i, i + 3)));
            if (hash.get(rnaSequence.substring(i, i + 3)) == "STOP") {
                break;
            } else {
                list.add(hash.get(rnaSequence.substring(i, i + 3)));
            }
        }
        return list;
    }
}
