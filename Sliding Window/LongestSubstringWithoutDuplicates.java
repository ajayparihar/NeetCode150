import java.util.*;

public class LongestSubstringWithoutDuplicates {
    public static void main(String[] args) {
        String s = "zxyzxyz";
        System.out.println(lengthOfLongestsubstring(s));
    }

    static int lengthOfLongestsubstring(String s) {
        List<Character> subStringL = new ArrayList<>();
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            if (subStringL.contains(s.charAt(right))) {
                int index = subStringL.indexOf(s.charAt(right));
                subStringL.remove(index);
                if (index > 0)
                    subStringL.subList(0, index).clear();

            }
            subStringL.add(s.charAt(right));
            maxLength = Math.max(maxLength, subStringL.size());
        }
        return maxLength;
    }
}
