import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

    public Map<String, Integer> phrase(String phrase) {
        return Arrays.stream(splitPhrase(phrase))
                .collect(Collectors.groupingBy(word -> word, Collectors.summingInt(word -> 1)));
    }

    private String[] splitPhrase(String phrase) {
        return phrase.toLowerCase().split("[\\p{Punct}\\s]+");
    }

}
