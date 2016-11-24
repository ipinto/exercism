import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DNA {

    private String sequence;

    public DNA(String sequence) {
        this.sequence = sequence;
    }

    public Integer count(Nucleotide nucleotide) {
        return count(nucleotide.getRepresentation());
    }

    public Integer count(char nucleotide) {
        if (!Nucleotide.validate(nucleotide)) {
            throw new IllegalArgumentException();
        }

        return (int) sequence.chars().filter(element -> element == nucleotide).count();
    }

    public Map<Character, Integer> nucleotideCounts() {
        Map<Character, Integer> nucleotideHits = new HashMap<>();

        for (Nucleotide nucleotide : Nucleotide.values()) {
            nucleotideHits.put(nucleotide.getRepresentation(), count(nucleotide));
        }

        return nucleotideHits;
    }

    public enum Nucleotide {
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
