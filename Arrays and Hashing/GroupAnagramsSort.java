import java.util.*;

public class GroupAnagramsSort {
    public static void main(String[] args) {
        String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
        System.out.println(groupAnagrams(strs));
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            anagramsMap.putIfAbsent(sortedWord, new ArrayList<>());
            anagramsMap.get(sortedWord).add(word);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}
