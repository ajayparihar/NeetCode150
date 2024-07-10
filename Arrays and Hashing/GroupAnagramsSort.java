import java.util.*;

public class GroupAnagramsSort {
    public static void main(String[] args) {
        String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
        System.out.println(groupAnagrams(strs));
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String sortedWords = new String(chars);
            if (!strMap.containsKey(sortedWords)) {
                strMap.put(sortedWords, new ArrayList<>());
            }
            strMap.get(sortedWords).add(word);
        }
        return new ArrayList<>(strMap.values());

    }
}
