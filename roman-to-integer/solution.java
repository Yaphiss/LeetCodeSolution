import java.util.HashMap;

public class Solution {
    public int romanToInteger (String x) {
        HashMap<String, int> map = new HashMap<String, int>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        String[] array = x.split("");
        if (array.length == 0) return 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            int current = map.get(array[i]);
            if (i > 0) {
                int last = map.get(array[i - 1]);
                if (current > last) {
                    num -= last * 2;
                }
            }
            num += current;
        }
        return num;
    }
}