import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
        System.out.println(groupAnagrams(strs));
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String word : strs) {
            int[] charCount = new int[26];

            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int count : charCount) {
                keyBuilder.append("#").append(count);
            }

            String key = keyBuilder.toString();

            anagramsMap.putIfAbsent(key, new ArrayList<>());
            anagramsMap.get(key).add(word);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}
