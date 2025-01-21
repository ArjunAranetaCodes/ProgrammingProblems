import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args){
        String text = "apple banana apple orange banana apple";
        Map<String, Integer> frequencyMap = new HashMap<>();

        for(String word : text.split(" ")){
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        frequencyMap.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}