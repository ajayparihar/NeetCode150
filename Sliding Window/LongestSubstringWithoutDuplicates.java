import java.util.*;

public class LongestSubstringWithoutDuplicates {
    public static void main(String[] args) {
        String s = "zxyzxyz";
        System.out.println(lengthOfLongestsubstring(s));
    }

    static int lengthOfLongestsubstring(String s) {
        Set<Character> substringSet = new HashSet<>();
        int maxLength = 0, left = 0, right = 0;

        while (right < s.length()) {
            if (!substringSet.contains(s.charAt(right))) {
                substringSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, substringSet.size());
                right++;
            } else {
                substringSet.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}
