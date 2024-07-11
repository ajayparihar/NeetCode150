public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            Character start = str.charAt(i);
            Character end = str.charAt(j);

            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
