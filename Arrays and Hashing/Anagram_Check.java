import java.util.Arrays;
import java.util.HashMap;

public class Anagram_Check { // TC - O(N)
    public static void main(String[] args) {
        String s = "racecar", t = "carrace";
        System.out.println(isAnagram(s, t));
    }

    static boolean isAnagram(String s, String t) {

        int sSize = s.length();
        int tSize = t.length();
        if (sSize != tSize) {
            return false;
        }
        int[] charStorage = new int[26];
        for (int i = 0; i < sSize; i++) {
            charStorage[s.charAt(i) - 'a']++;
            charStorage[t.charAt(i) - 'a']--;
        }
        for (int i : charStorage) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}

// static boolean isAnagram(String s, String t) {
// if (s.length() == t.length()) {
// HashMap<Character, Integer> hashS = new HashMap<>();
// for (char i : s.toCharArray()) {
// if (hashS.containsKey(i)) {
// // If the character is already in the HashMap, increment its frequency
// hashS.put(i, hashS.get(i) + 1);
// } else {
// // If the character is not in the HashMap, add it with a frequency of 1
// hashS.put(i, 1);
// }
// }
// HashMap<Character, Integer> hashT = new HashMap<>();
// for (char j : t.toCharArray()) {
// if (hashT.containsKey(j)) {
// hashT.put(j, hashT.get(j) + 1);
// } else {
// hashT.put(j, 1);
// }
// }

// if (hashS.equals(hashT)) {
// return true;
// } else {
// return false;
// }
// }
// return false;
// }

// TC- O(nLogn)
// static boolean isAnagram(String s, String t) {
// if(s.length() != t.length()) return false;

// char[] sArr = s.toCharArray();
// Arrays.sort(sArr);

// char[] tArr = t.toCharArray();
// Arrays.sort(tArr);

// return Arrays.equals(sArr, tArr);
// }
// }
