import java.util.Arrays;

public class Anagram_Check {
    public static void main(String[] args) {
        String s = "racecar", t = "carrace";
        System.out.println(isAnagram(s, t));
    }

    static boolean isAnagram(String s, String t) {
        char sArray[] = s.toCharArray();
        Arrays.sort(sArray);
        char tArray[] = t.toCharArray();
        Arrays.sort(sArray);

        return Arrays.equals(sArray, tArray);
    }
}
