import java.util.*;

public class GroupAnagramsSort {
    public static void main(String[] args) {
        String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
        System.out.println(groupAnagrams(strs));
    }

    static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());

    }
}
