import java.util.HashMap;
import java.util.Map;

public class SimpleCache {
    private Map<String, String> cache = new HashMap<>();

    public String getData(String key){
        return cache.getOrDefault(key, fetchData(key));
    }

    private String fetchData(String key){
        String data = "Data for " + key;
        cache.put(key, data);
        return data;
    }

    public static void main(String[] args){
        SimpleCache cache = new SimpleCache();
        System.out.println(cache.getData("item1"));
        System.out.println(cache.getData("item1"));
    }
}