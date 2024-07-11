public class ValidPalindrome_regex {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    static Boolean isPalindrome(String str) {
        str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int size = str.length();

        if (size == 0 || size == 1)
            return true;

        for (int i = 0; i < size / 2; i++) {
            if (str.charAt(i) != str.charAt(size - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
