import java.util.HashMap;

public class Anagram_Check { // TC - O(N)
    public static void main(String[] args) {
        String s = "racecar", t = "carrace";
        System.out.println(isAnagram(s, t));
    }

    static boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            HashMap<Character, Integer> hashS = new HashMap<>();
            for (char i : s.toCharArray()) {
                if (hashS.containsKey(i)) {
                    // If the character is already in the HashMap, increment its frequency
                    hashS.put(i, hashS.get(i) + 1);
                } else {
                    // If the character is not in the HashMap, add it with a frequency of 1
                    hashS.put(i, 1);
                }
            }
            HashMap<Character, Integer> hashT = new HashMap<>();
            for (char j : t.toCharArray()) {
                if (hashT.containsKey(j)) {
                    hashT.put(j, hashT.get(j) + 1);
                } else {
                    hashT.put(j, 1);
                }
            }

            if (hashS.equals(hashT)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    // TC- O(nLogn)
    // static boolean isAnagram(String s, String t) {
    // if(s.length() == t.length()){
    // char sArray[] = s.toCharArray();
    // Arrays.sort(sArray);

    // char tArray[] = t.toCharArray();
    // Arrays.sort(tArray);

    // return Arrays.equals(sArray, tArray);
    // }
    // return false;
    // }
}
