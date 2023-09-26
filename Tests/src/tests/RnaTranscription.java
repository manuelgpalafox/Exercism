package tests;

public class RnaTranscription {

    static StringBuilder rnaChain = new StringBuilder();

    public static void main(String[] args) {
        System.out.println("letter" + transcribe("ACGTGGTCTTAA"));

    }

    static String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        for (char character : dnaStrand.toCharArray()) {
            switch (character) {
                case 'G':
                    rnaChain.append('C');
                    break;
                case 'C':
                    rnaChain.append('G');
                    break;
                case 'T':
                    rnaChain.append('A');
                    break;
                case 'A':
                    rnaChain.append('U');
                    break;
            }
        }

        return rnaChain.toString();
    }
}
