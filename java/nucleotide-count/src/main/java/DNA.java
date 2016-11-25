import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DNA {

    private String sequence;
    private Map<Character, Integer> nucleotidesCount;

    public DNA(String sequence) {
        this.sequence = sequence;
        initNucleotidesCount();
    }

    public Integer count(char nucleotide) {
        if (!Nucleotide.validate(nucleotide)) {
            throw new IllegalArgumentException();
        }

        return nucleotidesCount.get(nucleotide);
    }

    public Map<Character, Integer> nucleotideCounts() {
        return nucleotidesCount;
    }

    private void initNucleotidesCount() {
        nucleotidesCount = new HashMap<>();
        for (Nucleotide nucleotide : Nucleotide.values()) {
            nucleotidesCount.put(nucleotide.getRepresentation(), count(nucleotide));
        }
    }

    private Integer count(Nucleotide nucleotide) {
        return (int) sequence.chars().filter(element -> element == nucleotide.getRepresentation()).count();
    }

    private enum Nucleotide {
        A('A'), C('C'), G('G'), T('T');

        private Character representation;

        Nucleotide(Character representation) {
            this.representation = representation;
        }

        public Character getRepresentation() {
            return this.representation;
        }

        public static boolean validate(Character representation) {
            return Arrays.stream(values()).anyMatch(n -> n.getRepresentation() == representation);
        }
    }

}
