import java.util.*;

class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

            char[] st = s.toCharArray();
            Arrays.sort(st);

            String sorted = new String(st);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
