import java.util.Map;
import java.util.TreeMap;

public class SortMapBykeys{
    public static void main(String[] args){
        Map<String, Integer> map = new TreeMap<>();
        map.put("Banana", 3);
        map.put("Apple", 1);
        map.put("Orange", 2);

        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}