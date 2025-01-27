import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValues {
    public static void main (String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("Banana", 3);
        map.put("Apple", 5);
        map.put("Orange", 2);

        // Sort by values
        Map<String, Integer> sortedByValues = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new // Maintain insertion order
                ));

        // Display the sorted map
        sortedByValues.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}