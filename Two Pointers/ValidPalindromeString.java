public class ValidPalindromeString {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    static Boolean isPalindrome(String str) {

        String finalString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int size = finalString.length();

        if (size == 0 || size == 1) {
            return true;
        }

        for (int i = 0; i < size / 2; i++) {
            if (finalString.charAt(i) != finalString.charAt(size - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
