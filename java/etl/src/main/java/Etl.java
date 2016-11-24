import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Etl {

   public Map<String, Integer> transform(Map<Integer, List<String>> oldScores) {
      Map<String, Integer> newScores = new HashMap<>();

      oldScores.forEach((score, letters) -> {
         newScores.putAll(transformRow(score, letters));
      });

      return newScores;
   }

   private Map<String, Integer> transformRow(Integer score, List<String> letters) {
      Map<String, Integer> newRow = new HashMap<>();
      for (String letter : letters) {
         newRow.put(letter.toLowerCase(), score);
      }

      return newRow;
   }

}
