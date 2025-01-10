import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String [] args){
        System.out.println(romanToInt("III")); // Output: 3
        System.out.println(romanToInt("LVIII")); // Output: 58
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s){
        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        int total = 0;
        int i = 0;

        while(i < s.length()){
            if(i + 1 < s.length() && romanToInt.get(s.charAt(i)) < romanToInt.get(s.charAt(i + 1))){
                total += romanToInt.get(s.charAt(i + 1)) - romanToInt.get(s.charAt(i));
                i += 2;
            }else{
                total += romanToInt.get(s.charAt(i));
                i += 1;
            }
        }

        return total;
    }
}